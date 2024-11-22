//package com.codemaster.codemasterapp.main.data;
//

//data class Course(
//    val language: String, // Language name (e.g., "English")
//    val stages: List<Stage> // List of stages (e.g., Beginner, Intermediate)
//)
//
//data class Stage(
//    val title: String, // Stage title (e.g., "Beginner")
//    val lessons: List<Lesson> // Lessons within the stage
//)
//
//data class Lesson(
//    val title: String, // Lesson title
//    val description: String = "", // Optional lesson description
//    val status: LessonStatus = LessonStatus.LOCKED, // Lesson status
//    val subLessons: List<Lesson> = emptyList(), // Nested sub-lessons
//    val content: List<ContentBlock> = emptyList() // Actual content blocks for the lesson
//)
//
//enum class LessonStatus {
//    LOCKED, ACTIVE, COMPLETED
//}
//
//sealed class ContentBlock {
//    data class Text(val text: String) : ContentBlock()
//    data class Image(val imageRes: Int) : ContentBlock()
//    data class Code(val code: String) : ContentBlock()
//    data class InteractiveCodeBlock(
//        val question: String,
//        val options: List<String>,
//        val correctAnswer: String,
//        val incompleteCode: String,
//        var userAnswer: String? = null
//    ) : ContentBlock()
//}
