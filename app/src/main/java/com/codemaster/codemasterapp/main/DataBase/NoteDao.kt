package com.codemaster.codemasterapp.main.DataBase

import androidx.room.*
import com.codemaster.codemasterapp.main.data.Stage
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.NoteLanguage
import com.codemaster.codemasterapp.main.data.NoteLesson
import com.codemaster.codemasterapp.main.data.NoteStage
import com.codemaster.codemasterapp.main.data.NoteSubLesson


@Dao
interface LanguageDao {
    @Insert
    suspend fun insert(NoteLanguage: NoteLanguage): Long

    @Query("SELECT * FROM NoteLanguage WHERE name = :name LIMIT 1")
    suspend fun getLanguageByName(name: String): NoteLanguage?

    @Query("SELECT * FROM NoteLanguage")
    suspend fun getAllLanguages(): List<NoteLanguage> // New query
}

@Dao
interface StageDao {
    @Insert
    suspend fun insert(noteStage: NoteStage): Long

    @Query("SELECT * FROM NoteStage WHERE languageId = :languageId AND name = :name LIMIT 1")
    suspend fun getStageByName(languageId: Long, name: String): NoteStage?

    @Query("SELECT * FROM NoteStage WHERE languageId = :languageId")
    suspend fun getStagesByLanguageId(languageId: Long): List<NoteStage> // New query
}

@Dao
interface LessonDao {
    @Insert
    suspend fun insert(noteLesson: NoteLesson): Long

    @Query("SELECT * FROM NoteLesson WHERE stageId = :stageId AND lessonNumber = :number LIMIT 1")
    suspend fun getLessonByNumber(stageId: Long, number: Int): NoteLesson?

    @Query("SELECT * FROM NoteLesson WHERE stageId = :stageId")
    suspend fun getLessonsByStageId(stageId: Long): List<NoteLesson> // New query
}

@Dao
interface SubLessonDao {
    @Query("SELECT * FROM NoteSubLesson WHERE lessonId = :lessonId")
    suspend fun getSubLessonsByLessonId(lessonId: Long): List<NoteSubLesson>

    @Insert
    suspend fun insert(noteSubLesson: NoteSubLesson): Long
}
