package com.codemaster.codemasterapp.main.AllCourses.CppCourse.courseIds


// Step 1: Create a class to store IDs
object cppAdvancedStageIds {

    val stageId = "cpp_advanced_stage"

    // Course and Lesson IDs as constants
    val lesson1 = "advanced_cpp1"
    val lesson2 = "advanced_cpp2"
    val lesson3 = "advanced_cpp3"
    val lesson4 = "advanced_cpp4"
    val lesson5 = "advanced_cpp5"
    val lesson6 = "advanced_cpp6"
    val lesson7 = "advanced_cpp7"
    val lesson8 = "advanced_cpp8"
    val lesson9 = "advanced_cpp9"
    val lesson10 = "advanced_cpp10"
    val lesson11 = "advanced_cpp11"
    val lesson12 = "advanced_cpp12"
    val lesson13 = "advanced_cpp13"
    val lesson14 = "advanced_cpp14"
    val lesson15 = "advanced_cpp15"

    // Sub-lesson IDs for lesson 1 Welcome
    val lesson1_subs = listOf(
        "${lesson1}_sub1",
        "${lesson1}_sub2",
        "${lesson1}_sub3",
        "${lesson1}_sub4",
        "${lesson1}_sub5",
        "${lesson1}_sub6"
    )

    // Sub-lesson IDs for lesson 2 - Introduction to OOP
    val lesson2_subs = listOf(
        "${lesson2}_sub1",
        "${lesson2}_sub2",
        "${lesson2}_sub3",
        "${lesson2}_sub4",
        "${lesson2}_sub5",
        "${lesson2}_sub6"
    )

    // Sub-lesson IDs for lesson 3 - Classes & Objects in C++
    val lesson3_subs = listOf(
        "${lesson3}_sub1",
        "${lesson3}_sub2",
        "${lesson3}_sub3",
        "${lesson3}_sub4",
        "${lesson3}_sub5",
        "${lesson3}_sub6",
        "${lesson3}_sub7",
        "${lesson3}_sub8",
        "${lesson3}_sub9",
        "${lesson3}_sub10"
    )

    // Sub-lesson IDs for lesson 4 - Classes & Methods
    val lesson4_subs = listOf(
        "${lesson4}_sub1",
        "${lesson4}_sub2",
        "${lesson4}_sub3",
        "${lesson4}_sub4",
        "${lesson4}_sub5",
        "${lesson4}_sub5",
        "${lesson4}_sub6",
    )

    // Sub-lesson IDs for lesson 5 - Constructors in C++
    val lesson5_subs = listOf(
        "${lesson5}_sub1",
        "${lesson5}_sub2",
        "${lesson5}_sub3",
        "${lesson5}_sub4",
        "${lesson5}_sub5",
        "${lesson5}_sub6",
        "${lesson5}_sub7",
        "${lesson5}_sub8",
        "${lesson5}_sub9"
    )

    // Sub-lesson IDs for lesson 6 - Access Modifiers in C++
    val lesson6_subs = listOf(
        "${lesson6}_sub1",
        "${lesson6}_sub2",
        "${lesson6}_sub3",
        "${lesson6}_sub4",
        "${lesson6}_sub5",
        "${lesson6}_sub6",
        "${lesson6}_sub7",
        "${lesson6}_sub8"
    )

    // Sub-lesson IDs for lesson 7 - Setters and Getters in C++
    val lesson7_subs = listOf(
        "${lesson7}_sub1",
        "${lesson7}_sub2",
        "${lesson7}_sub3",
        "${lesson7}_sub4",
        "${lesson7}_sub5",
        "${lesson7}_sub6",
        "${lesson7}_sub7",
        "${lesson7}_sub8"
    )

    // Sub-lesson IDs for lesson 8 - Inheritance in C++
    val lesson8_subs = listOf(
        "${lesson8}_sub1",
        "${lesson8}_sub2",
        "${lesson8}_sub3",
        "${lesson8}_sub4",
        "${lesson8}_sub5",
        "${lesson8}_sub6",
        "${lesson8}_sub7",
        "${lesson8}_sub8"
    )

    // Sub-lesson IDs for lesson 8 - Inheritance in C++
    val lesson9_subs = listOf(
        "${lesson9}_sub1",
        "${lesson9}_sub2",
        "${lesson9}_sub3",
        "${lesson9}_sub4",
        "${lesson9}_sub5",
        "${lesson9}_sub6",
        "${lesson9}_sub7",
        "${lesson9}_sub8"
    )

}




//
//object CppAdvancedStageIds {
//
//    const val stageId = "cpp_advanced_stage"
//
//    val lessons = mapOf(
//
//        // Lesson 1 : Welcome to the Advanced Stage
//        "advanced_cpp1" to generateSubLessonIds("advanced_cpp1", 6),
//        // Lesson 2 : Introduction to OOP
//        "advanced_cpp2" to generateSubLessonIds("advanced_cpp2", 6),
//        // Lesson 3 : Classes & Objects in C++
//        "advanced_cpp3" to generateSubLessonIds("advanced_cpp3", 10),
//        // Lesson 4 : Classes & Methods
//        "advanced_cpp4" to generateSubLessonIds("advanced_cpp4", 7),
//        // Lesson 5 : Constructors in C++
//        "advanced_cpp5" to generateSubLessonIds("advanced_cpp5", 9),
//        // Lesson 6 : Access Modifiers in C++
//        "advanced_cpp6" to generateSubLessonIds("advanced_cpp6", 8),
//        // Lesson 7 : Setters and Getters in C++
//        "advanced_cpp7" to generateSubLessonIds("advanced_cpp7", 8),
//        // Lesson 8 : Inheritance in C++
//        "advanced_cpp8" to generateSubLessonIds("advanced_cpp8", 8),
//        // Lesson 9 : MultiLevel Inheritance in C++
//        "advanced_cpp9" to generateSubLessonIds("advanced_cpp9", 6),
//        // Lesson 10 : Multiple Inheritance in C++
//        "advanced_cpp10" to generateSubLessonIds("advanced_cpp10", 8),
//        // Lesson 11 : Encapsulation in C++
//        "advanced_cpp11" to generateSubLessonIds("advanced_cpp11", 7),
//        // Lesson 12 : Polymorphism in C++
//        "advanced_cpp12" to generateSubLessonIds("advanced_cpp12", 8),
//        // Lesson 13 : Guidance Practice
//        "advanced_cpp13" to generateSubLessonIds("advanced_cpp13", 10),
//        // Lesson 14 : Recap
//        "advanced_cpp114" to generateSubLessonIds("advanced_cpp14", 10),
//        // Lesson 15 : Final Quiz
//        "advanced_cpp115" to generateSubLessonIds("advanced_cpp15", 13)
//    )
//
//    private fun generateSubLessonIds(lesson: String, count: Int): List<String> {
//        return (1..count).map { "${lesson}_sub$it" }
//    }
//}
//
//fun printLessonsAndSubLessons() {
//    CppAdvancedStageIds.lessons.forEach { (lesson, subLessons) ->
//        Log.d("Lesson ID:", lesson)
//        subLessons.forEach { subLesson ->
//            Log.d("  Sub-lesson ID:", subLesson)
//        }
//    }
//}


