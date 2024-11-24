package com.codemaster.codemasterapp.main.data;


// Represents a course (e.g., "English" with stages like "Beginner", "Intermediate")
data class Course(
    val id: String, // Unique identifier for the course
    val language: String, // Language name (e.g., "English")
    val stages: List<Stage> // List of stages (e.g., Beginner, Intermediate)
)

// Represents a stage in a course (e.g., "Beginner", "Intermediate")
data class Stage(
    val id: String, // Unique identifier for the stage
    val title: String, // Stage title (e.g., "Beginner")
    val lessons: List<Lesson> // Lessons within the stage
)

// Represents a lesson (e.g., "Lesson 1: Introduction to Kotlin")
data class Lesson(
    val id: String, // Unique identifier for the lesson
    val title: String, // Lesson title
    val description: String = "", // Optional lesson description
    var status: LessonStatus = LessonStatus.LOCKED, // Lesson status
    val subLessons: List<Lesson> = emptyList(), // Nested sub-lessons (optional)
    val lessonContents: List<LessonContent> = emptyList(),
    val points: Int = 0
)


// Represents the status of a lesson
enum class LessonStatus {
    LOCKED, ACTIVE, COMPLETED
}

// Represents a content block (could be text, image, code, or interactive code)
sealed class ContentBlock {
    data class Text(val text: String) : ContentBlock() // Plain text content
    data class Image(val imageRes: Int) : ContentBlock() // Image content
    data class Code(val code: String) : ContentBlock() // Code content
    data class InteractiveCodeBlock(
        val question: String,
        val options: List<String>,
        val correctAnswer: String,
        val incompleteCode: String,
        var userAnswer: String? = null
    ) : ContentBlock() // Interactive code block with options and user input
}

// Represents the type of lesson content (interactive or non-interactive)
enum class LessonContentType {
    INTERACTIVE, // Interactive content (e.g., quizzes, coding exercises)
    NON_INTERACTIVE // Non-interactive content (e.g., text, images)
}

// Represents a specific content block within a lesson
data class LessonContent(
    val id: String,
    val title: String, // Title of the content (e.g., "Introduction", "Quiz 1")
    val contentBlocks: List<ContentBlock>, // List of content blocks (Text, Image, Code, etc.)
    val type: LessonContentType, // Whether the content is interactive or non-interactive
    var isCompleted: Boolean = false // Whether the content has been completed (for progress tracking)
)
