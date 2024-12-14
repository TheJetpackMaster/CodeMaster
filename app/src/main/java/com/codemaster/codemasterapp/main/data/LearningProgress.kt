package com.codemaster.codemasterapp.main.data;

data class LearningProgress(
    val courseId: String,
    val stageId: String,
    val lessonId: String,
    val subLessonId: String,
    val subLessonName: String,
    val stageName: String,
    val subLessonIndex: Int // Index of the sub-lesson
)
