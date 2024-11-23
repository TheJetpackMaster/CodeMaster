package com.codemaster.codemasterapp.main.ui.viewModels

import android.util.Log
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.Course
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage

class CourseViewModel : androidx.lifecycle.ViewModel() {
    // List of courses to display
    val courses: List<Course> =  createBeginnerCProgrammingCourse()

    // Mutable state for selected course, stage, lesson, and sub-lesson
    private val _selectedCourse = MutableStateFlow<Course?>(null)
    private val _selectedStage = MutableStateFlow<Stage?>(null)
    private val _selectedLesson = MutableStateFlow<Lesson?>(null)
    private val _selectedSubLessonIndex = MutableStateFlow<Int>(0)

    // Exposed state for UI binding
    val selectedCourse: StateFlow<Course?> get() = _selectedCourse
    val selectedStage: StateFlow<Stage?> get() = _selectedStage
    val selectedLesson: StateFlow<Lesson?> get() = _selectedLesson
    val selectedSubLessonIndex: StateFlow<Int> get() = _selectedSubLessonIndex

    // Map to track lesson and sub-lesson completion status
    private val _lessonCompletionStatus = MutableStateFlow<Map<String, LessonStatus>>(emptyMap())
    val lessonCompletionStatus: StateFlow<Map<String, LessonStatus>> = _lessonCompletionStatus

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

    // Function to mark a sub-lesson as completed and unlock the next sub-lesson or lesson
    fun markSubLessonAsCompleted(subLessonId: String, lessonId: String) {
        val updatedCompletionStatus = _lessonCompletionStatus.value.toMutableMap()

        // Mark the sub-lesson as completed
        updatedCompletionStatus[subLessonId] = LessonStatus.COMPLETED
        _lessonCompletionStatus.value = updatedCompletionStatus
        Log.d("SubLesson Completed", subLessonId)

        // Find the lesson by ID and process the completion logic
        val lesson = findLessonById(lessonId)
        Log.d("Found Lesson", "Lesson ID: ${lesson?.id ?: "None"}")

        lesson?.let {
            // If all sub-lessons are completed, mark the lesson as completed
            val allSubLessonsCompleted = it.subLessons.all { subLesson ->
                updatedCompletionStatus[subLesson.id] == LessonStatus.COMPLETED
            }
            if (allSubLessonsCompleted) {
                updatedCompletionStatus[lesson.id] = LessonStatus.COMPLETED
                _lessonCompletionStatus.value = updatedCompletionStatus
                Log.d("Lesson Completed", lesson.id)

                // Unlock the next lesson if available
                unlockNextLesson(it)
            }

            // Unlock the next sub-lesson after marking the current one as completed
            unlockNextSubLesson(it, subLessonId)
        } ?: Log.d("Lesson Not Found", "Lesson with ID $lessonId not found")
    }

    // Function to unlock the next lesson (if available) and its first sub-lesson
    private fun unlockNextLesson(currentLesson: Lesson) {
        val stage = getCurrentStage() // Get the current stage
        val currentLessonIndex = stage?.lessons?.indexOfFirst { it.id == currentLesson.id } ?: -1

        Log.d("Current Lesson Index", currentLessonIndex.toString())

        if (currentLessonIndex >= 0 && currentLessonIndex < (stage?.lessons?.size ?: 0) - 1) {
            val nextLesson = stage?.lessons?.get(currentLessonIndex + 1)
            val updatedCompletionStatus = _lessonCompletionStatus.value.toMutableMap()

            // Log current status of the next lesson before attempting to unlock it
            val nextLessonStatus = updatedCompletionStatus[nextLesson?.id]
            Log.d(
                "Next Lesson Status Before Unlock",
                "Next Lesson: ${nextLesson?.id} - Status: $nextLessonStatus"
            )

            // Directly set the next lesson to ACTIVE
            nextLesson?.let {
                updatedCompletionStatus[it.id] = LessonStatus.ACTIVE
                _lessonCompletionStatus.value = updatedCompletionStatus
                Log.d("Next Lesson Unlocked", it.id)

                // Unlock the first sub-lesson of the next lesson
                if (it.subLessons.isNotEmpty()) {
                    val firstSubLesson = it.subLessons.first()
                    updatedCompletionStatus[firstSubLesson.id] = LessonStatus.ACTIVE
                    _lessonCompletionStatus.value = updatedCompletionStatus
                    Log.d("First SubLesson Unlocked", firstSubLesson.id)
                }
            }
        }
    }

