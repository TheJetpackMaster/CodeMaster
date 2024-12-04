package com.codemaster.codemasterapp.main.ui.viewModels

import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.codemaster.codemasterapp.main.AllCourses.CLangCourseProvider
import com.codemaster.codemasterapp.main.AllCourses.CppCourse.CPPCourseProvider
import com.codemaster.codemasterapp.main.AllCourses.CppCourse.cppAdvancedCourse
import com.codemaster.codemasterapp.main.AllCourses.CppCourse.cppBeginnerCourse
import com.codemaster.codemasterapp.main.AllCourses.CppCourse.cppIntermediateCourse
import com.codemaster.codemasterapp.main.data.Course
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class CourseViewModel @Inject constructor(
    private val sharedPreferences: SharedPreferences,
    private val gson: Gson
) : ViewModel() {

    // List of courses to display
    val courses: List<Course> = createBeginnerCProgrammingCourse()

//    val cCourseProvider = CLangCourseProvider()
//    // Mutable state for selected course, stage, lesson, and sub-lesson
//    private val _selectedCourse = MutableStateFlow<Course?>(
//        Course(
//            id = "c_course",
//            language = "C",
//            stages = listOf(
//               cCourseProvider.CBeginnerCourse(),
//                cCourseProvider.CIntermediateCourse(),
//                cCourseProvider.CAdvancedCourse(),
//                cCourseProvider.CExpertCourse()
//            )
//        )
//    )
//
//    private val _selectedStage = MutableStateFlow<Stage?>(
//        Stage(
//            id = "c_beginner_stage",
//            title = "Beginner",
//            lessons =
//            cCourseProvider.CBeginnerCourse().lessons,
//        )
//    )

    val cPPCourseProvider = CPPCourseProvider()
    // Mutable state for selected course, stage, lesson, and sub-lesson
    private val _selectedCourse = MutableStateFlow<Course?>(
        Course(
            id = "cpp_course",
            language = "C++",
            stages = listOf(
                cppBeginnerCourse(),
                cppIntermediateCourse(),
                cppAdvancedCourse(),
                cPPCourseProvider.CPPExpertCourse()
            )
        )
    )
    private val _selectedStage = MutableStateFlow<Stage?>(
        Stage(
            id = "cpp_beginner_stage",
            title = "Beginner",
            lessons = cppBeginnerCourse().lessons,
        )
    )
//
//    private val _selectedCourse = MutableStateFlow<Course?>(null)
//    private val _selectedStage = MutableStateFlow<Stage?>(null)


    private val _selectedLesson = MutableStateFlow<Lesson?>(null)
    private val _selectedSubLessonIndex = MutableStateFlow<Int>(0)
    private val _selectedLessonIndex  = MutableStateFlow<Int>(0)

    // Exposed state for UI binding
    val selectedCourse: StateFlow<Course?> get() = _selectedCourse
    val selectedStage: StateFlow<Stage?> get() = _selectedStage
    val selectedLesson: StateFlow<Lesson?> get() = _selectedLesson
    val selectedSubLessonIndex: StateFlow<Int> get() = _selectedSubLessonIndex
    val selectedLessonIndex: StateFlow<Int> get() = _selectedLessonIndex

    // Map to track lesson and sub-lesson completion status
    private val _lessonCompletionStatus = MutableStateFlow<Map<String, LessonStatus>>(emptyMap())
    val lessonCompletionStatus: StateFlow<Map<String, LessonStatus>> = _lessonCompletionStatus

    //Points collection
    private val _points = MutableStateFlow<Map<String, Int>>(emptyMap()) // Track points
    val points: StateFlow<Map<String, Int>> = _points

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


    init {
        loadLessonCompletionStatus()
        loadPointsFromPrefs()
    }


    // Function to get the current stage from the selected course
    fun getCurrentStage(): Stage? {
        return selectedCourse.value?.stages?.firstOrNull { stage -> stage.id == selectedStage.value?.id }
    }

    // Function to get the current lesson from the selected stage
    fun getCurrentLesson(): Lesson? {
        val stage = getCurrentStage()
        return stage?.lessons?.firstOrNull { lesson -> lesson.id == selectedLesson.value?.id }
    }

    // Function to find a lesson by its ID across all courses, stages, and lessons
    private fun findLessonById(lessonId: String): Lesson? {
        for (course in courses) {
            for (stage in course.stages) {
                stage.lessons.forEach { lesson ->
                    if (lesson.id == lessonId) return lesson
                }
            }
        }
        return null
    }

    // Function to mark a sub-lesson as completed and handle progression logic
    fun markSubLessonAsCompleted(subLessonId: String, lessonId: String) {
        val updatedCompletionStatus = _lessonCompletionStatus.value.toMutableMap()

        // Mark the sub-lesson as completed if not already completed
        if (updatedCompletionStatus[subLessonId] != LessonStatus.COMPLETED) {
            updatedCompletionStatus[subLessonId] = LessonStatus.COMPLETED
            _lessonCompletionStatus.value = updatedCompletionStatus
            Log.d("SubLesson Completed", subLessonId)

            // Collect points for completing the sub-lesson and reset to 0
            collectPointsForSubLesson(subLessonId)
        }

        // Process lesson-level completion and unlocking logic
        val lesson = findLessonById(lessonId)
        lesson?.let {
            // Check if all sub-lessons are completed
            val allSubLessonsCompleted = it.subLessons.all { subLesson ->
                updatedCompletionStatus[subLesson.id] == LessonStatus.COMPLETED
            }
            if (allSubLessonsCompleted && updatedCompletionStatus[lesson.id] != LessonStatus.COMPLETED) {
                updatedCompletionStatus[lesson.id] = LessonStatus.COMPLETED
                _lessonCompletionStatus.value = updatedCompletionStatus
                Log.d("Lesson Completed", lesson.id)

                // Collect points for completing the lesson and reset to 0
                collectPointsForLesson(lesson.id)

                unlockNextLesson(it) // Unlock the next lesson if necessary
            }

            // Unlock the next sub-lesson if applicable
            unlockNextSubLesson(it, subLessonId)
        }

        // Save the updated state
        saveLessonCompletionStatus()
    }

    // Collect points for completing a sub-lesson
    private fun collectPointsForSubLesson(subLessonId: String) {
        val lesson = findLessonById(subLessonId)
        lesson?.let {
            val pointsForSubLesson = it.points // Get points from the sub-lesson
            if (pointsForSubLesson > 0) {
                // Add points to the total points map
                val updatedPoints = _points.value.toMutableMap()
                updatedPoints[subLessonId] = pointsForSubLesson
                _points.value = updatedPoints

                // Reset points to 0 after collection
                updatedPoints[subLessonId] = 0
                _points.value = updatedPoints
            }
        }

        // Save points to SharedPreferences
        savePointsToPrefs()
    }

    // Collect points for completing a lesson
    private fun collectPointsForLesson(lessonId: String) {
        val lesson = findLessonById(lessonId)
        lesson?.let {
            val pointsForLesson = it.points // Get points from the lesson
            if (pointsForLesson > 0) {
                // Add points to the total points map
                val updatedPoints = _points.value.toMutableMap()
                updatedPoints[lessonId] = pointsForLesson
                _points.value = updatedPoints

                // Reset points to 0 after collection
                updatedPoints[lessonId] = 0
                _points.value = updatedPoints
            }
        }

        // Save points to SharedPreferences
        savePointsToPrefs()
    }

    // Save points to SharedPreferences
    private fun savePointsToPrefs() {
        val pointsJson = gson.toJson(_points.value)
        sharedPreferences.edit().putString("points", pointsJson).apply()
    }

    // Load points from SharedPreferences
    private fun loadPointsFromPrefs() {
        val pointsJson = sharedPreferences.getString("points", null)
        val type = object : TypeToken<Map<String, Int>>() {}.type
        val loadedPoints = pointsJson?.let { gson.fromJson<Map<String, Int>>(it, type) }
        _points.value = loadedPoints ?: emptyMap()
    }

    // Save completion status to SharedPreferences
    private fun saveLessonCompletionStatus() {
        val completionStatusJson = gson.toJson(_lessonCompletionStatus.value)
        sharedPreferences.edit().putString("lesson_completion_status", completionStatusJson).apply()
    }

    // Load completion status from SharedPreferences
    private fun loadLessonCompletionStatus() {
        val completionStatusJson = sharedPreferences.getString("lesson_completion_status", null)
        val type = object : TypeToken<Map<String, LessonStatus>>() {}.type
        val loadedStatus =
            completionStatusJson?.let { gson.fromJson<Map<String, LessonStatus>>(it, type) }
        _lessonCompletionStatus.value = loadedStatus ?: emptyMap()
    }

    // Function to unlock the next lesson and its first sub-lesson
    private fun unlockNextLesson(currentLesson: Lesson) {
        val stage = getCurrentStage()
        val currentLessonIndex = stage?.lessons?.indexOfFirst { it.id == currentLesson.id } ?: -1

        if (currentLessonIndex >= 0 && currentLessonIndex < (stage?.lessons?.size ?: 0) - 1) {
            val nextLesson = stage?.lessons?.get(currentLessonIndex + 1)
            val updatedCompletionStatus = _lessonCompletionStatus.value.toMutableMap()

            if (nextLesson != null && updatedCompletionStatus[nextLesson.id] != LessonStatus.ACTIVE) {
                updatedCompletionStatus[nextLesson.id] = LessonStatus.ACTIVE
                _lessonCompletionStatus.value = updatedCompletionStatus
                Log.d("Next Lesson Unlocked", nextLesson.id)

                // Unlock the first sub-lesson
                nextLesson.subLessons.firstOrNull()?.let { firstSubLesson ->
                    if (updatedCompletionStatus[firstSubLesson.id] != LessonStatus.ACTIVE) {
                        updatedCompletionStatus[firstSubLesson.id] = LessonStatus.ACTIVE
                        _lessonCompletionStatus.value = updatedCompletionStatus
                        Log.d("First SubLesson Unlocked", firstSubLesson.id)
                    }
                }
            }

            // Save the updated state
            saveLessonCompletionStatus()
        }
    }

    // Function to unlock the next sub-lesson within the current lesson
    private fun unlockNextSubLesson(currentLesson: Lesson, currentSubLessonId: String) {
        val currentSubLessonIndex =
            currentLesson.subLessons.indexOfFirst { it.id == currentSubLessonId }

        if (currentSubLessonIndex >= 0 && currentSubLessonIndex < currentLesson.subLessons.size - 1) {
            val nextSubLesson = currentLesson.subLessons[currentSubLessonIndex + 1]
            val updatedCompletionStatus = _lessonCompletionStatus.value.toMutableMap()

            // Check the status of the next sub-lesson
            val nextSubLessonStatus = updatedCompletionStatus[nextSubLesson.id]

            // Unlock the next sub-lesson if its status is null or LOCKED
            if (nextSubLessonStatus == null || nextSubLessonStatus == LessonStatus.LOCKED) {
                updatedCompletionStatus[nextSubLesson.id] = LessonStatus.ACTIVE
                _lessonCompletionStatus.value = updatedCompletionStatus
                Log.d("Next SubLesson Unlocked", nextSubLesson.id)
            } else {
                Log.d(
                    "Next SubLesson Skipped",
                    "Next SubLesson: ${nextSubLesson.id} - Already $nextSubLessonStatus"
                )
            }

            // Save the updated state
            saveLessonCompletionStatus()
        }
    }

    // Function to update lesson completion status
    fun updateLessonCompletionStatus() {
        val updatedCompletionStatus = _lessonCompletionStatus.value.toMutableMap()
        val lesson = getCurrentLesson()

        lesson?.let {
            val allSubLessonsCompleted = it.subLessons.all { subLesson ->
                updatedCompletionStatus[subLesson.id] == LessonStatus.COMPLETED
            }
            if (allSubLessonsCompleted && updatedCompletionStatus[it.id] != LessonStatus.COMPLETED) {
                updatedCompletionStatus[it.id] = LessonStatus.COMPLETED
                _lessonCompletionStatus.value = updatedCompletionStatus
                Log.d("Lesson Updated", "Completed: ${it.id}")

                // Collect points for completing the lesson and reset to 0
                collectPointsForLesson(it.id)

                // Save the updated state
                saveLessonCompletionStatus()
            }
        }
    }


//
//    // Save completion status to SharedPreferences
//    private fun saveLessonCompletionStatus() {
//        val completionStatusJson = gson.toJson(_lessonCompletionStatus.value)
//        sharedPreferences.edit().putString("lesson_completion_status", completionStatusJson).apply()
//    }
//
//    // Load completion status from SharedPreferences
//    private fun loadLessonCompletionStatus() {
//        val completionStatusJson = sharedPreferences.getString("lesson_completion_status", null)
//        val type = object : TypeToken<Map<String, LessonStatus>>() {}.type
//        val loadedStatus =
//            completionStatusJson?.let { gson.fromJson<Map<String, LessonStatus>>(it, type) }
//
//        _lessonCompletionStatus.value = loadedStatus ?: emptyMap()
//    }
//
//
//    // Function to mark a sub-lesson as completed and handle progression logic
//    fun markSubLessonAsCompleted(subLessonId: String, lessonId: String) {
//        val updatedCompletionStatus = _lessonCompletionStatus.value.toMutableMap()
//
//        // Mark the sub-lesson as completed if not already completed
//        if (updatedCompletionStatus[subLessonId] != LessonStatus.COMPLETED) {
//            updatedCompletionStatus[subLessonId] = LessonStatus.COMPLETED
//            _lessonCompletionStatus.value = updatedCompletionStatus
//            Log.d("SubLesson Completed", subLessonId)
//        }
//
//        // Process lesson-level completion and unlocking logic
//        val lesson = findLessonById(lessonId)
//        lesson?.let {
//            // Check if all sub-lessons are completed
//            val allSubLessonsCompleted = it.subLessons.all { subLesson ->
//                updatedCompletionStatus[subLesson.id] == LessonStatus.COMPLETED
//            }
//            if (allSubLessonsCompleted && updatedCompletionStatus[lesson.id] != LessonStatus.COMPLETED) {
//                updatedCompletionStatus[lesson.id] = LessonStatus.COMPLETED
//                _lessonCompletionStatus.value = updatedCompletionStatus
//                Log.d("Lesson Completed", lesson.id)
//                unlockNextLesson(it) // Unlock the next lesson if necessary
//            }
//
//            // Unlock the next sub-lesson if applicable
//            unlockNextSubLesson(it, subLessonId)
//        }
//
//        // Save the updated state
//        saveLessonCompletionStatus()
//    }
//
//    // Function to unlock the next lesson and its first sub-lesson
//    private fun unlockNextLesson(currentLesson: Lesson) {
//        val stage = getCurrentStage()
//        val currentLessonIndex = stage?.lessons?.indexOfFirst { it.id == currentLesson.id } ?: -1
//
//        if (currentLessonIndex >= 0 && currentLessonIndex < (stage?.lessons?.size ?: 0) - 1) {
//            val nextLesson = stage?.lessons?.get(currentLessonIndex + 1)
//            val updatedCompletionStatus = _lessonCompletionStatus.value.toMutableMap()
//
//            if (nextLesson != null && updatedCompletionStatus[nextLesson.id] != LessonStatus.ACTIVE) {
//                updatedCompletionStatus[nextLesson.id] = LessonStatus.ACTIVE
//                _lessonCompletionStatus.value = updatedCompletionStatus
//                Log.d("Next Lesson Unlocked", nextLesson.id)
//
//                // Unlock the first sub-lesson
//                nextLesson.subLessons.firstOrNull()?.let { firstSubLesson ->
//                    if (updatedCompletionStatus[firstSubLesson.id] != LessonStatus.ACTIVE) {
//                        updatedCompletionStatus[firstSubLesson.id] = LessonStatus.ACTIVE
//                        _lessonCompletionStatus.value = updatedCompletionStatus
//                        Log.d("First SubLesson Unlocked", firstSubLesson.id)
//                    }
//                }
//            }
//
//            // Save the updated state
//            saveLessonCompletionStatus()
//        }
//    }
//
//    // Function to unlock the next sub-lesson within the current lesson
//    private fun unlockNextSubLesson(currentLesson: Lesson, currentSubLessonId: String) {
//        val currentSubLessonIndex =
//            currentLesson.subLessons.indexOfFirst { it.id == currentSubLessonId }
//
//        if (currentSubLessonIndex >= 0 && currentSubLessonIndex < currentLesson.subLessons.size - 1) {
//            val nextSubLesson = currentLesson.subLessons[currentSubLessonIndex + 1]
//            val updatedCompletionStatus = _lessonCompletionStatus.value.toMutableMap()
//
//            // Check the status of the next sub-lesson
//            val nextSubLessonStatus = updatedCompletionStatus[nextSubLesson.id]
//
//            // Unlock the next sub-lesson if its status is null or LOCKED
//            if (nextSubLessonStatus == null || nextSubLessonStatus == LessonStatus.LOCKED) {
//                updatedCompletionStatus[nextSubLesson.id] = LessonStatus.ACTIVE
//                _lessonCompletionStatus.value = updatedCompletionStatus
//                Log.d("Next SubLesson Unlocked", nextSubLesson.id)
//            } else {
//                Log.d(
//                    "Next SubLesson Skipped",
//                    "Next SubLesson: ${nextSubLesson.id} - Already $nextSubLessonStatus"
//                )
//            }
//
//            // Save the updated state
//            saveLessonCompletionStatus()
//        }
//    }
//
//    // Function to update lesson completion status
//    fun updateLessonCompletionStatus() {
//        val updatedCompletionStatus = _lessonCompletionStatus.value.toMutableMap()
//        val lesson = getCurrentLesson()
//
//        lesson?.let {
//            val allSubLessonsCompleted = it.subLessons.all { subLesson ->
//                updatedCompletionStatus[subLesson.id] == LessonStatus.COMPLETED
//            }
//            if (allSubLessonsCompleted && updatedCompletionStatus[it.id] != LessonStatus.COMPLETED) {
//                updatedCompletionStatus[it.id] = LessonStatus.COMPLETED
//                _lessonCompletionStatus.value = updatedCompletionStatus
//                Log.d("Lesson Updated", "Completed: ${it.id}")
//
//                // Save the updated state
//                saveLessonCompletionStatus()
//            }
//        }
//    }
//


    //Sample course
    fun createBeginnerCProgrammingCourse(): List<Course> {
        val cCourse = CLangCourseProvider()
        val cppCourse = CPPCourseProvider()

        return listOf(
            cCourse.getCompleteCLangCourse(),
            cppCourse.getCompleteCPPCourse()
        )
    }

}



