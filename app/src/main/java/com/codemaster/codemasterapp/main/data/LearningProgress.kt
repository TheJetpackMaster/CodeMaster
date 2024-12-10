package com.codemaster.codemasterapp.main.data;

data class LearningProgress(
    val language: String,
    val courseId: String,
    val stageId: String,
    val lessonId: String,
    val subLessonId: String,
    val subLessonName: String,
    val stageName: String,
    val lessonName: String,
    val subLessonIndex: Int // Index of the sub-lesson
)