    // Function to unlock the next sub-lesson (if available)
    private fun unlockNextSubLesson(currentLesson: Lesson, currentSubLessonId: String) {
        val currentSubLessonIndex =
            currentLesson.subLessons.indexOfFirst { it.id == currentSubLessonId }
        Log.d("Current SubLesson Index", currentSubLessonIndex.toString())

        if (currentSubLessonIndex >= 0 && currentSubLessonIndex < currentLesson.subLessons.size - 1) {
            val nextSubLesson = currentLesson.subLessons[currentSubLessonIndex + 1]
            val updatedCompletionStatus = _lessonCompletionStatus.value.toMutableMap()

            // Log current status of the next sub-lesson before attempting to unlock it
            val nextSubLessonStatus = updatedCompletionStatus[nextSubLesson.id]
            Log.d(
                "Next SubLesson Status Before Unlock",
                "Next SubLesson: ${nextSubLesson.id} - Status: $nextSubLessonStatus"
            )

            // Directly set the next sub-lesson to ACTIVE
            updatedCompletionStatus[nextSubLesson.id] = LessonStatus.ACTIVE
            _lessonCompletionStatus.value = updatedCompletionStatus
            Log.d("Next SubLesson Unlocked", nextSubLesson.id)
        }
    }


    // Function to update lesson completion status based on sub-lessons
    fun updateLessonCompletionStatus() {
        val updatedCompletionStatus = _lessonCompletionStatus.value.toMutableMap()

        // Find the current lesson and its sub-lessons
        val lesson = getCurrentLesson()
        Log.d("Current Lesson", lesson?.id ?: "None")

        if (lesson == null) {
            Log.d("updateLessonStatus", "Current lesson is null")
            return
        }

        lesson.let {
            // If all sub-lessons are completed, mark the lesson as completed
            val allSubLessonsCompleted = it.subLessons.all { subLesson ->
                updatedCompletionStatus[subLesson.id] == LessonStatus.COMPLETED
            }
            if (allSubLessonsCompleted) {
                Log.d("updateLessonStatus", "All sub-lessons completed for lesson: ${it.id}")
                updatedCompletionStatus[it.id] = LessonStatus.COMPLETED
            }
        }

        _lessonCompletionStatus.value = updatedCompletionStatus
        Log.d("updateLessonStatus", "Updated completion status: $updatedCompletionStatus")
    }


