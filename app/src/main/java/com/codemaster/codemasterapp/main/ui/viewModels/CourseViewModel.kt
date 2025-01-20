package com.codemaster.codemasterapp.main.ui.viewModels

import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.codemaster.codemasterapp.main.AllCourses.CLangCourse.CLangCourseProvider
import com.codemaster.codemasterapp.main.AllCourses.CppCourse.CPPCourseProvider
import com.codemaster.codemasterapp.main.AllCourses.DSACourse.DSACourseProvider
import com.codemaster.codemasterapp.main.AllCourses.PythonCourse.PythonBeginnerCourse
import com.codemaster.codemasterapp.main.AllCourses.PythonCourse.PythonCourseProvider
import com.codemaster.codemasterapp.main.AllCourses.PythonCourse.PythonIntermediateCourse
import com.codemaster.codemasterapp.main.DataBase.continueLearningprogressDB.UserLearningProgressRepository
import com.codemaster.codemasterapp.main.DataBase.lessonStatusDB.LessonStatusEntity
import com.codemaster.codemasterapp.main.DataBase.lessonStatusDB.LessonStatusRepo
import com.codemaster.codemasterapp.main.data.Course
import com.codemaster.codemasterapp.main.data.LearningProgress
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class CourseViewModel @Inject constructor(
    private val sharedPreferences: SharedPreferences,
    private val gson: Gson,
    private val lessonStatusRepository: LessonStatusRepo,
    private val learningProgressRepository: UserLearningProgressRepository
) : ViewModel() {



    // List of courses to display
    val courses: List<Course> = AllCoursesProvider()


//    private val _selectedCourse = MutableStateFlow<Course?>(null)
//    private val _selectedStage = MutableStateFlow<Stage?>(null)

    private val _selectedCourse = MutableStateFlow<Course?>(
        Course(
            id = "python_course",
            name = "Python",
            stages = listOf(
                PythonBeginnerCourse(),
                PythonIntermediateCourse(),

            )

        )
    )


    private val _selectedStage = MutableStateFlow<Stage?>(
        Stage(
            id = "python_beginner_stage",
            title = "Beginner",
            lessons = PythonBeginnerCourse().lessons
        )
    )


    private val _selectedLesson = MutableStateFlow<Lesson?>(null)
    private val _selectedSubLessonIndex = MutableStateFlow<Int>(0)
    private val _selectedLessonIndex = MutableStateFlow<Int>(0)

    // Exposed state for UI binding
    val selectedCourse: StateFlow<Course?> get() = _selectedCourse
    val selectedStage: StateFlow<Stage?> get() = _selectedStage
    val selectedLesson: StateFlow<Lesson?> get() = _selectedLesson
    val selectedSubLessonIndex: StateFlow<Int> get() = _selectedSubLessonIndex
    val selectedLessonIndex: StateFlow<Int> get() = _selectedLessonIndex

    // MutableStateFlow to hold the lesson statuses
    private val _lessonCompletionStatus = MutableStateFlow<Map<String, LessonStatus>>(emptyMap())
    val lessonCompletionStatus: StateFlow<Map<String, LessonStatus>> = _lessonCompletionStatus

    //Continue Learning from last saved
    private val _lastSavedProgress = MutableStateFlow<LearningProgress?>(null)
    val lastSavedProgress: StateFlow<LearningProgress?> = _lastSavedProgress

    //Points collection
    private val _points = MutableStateFlow<Map<String, Int>>(emptyMap()) // Track points
    val points: StateFlow<Map<String, Int>> = _points

    init {
        // Load all statuses and last saved progress
        loadAllLessonStatuses()
        loadLastSavedProgress()

//        // Default selection
//        val dsaCourse = courses.find { it.id == "dsa_course" }
//        _selectedCourse.value = dsaCourse
//        _selectedStage.value = dsaCourse?.stages?.find { it.id == "c_beginner_stage" }
    }

    // Functions to select course, stage, lesson, and sub-lesson
    fun selectLanguage(course: Course) {
        _selectedCourse.value = course
    }

    fun selectStage(stage: Stage) {
        _selectedStage.value = stage
    }

    fun selectLesson(lesson: Lesson) {
        _selectedLesson.value = lesson
    }

    fun selectSubLessonIndex(index: Int) {
        _selectedSubLessonIndex.value = index
    }

    fun selectLessonIndex(index: Int) {
        _selectedLessonIndex.value = index
    }

    // Load all lesson statuses
    fun loadAllLessonStatuses() {
        viewModelScope.launch {
            val statuses = lessonStatusRepository.getAllLessonStatuses()
            _lessonCompletionStatus.value = statuses.associate { it.id to it.status }
            statuses.forEach {
                Log.d("status", "${it.id} ${it.status}")
            }
        }
    }

    fun addOrUpdateLessonStatus(lessonId: String, status: LessonStatus) {
        viewModelScope.launch {
            lessonStatusRepository.addOrUpdateLessonStatus(LessonStatusEntity(lessonId, status))

            // Update the MutableStateFlow directly
            _lessonCompletionStatus.update { currentMap ->
                currentMap.toMutableMap().apply {
                    put(lessonId, status)
                }
            }
        }
    }


    // Function to mark a sub-lesson as completed and update lesson status
    fun markSubLessonAsCompleted(subLessonId: String, lessonId: String) {
        val updatedCompletionStatus =
            _lessonCompletionStatus.value.toMutableMap()

        // Mark the sub-lesson as completed if not already completed
        if (updatedCompletionStatus[subLessonId] != LessonStatus.COMPLETED) {
            updatedCompletionStatus[subLessonId] = LessonStatus.COMPLETED
            _lessonCompletionStatus.value = updatedCompletionStatus
//            Log.d("SubLesson Completed", subLessonId)

            // Now process the lesson-level completion and unlock next lesson/sub-lesson
            val lesson = findLessonById(lessonId)
            lesson?.let {
                // Check if all sub-lessons of this lesson are completed
                val allSubLessonsCompleted = it.lessonContents.all { subLesson ->
                    updatedCompletionStatus[subLesson.id] == LessonStatus.COMPLETED
                }

                // If all sub-lessons are completed, mark the lesson as completed
                if (allSubLessonsCompleted && updatedCompletionStatus[lesson.id] != LessonStatus.COMPLETED) {
                    updatedCompletionStatus[lesson.id] = LessonStatus.COMPLETED
                    _lessonCompletionStatus.value = updatedCompletionStatus
                    Log.d("Lesson Completed", lesson.id)

                    // Unlock next lesson if available
                    unlockNextLesson(it)
                }

                // Mark the next sub-lesson as active (if not on the last sub-lesson)
                val currentSubLessonIndex = it.lessonContents.indexOfFirst { subLesson ->
                    subLesson.id == subLessonId
                }

                if (currentSubLessonIndex != -1 && currentSubLessonIndex < it.lessonContents.size - 1) {
                    // Get the next sub-lesson
                    val nextSubLesson = it.lessonContents[currentSubLessonIndex + 1]

                    // Mark the next sub-lesson as active (not completed yet)
                    if (updatedCompletionStatus[nextSubLesson.id] != LessonStatus.COMPLETED) {
                        updatedCompletionStatus[nextSubLesson.id] = LessonStatus.ACTIVE
                        _lessonCompletionStatus.value = updatedCompletionStatus
//                        Log.d("Next Sub-Lesson Active", nextSubLesson.id)
                        // Save the updated status to the database (just sub-lesson status)
                        viewModelScope.launch {
                            saveLessonCompletionStatusToDb(nextSubLesson.id, LessonStatus.ACTIVE)
                        }
                    }
                }
            }
        }

        // Save the updated status to the database (just sub-lesson status)
        viewModelScope.launch {
            saveLessonCompletionStatusToDb(subLessonId, LessonStatus.COMPLETED)
        }
    }

    // Function to unlock the next lesson
    private fun unlockNextLesson(currentLesson: Lesson) {
        val stage = findStageByLesson(currentLesson)
        val currentLessonIndex = stage?.lessons?.indexOf(currentLesson) ?: -1

        if (currentLessonIndex >= 0 && currentLessonIndex < (stage?.lessons?.size?.minus(1) ?: 0)) {
            val nextLesson = stage?.lessons?.get(currentLessonIndex + 1)
            if (nextLesson != null && _lessonCompletionStatus.value.get(nextLesson.id) != LessonStatus.ACTIVE) {
                // Unlock the next lesson
                val updatedCompletionStatus = _lessonCompletionStatus.value.toMutableMap()
                updatedCompletionStatus[nextLesson.id] = LessonStatus.ACTIVE
                _lessonCompletionStatus.value = updatedCompletionStatus


                // Unlock the next sub-lesson if applicable
                unlockNextSubLesson(nextLesson = nextLesson)

                // Save the updated sub-lesson status to the database
                viewModelScope.launch {
                    saveLessonCompletionStatusToDb(nextLesson.id, LessonStatus.ACTIVE)
                }
            }
        }
    }

    // Function to unlock the next sub-lesson
    private fun unlockNextSubLesson(nextLesson: Lesson) {
        val nextSubLesson = nextLesson.lessonContents[0]
        val updatedCompletionStatus = _lessonCompletionStatus.value.toMutableMap()

        if (updatedCompletionStatus[nextSubLesson.id].toString() == "null"
            || updatedCompletionStatus[nextSubLesson.id] == LessonStatus.LOCKED
        ) {
            updatedCompletionStatus[nextSubLesson.id] = LessonStatus.ACTIVE
            _lessonCompletionStatus.value = updatedCompletionStatus
        }

        // Save the updated sub-lesson status to the database
        viewModelScope.launch {
            saveLessonCompletionStatusToDb(nextSubLesson.id, LessonStatus.ACTIVE)
        }
    }

    // Function to find the current lesson (returns Lesson or null)
    private fun findLessonById(lessonId: String): Lesson? {
        // Replace with your hardcoded courses and stages logic
        return courses.flatMap { it.stages }.flatMap { it.lessons }
            .firstOrNull { it.id == lessonId }
    }

    // Function to find the stage by the current lesson
    private fun findStageByLesson(currentLesson: Lesson): Stage? {
        return courses.flatMap { it.stages }
            .firstOrNull { stage -> stage.lessons.contains(currentLesson) }
    }

    // Function to save lesson status to the database (only sub-lesson status)
    private suspend fun saveLessonCompletionStatusToDb(subLessonId: String, status: LessonStatus) {
        Log.d("DB Save", "Saving $subLessonId with status $status")
        val lessonStatusEntity = LessonStatusEntity(subLessonId, status)
        lessonStatusRepository.addOrUpdateLessonStatus(lessonStatusEntity)
        Log.d("DB Save", "Status saved for sub-lesson $subLessonId")
    }


    // Last saved learning
    fun saveProgress(progress: LearningProgress) {
        viewModelScope.launch {
            learningProgressRepository.saveProgress(progress)
        }
    }

    // Load latest progress
    fun loadLastSavedProgress() {
        viewModelScope.launch {
            _lastSavedProgress.value = learningProgressRepository.loadLastSavedProgress()
        }
    }

    // get each language last saved progress
    suspend fun loadLastSavedProgressForLanguage(courseId: String): LearningProgress? {
        return learningProgressRepository.loadProgressForCourse(courseId)
    }

    // Get stage name for each course
    suspend fun loadStageNamesForCourses(courseIds: List<String>): Map<String, String?> {
        return courseIds.associateWith { courseId ->
            learningProgressRepository.getLastStageNameForCourse(courseId)
        }
    }


}


//Sample course
fun AllCoursesProvider(): List<Course> {
    val cCourse = CLangCourseProvider()
    val cppCourse = CPPCourseProvider()
    val pythonCourse = PythonCourseProvider()
    val dsaCourse = DSACourseProvider()

    return listOf(
        cCourse.getCompleteCLangCourse(),
        cppCourse.getCompleteCPPCourse(),
        pythonCourse.getCompletePythonCourse(),
        dsaCourse.getCompleteDSACourse()

    )
}



