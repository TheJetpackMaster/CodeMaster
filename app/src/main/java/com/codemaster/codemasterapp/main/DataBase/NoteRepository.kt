package com.codemaster.codemasterapp.main.DataBase


import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.NoteLanguage
import com.codemaster.codemasterapp.main.data.NoteLesson
import com.codemaster.codemasterapp.main.data.NoteStage
import com.codemaster.codemasterapp.main.data.NoteSubLesson
import com.codemaster.codemasterapp.main.data.Stage

class NoteRepository(
    private val languageDao: LanguageDao,
    private val stageDao: StageDao,
    private val lessonDao: LessonDao,
    private val subLessonDao: SubLessonDao
) {
    // Language operations
    suspend fun getLanguageByName(name: String): NoteLanguage? = languageDao.getLanguageByName(name)
    suspend fun insertLanguage(noteLanguage: NoteLanguage): Long = languageDao.insert(noteLanguage)

    // Stage operations
    suspend fun getStageByName(languageId: Long, name: String): NoteStage? = stageDao.getStageByName(languageId, name)
    suspend fun insertStage(noteStage: NoteStage): Long = stageDao.insert(noteStage)

    // Lesson operations
    suspend fun getLessonByNumber(stageId: Long, number: Int): NoteLesson? = lessonDao.getLessonByNumber(stageId, number)
    suspend fun insertLesson(noteLesson: NoteLesson): Long = lessonDao.insert(noteLesson)

    // SubLesson operations
    suspend fun insertSubLesson(noteSubLesson: NoteSubLesson): Long = subLessonDao.insert(noteSubLesson)

    // Get notes (SubLessons) based on language, stage, lesson, and subLessonNumber
    suspend fun getNotes(languageName: String, stageName: String, lessonNumber: Int, subLessonNumber: Float): List<NoteSubLesson> {
        val language = languageDao.getLanguageByName(languageName)
        val stage = language?.let { stageDao.getStageByName(it.id, stageName) }
        val lesson = stage?.let { lessonDao.getLessonByNumber(it.id, lessonNumber) }

        return lesson?.let {
            subLessonDao.getSubLessonsByLessonId(it.id)
                .filter { it.subLessonNumber == subLessonNumber }
        } ?: emptyList()
    }
}
