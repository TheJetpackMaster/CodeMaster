package com.codemaster.codemasterapp.main.data

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity
data class NoteLanguage(
    @PrimaryKey(autoGenerate = true) var id: Long = 0, // Primary Key
    val languageName: String // Language name, e.g., "C"
)

@Entity(
    foreignKeys = [ForeignKey(
        entity = NoteLanguage::class,
        parentColumns = ["id"],
        childColumns = ["languageId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class NoteStage(
    @PrimaryKey(autoGenerate = true) var id: Long = 0, // Primary Key
    val languageId: Long, // Foreign Key referencing NoteLanguage
    val stageName: String // Stage name, e.g., "Beginner"
)

@Entity(
    foreignKeys = [ForeignKey(
        entity = NoteStage::class,
        parentColumns = ["id"],
        childColumns = ["stageId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class NoteLesson(
    @PrimaryKey(autoGenerate = true) var id: Long = 0, // Primary Key
    val stageId: Long, // Foreign Key referencing NoteStage
    val lessonNumber: Int // Lesson number, e.g., 1, 2
)

@Entity(
    foreignKeys = [ForeignKey(
        entity = NoteLesson::class,
        parentColumns = ["id"],
        childColumns = ["lessonId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class NoteSubLesson(
    @PrimaryKey(autoGenerate = true) val id: Long = 0, // Primary Key
    val lessonId: Long, // Foreign Key referencing NoteLesson
    val subLessonNumber: Float, // Sub-lesson number, e.g., 1.1, 2.5
    val title: String, // Note title
    val description: String, // Note description
    val timestamp: Long = System.currentTimeMillis() // Timestamp for note creation
)
