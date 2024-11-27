package com.codemaster.codemasterapp.main.ui.viewModels

import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.codemaster.codemasterapp.main.AllCourses.CLangCourseProvider
import com.codemaster.codemasterapp.main.AllCourses.CPPCourseProvider
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

    val cCourseProvider = CLangCourseProvider()
    // Mutable state for selected course, stage, lesson, and sub-lesson
    private val _selectedCourse = MutableStateFlow<Course?>(
        Course(
            id = "c_course",
            language = "C",
            stages = listOf(
               cCourseProvider.CBeginnerCourse(),
                cCourseProvider.CIntermediateCourse(),
                cCourseProvider.CAdvancedCourse(),
                cCourseProvider.CExpertCourse()
            )
        )
    )

    private val _selectedStage = MutableStateFlow<Stage?>(
        Stage(
            id = "c_beginner_stage",
            title = "Beginner",
            lessons =
            cCourseProvider.CBeginnerCourse().lessons,
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

//        return listOf(
//            Course(
//                id = "course_c_beginner",
//                language = "C",
//                stages = listOf(
//                    // Beginner Stage
//                    Stage(
//                        id = "beginner_stage",
//                        title = "Beginner",
//                        lessons = listOf(
//                            Lesson(
//                                id = "beginner_c1",
//                                title = "Lesson 1: Introduction to C Programming",
//                                description = "In this lesson, we will cover the basics of C programming, including syntax, structure, and variables.",
//                                status = LessonStatus.ACTIVE,
//                                subLessons = listOf(
//                                    Lesson(
//                                        id = "beginner_c1_sub1",
//                                        title = "Sublesson 1: Overview of C Programming",
//                                        description = "This sublesson introduces C programming and its key features.",
//                                        status = LessonStatus.ACTIVE
//                                    ),
//                                    Lesson(
//                                        id = "beginner_c1_sub2",
//                                        title = "Sublesson 2: Basic Syntax",
//                                        description = "In this sublesson, we will understand the structure of a C program.",
//                                        status = LessonStatus.LOCKED
//                                    ),
//                                    Lesson(
//                                        id = "beginner_c1_sub3",
//                                        title = "Sublesson 3: Quiz",
//                                        description = "In this sublesson, we will understand the structure of a C program.",
//                                        status = LessonStatus.LOCKED
//                                    )
//                                ),
//                                lessonContents = listOf(
//                                    LessonContent(
//                                        id = "content_1_1",
//                                        title = "Sublesson 1: Overview of C Programming",
//                                        contentBlocks = listOf(
//                                            ContentBlock.Text("C is a high-level, general-purpose programming language. It was developed in the early 1970s and is widely used for system programming."),
//                                            ContentBlock.Image(imageRes = R.drawable.coding),
//                                            ContentBlock.Code("/* Simple C program */\n#include <stdio.h>\nint main() {\n    printf(\"Hello, World!\");\n    return 0;\n}")
//                                        ),
//                                        type = LessonContentType.NON_INTERACTIVE
//                                    ),
//                                    LessonContent(
//                                        id = "content_1_2",
//                                        title = "Sublesson 2: Basic Syntax",
//                                        contentBlocks = listOf(
//                                            ContentBlock.Text("A basic C program consists of functions, declarations, and statements. The entry point for any C program is the `main` function."),
//                                            ContentBlock.Image(imageRes = R.drawable.coding),
//                                            ContentBlock.Code("/* Simple C syntax example */\n#include <stdio.h>\nint main() {\n    printf(\"Welcome to C programming!\");\n    return 0;\n}")
//                                        ),
//                                        type = LessonContentType.NON_INTERACTIVE
//                                    ),
//                                    LessonContent(
//                                        id = "content_1_3",
//                                        title = "Sublesson 3: Quiz",
//                                        contentBlocks = listOf(
//                                            QuizContentBlock(
//                                                question = "What is the capital of France?",
//                                                options = listOf("Berlin", "Paris", "Rome"),
//                                                correctAnswer = "Paris"
//                                            )
//                                        ),
//                                        type = LessonContentType.QUIZ
//                                    )
//                                ),
//                                points = 20
//                            ),
//                            Lesson(
//                                id = "beginner_c2",
//                                title = "Lesson 2: Variables and Data Types",
//                                description = "This lesson explains how to declare and use variables and various data types in C.",
//                                status = LessonStatus.LOCKED,
//                                subLessons = listOf(
//                                    Lesson(
//                                        id = "beginner_c2_sub1",
//                                        title = "Sublesson 1: Variables in C",
//                                        description = "Learn how to declare and initialize variables in C.",
//                                        status = LessonStatus.LOCKED
//                                    ),
//                                    Lesson(
//                                        id = "beginner_c2_sub2",
//                                        title = "Sublesson 2: Data Types",
//                                        description = "Understand the different types of data that can be stored in variables, such as integers, floats, and characters.",
//                                        status = LessonStatus.LOCKED
//                                    )
//                                ),
//                                lessonContents = listOf(
//                                    LessonContent(
//                                        id = "content_2_1",
//                                        title = "Sublesson 1: Variables in C",
//                                        contentBlocks = listOf(
//                                            ContentBlock.Text("In C, a variable is a storage location identified by a name. A variable must be declared before it can be used."),
//                                            ContentBlock.Image(imageRes = R.drawable.coding),
//                                            ContentBlock.Code("int x = 10;\nfloat y = 5.5;\nchar c = 'A';")
//                                        ),
//                                        type = LessonContentType.NON_INTERACTIVE
//                                    ),
//                                    LessonContent(
//                                        id = "content_2_2",
//                                        title = "Sublesson 2: Data Types",
//                                        contentBlocks = listOf(
//                                            ContentBlock.Text("C supports several data types, including integer types (int), floating-point types (float), and character types (char)."),
//                                            ContentBlock.Image(imageRes = R.drawable.coding),
//                                            ContentBlock.Code("int x = 5;\nfloat y = 3.14;\ndouble pi = 3.14159;\nchar letter = 'A';")
//                                        ),
//                                        type = LessonContentType.NON_INTERACTIVE
//                                    )
//                                ),
//                                points = 20
//                            ),
//                            Lesson(
//                                id = "beginner_c3",
//                                title = "Lesson 3: Control Flow Statements",
//                                description = "Learn how to use if-else conditions, loops (for, while), and switch statements for controlling the flow of your program.",
//                                status = LessonStatus.LOCKED,
//                                subLessons = listOf(
//                                    Lesson(
//                                        id = "beginner_c3_sub1",
//                                        title = "Sublesson 1: If-Else Statements",
//                                        description = "Learn how to make decisions using `if`, `else if`, and `else` statements.",
//                                        status = LessonStatus.LOCKED,
//                                    ),
//                                    Lesson(
//                                        id = "beginner_c3_sub2",
//                                        title = "Sublesson 2: Loops in C",
//                                        description = "Understand how loops work, including `for` and `while` loops.",
//                                        status = LessonStatus.LOCKED,
//                                    )
//                                ),
//                                lessonContents = listOf(
//                                    LessonContent(
//                                        id = "content_3_1",
//                                        title = "Sublesson 1: If-Else Statements",
//                                        contentBlocks = listOf(
//                                            ContentBlock.Text("The `if` statement is used to execute a block of code based on a condition. The `else` statement is used for alternative conditions."),
//                                            ContentBlock.Image(imageRes = R.drawable.coding),
//                                            ContentBlock.Code("if (x > 10) {\n    printf(\"x is greater than 10\");\n} else {\n    printf(\"x is 10 or less\");\n}")
//                                        ),
//                                        type = LessonContentType.NON_INTERACTIVE
//                                    ),
//                                    LessonContent(
//                                        id = "content_3_2",
//                                        title = "Sublesson 2: Loops in C",
//                                        contentBlocks = listOf(
//                                            ContentBlock.Text("Loops allow you to repeat a block of code multiple times. `for` loops and `while` loops are the most common types."),
//                                            ContentBlock.Image(imageRes = R.drawable.coding),
//                                            ContentBlock.Code("for (int i = 0; i < 5; i++) {\n    printf(\"i: %d\", i);\n}\n\nwhile (x < 10) {\n    printf(\"x: %d\", x);\n    x++;\n}")
//                                        ),
//                                        type = LessonContentType.NON_INTERACTIVE
//                                    )
//                                ),
//                                points = 20
//                            )
//                        )
//                    )
//                )
//            )
//        )
    }

}



