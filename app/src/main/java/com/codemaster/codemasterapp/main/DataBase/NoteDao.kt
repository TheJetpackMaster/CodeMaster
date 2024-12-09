package com.codemaster.codemasterapp.main.DataBase

import androidx.room.*
import com.codemaster.codemasterapp.main.data.Stage
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.NoteLanguage
import com.codemaster.codemasterapp.main.data.NoteLesson
import com.codemaster.codemasterapp.main.data.NoteStage
import com.codemaster.codemasterapp.main.data.NoteSubLesson


@Dao
interface NoteLanguageDao {
    @Insert
    suspend fun insert(noteLanguage: NoteLanguage): Long

    @Query("SELECT * FROM NoteLanguage WHERE languageName = :languageName")
    suspend fun getLanguageByName(languageName: String): NoteLanguage?

    @Query("SELECT * FROM NoteLanguage")
    suspend fun getAllLanguages(): List<NoteLanguage>

}



@Dao
interface NoteStageDao {
    @Insert
    suspend fun insert(noteStage: NoteStage): Long

    @Query("SELECT * FROM NoteStage WHERE languageId = :languageId AND stageName = :stageName")
    suspend fun getStageByName(languageId: Long, stageName: String): NoteStage?

    @Query("SELECT * FROM NoteStage WHERE languageId = :languageId")
    suspend fun getStagesByLanguageId(languageId: Long): List<NoteStage>
}



@Dao
interface NoteLessonDao {
    @Insert
    suspend fun insert(noteLesson: NoteLesson): Long

    @Query("SELECT * FROM NoteLesson WHERE stageId = :stageId AND lessonNumber = :lessonNumber")
    suspend fun getLessonByNumber(stageId: Long, lessonNumber: Int): NoteLesson?

    @Query("SELECT * FROM NoteLesson WHERE stageId = :stageId")
    suspend fun getLessonsByStageId(stageId: Long): List<NoteLesson>
}


@Dao
interface NoteSubLessonDao {
    @Insert
    suspend fun insert(noteSubLesson: NoteSubLesson): Long

    @Update
    suspend fun update(noteSubLesson: NoteSubLesson)

    @Query("SELECT * FROM NoteSubLesson WHERE lessonId = :lessonId")
    suspend fun getSubLessonsByLessonId(lessonId: Long): List<NoteSubLesson>

    @Query("SELECT * FROM NoteSubLesson WHERE lessonId = :lessonId AND subLessonNumber = :subLessonNumber")
    suspend fun getSubLessonByNumber(lessonId: Long, subLessonNumber: Float): NoteSubLesson?
}