    fun createBeginnerCProgrammingCourse(): List<Course> {
        return listOf(
            Course(
                id = "course_c_beginner",
                language = "C",
                stages = listOf(
                    // Beginner Stage
                    Stage(
                        id = "beginner_stage",
                        title = "Beginner",
                        lessons = listOf(
                            Lesson(
                                id = "beginner_c1",
                                title = "Lesson 1: Introduction to C Programming",
                                description = "In this lesson, we will cover the basics of C programming, including syntax, structure, and variables.",
                                status = LessonStatus.ACTIVE,
                                subLessons = listOf(
                                    Lesson(
                                        id = "beginner_c1_sub1",
                                        title = "Sublesson 1: Overview of C Programming",
                                        description = "This sublesson introduces C programming and its key features.",
                                        status = LessonStatus.ACTIVE
                                    ),
                                    Lesson(
                                        id = "beginner_c1_sub2",
                                        title = "Sublesson 2: Basic Syntax",
                                        description = "In this sublesson, we will understand the structure of a C program.",
                                        status = LessonStatus.LOCKED
                                    )
                                ),
                                lessonContents = listOf(
                                    LessonContent(
                                        id = "content_1_1",
                                        title = "Sublesson 1: Overview of C Programming",
                                        contentBlocks = listOf(
                                            ContentBlock.Text("C is a high-level, general-purpose programming language. It was developed in the early 1970s and is widely used for system programming."),
                                            ContentBlock.Image(imageRes = R.drawable.coding),
                                            ContentBlock.Code("/* Simple C program */\n#include <stdio.h>\nint main() {\n    printf(\"Hello, World!\");\n    return 0;\n}")
                                        ),
                                        type = LessonContentType.NON_INTERACTIVE
                                    ),
                                    LessonContent(
                                        id = "content_1_2",
                                        title = "Sublesson 2: Basic Syntax",
                                        contentBlocks = listOf(
                                            ContentBlock.Text("A basic C program consists of functions, declarations, and statements. The entry point for any C program is the `main` function."),
                                            ContentBlock.Image(imageRes = R.drawable.coding),
                                            ContentBlock.Code("/* Simple C syntax example */\n#include <stdio.h>\nint main() {\n    printf(\"Welcome to C programming!\");\n    return 0;\n}")
                                        ),
                                        type = LessonContentType.NON_INTERACTIVE
                                    )
                                )
                            ),
                            Lesson(
                                id = "beginner_c2",
                                title = "Lesson 2: Variables and Data Types",
                                description = "This lesson explains how to declare and use variables and various data types in C.",
                                status = LessonStatus.LOCKED,
                                subLessons = listOf(
                                    Lesson(
                                        id = "beginner_c2_sub1",
                                        title = "Sublesson 1: Variables in C",
                                        description = "Learn how to declare and initialize variables in C.",
                                        status = LessonStatus.LOCKED
                                    ),
                                    Lesson(
                                        id = "beginner_c2_sub2",
                                        title = "Sublesson 2: Data Types",
                                        description = "Understand the different types of data that can be stored in variables, such as integers, floats, and characters.",
                                        status = LessonStatus.LOCKED
                                    )
                                ),
                                lessonContents = listOf(
                                    LessonContent(
                                        id = "content_2_1",
                                        title = "Sublesson 1: Variables in C",
                                        contentBlocks = listOf(
                                            ContentBlock.Text("In C, a variable is a storage location identified by a name. A variable must be declared before it can be used."),
                                            ContentBlock.Image(imageRes = R.drawable.coding),
                                            ContentBlock.Code("int x = 10;\nfloat y = 5.5;\nchar c = 'A';")
                                        ),
                                        type = LessonContentType.NON_INTERACTIVE
                                    ),
                                    LessonContent(
                                        id = "content_2_2",
                                        title = "Sublesson 2: Data Types",
                                        contentBlocks = listOf(
                                            ContentBlock.Text("C supports several data types, including integer types (int), floating-point types (float), and character types (char)."),
                                            ContentBlock.Image(imageRes = R.drawable.coding),
                                            ContentBlock.Code("int x = 5;\nfloat y = 3.14;\ndouble pi = 3.14159;\nchar letter = 'A';")
                                        ),
                                        type = LessonContentType.NON_INTERACTIVE
                                    )
                                )
                            ),
                            Lesson(
                                id = "beginner_c3",
                                title = "Lesson 3: Control Flow Statements",
                                description = "Learn how to use if-else conditions, loops (for, while), and switch statements for controlling the flow of your program.",
                                status = LessonStatus.LOCKED,
                                subLessons = listOf(
                                    Lesson(
                                        id = "beginner_c3_sub1",
                                        title = "Sublesson 1: If-Else Statements",
                                        description = "Learn how to make decisions using `if`, `else if`, and `else` statements.",
                                        status = LessonStatus.LOCKED,
                                    ),
                                    Lesson(
                                        id = "beginner_c3_sub2",
                                        title = "Sublesson 2: Loops in C",
                                        description = "Understand how loops work, including `for` and `while` loops.",
                                        status = LessonStatus.LOCKED,
                                    )
                                ),
                                lessonContents = listOf(
                                    LessonContent(
                                        id = "content_3_1",
                                        title = "Sublesson 1: If-Else Statements",
                                        contentBlocks = listOf(
                                            ContentBlock.Text("The `if` statement is used to execute a block of code based on a condition. The `else` statement is used for alternative conditions."),
                                            ContentBlock.Image(imageRes = R.drawable.coding),
                                            ContentBlock.Code("if (x > 10) {\n    printf(\"x is greater than 10\");\n} else {\n    printf(\"x is 10 or less\");\n}")
                                        ),
                                        type = LessonContentType.NON_INTERACTIVE
                                    ),
                                    LessonContent(
                                        id = "content_3_2",
                                        title = "Sublesson 2: Loops in C",
                                        contentBlocks = listOf(
                                            ContentBlock.Text("Loops allow you to repeat a block of code multiple times. `for` loops and `while` loops are the most common types."),
                                            ContentBlock.Image(imageRes = R.drawable.coding),
                                            ContentBlock.Code("for (int i = 0; i < 5; i++) {\n    printf(\"i: %d\", i);\n}\n\nwhile (x < 10) {\n    printf(\"x: %d\", x);\n    x++;\n}")
                                        ),
                                        type = LessonContentType.NON_INTERACTIVE
                                    )
                                )
                            )
                        )
                    )
                )
            )
        )
    }

}
