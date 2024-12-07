package com.codemaster.codemasterapp.main.DataBase


import android.util.Log
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.NoteLanguage
import com.codemaster.codemasterapp.main.data.NoteLesson
import com.codemaster.codemasterapp.main.data.NoteStage
import com.codemaster.codemasterapp.main.data.NoteSubLesson
import com.codemaster.codemasterapp.main.data.Stage

class NoteRepository(
    private val noteLanguageDao: NoteLanguageDao,
    private val noteStageDao: NoteStageDao,
    private val noteLessonDao: NoteLessonDao,
    private val noteSubLessonDao: NoteSubLessonDao
) {

    // Get or insert language by name
    suspend fun getOrInsertLanguage(languageName: String): Long {
        val language = noteLanguageDao.getLanguageByName(languageName)
        return if (language != null) {
            language.id
        } else {
            insertLanguage(NoteLanguage(languageName = languageName))
        }
    }

    // Get or insert stage by name
    suspend fun getOrInsertStage(languageName: String, stageName: String): Long {
        val languageId = getOrInsertLanguage(languageName)
        val stage = noteStageDao.getStageByName(languageId, stageName)
        return if (stage != null) {
            stage.id
        } else {
            insertStage(NoteStage(languageId = languageId, stageName = stageName))
        }
    }

    // Get or insert lesson by number
    suspend fun getOrInsertLesson(languageName: String, stageName: String, lessonNumber: Int): Long {
        val stageId = getOrInsertStage(languageName, stageName)
        val lesson = noteLessonDao.getLessonByNumber(stageId, lessonNumber)
        return if (lesson != null) {
            lesson.id
        } else {
            insertLesson(NoteLesson(stageId = stageId, lessonNumber = lessonNumber))
        }
    }

    // Get or insert sub-lesson by number
    /*suspend fun getOrInsertSubLesson(languageName: String, stageName: String, lessonNumber: Int, subLessonNumber: Float, title: String, description: String): Long {
        val lessonId = getOrInsertLesson(languageName, stageName, lessonNumber)
        val subLesson = noteSubLessonDao.getSubLessonByNumber(lessonId, subLessonNumber)
        return if (subLesson != null) {
            subLesson.id
        } else {
            insertSubLesson(NoteSubLesson(lessonId = lessonId, subLessonNumber = subLessonNumber, title = title, description = description))
        }
    }*/

    suspend fun getOrInsertSubLesson(
        languageName: String,
        stageName: String,
        lessonNumber: Int,
        subLessonNumber: Float,
        title: String,
        description: String
    ): Long {
        val lessonId = getOrInsertLesson(languageName, stageName, lessonNumber)
        val existingSubLesson = noteSubLessonDao.getSubLessonByNumber(lessonId, subLessonNumber)

        return if (existingSubLesson != null) {
            // Update the existing sub-lesson with new details
            val updatedSubLesson = existingSubLesson.copy(
                title = title,
                description = description
            )
            noteSubLessonDao.update(updatedSubLesson) // Perform the update
            existingSubLesson.id // Return the ID of the updated sub-lesson
        } else {
            // Insert a new sub-lesson
            insertSubLesson(
                NoteSubLesson(
                    lessonId = lessonId,
                    subLessonNumber = subLessonNumber,
                    title = title,
                    description = description
                )
            )
        }
    }


    suspend fun getSubLessonByNames(
        languageName: String,
        stageName: String,
        lessonNumber: Int,
        subLessonNumber: Float
    ): NoteSubLesson? {
        // Step 1: Fetch the language ID by name
        val language = noteLanguageDao.getLanguageByName(languageName)
            ?: return null // Return null if the language does not exist

        // Step 2: Fetch the stage ID by name
        val stage = noteStageDao.getStageByName(language.id, stageName)
            ?: return null // Return null if the stage does not exist

        // Step 3: Fetch the lesson ID by number
        val lesson = noteLessonDao.getLessonByNumber(stage.id, lessonNumber)
            ?: return null // Return null if the lesson does not exist

        // Step 4: Fetch the sub-lesson by number
        return noteSubLessonDao.getSubLessonByNumber(lesson.id, subLessonNumber)
    }

    suspend fun getAllSubLessons(): List<NoteSubLesson> {
        // Fetch all languages
        val allLanguages = noteLanguageDao.getAllLanguages()
        val allSubLessons = mutableListOf<NoteSubLesson>()

        for (language in allLanguages) {
            // Fetch all stages for the language
            val stages = noteStageDao.getStagesByLanguageId(language.id)
            for (stage in stages) {
                // Fetch all lessons for the stage
                val lessons = noteLessonDao.getLessonsByStageId(stage.id)
                for (lesson in lessons) {
                    // Fetch all sub-lessons for the lesson
                    val subLessons = noteSubLessonDao.getSubLessonsByLessonId(lesson.id)
                    allSubLessons.addAll(subLessons) // Add sub-lessons to the result list
                }
            }
        }

        return allSubLessons
    }



    // Insert language
    suspend fun insertLanguage(language: NoteLanguage): Long {
        return noteLanguageDao.insert(language)
    }

    // Insert stage
    suspend fun insertStage(stage: NoteStage): Long {
        return noteStageDao.insert(stage)
    }

    // Insert lesson
    suspend fun insertLesson(lesson: NoteLesson): Long {
        return noteLessonDao.insert(lesson)
    }

    // Insert sub-lesson
    suspend fun insertSubLesson(subLesson: NoteSubLesson): Long {
        return noteSubLessonDao.insert(subLesson)
    }
}
