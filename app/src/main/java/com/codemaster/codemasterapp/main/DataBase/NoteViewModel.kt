package com.codemaster.codemasterapp.main.DataBase


import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.codemaster.codemasterapp.main.data.NoteLanguage
import com.codemaster.codemasterapp.main.data.NoteLesson
import com.codemaster.codemasterapp.main.data.NoteStage
import com.codemaster.codemasterapp.main.data.NoteSubLesson
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    private val repository: NoteRepository,
) : ViewModel() {

    fun addNote(
        languageName: String,
        stageName: String,
        lessonNumber: Int,
        subLessonNumber: Float,
        title: String,
        description: String,
    ) {
        viewModelScope.launch {
            val language = repository.getLanguageByName(languageName)
                ?: NoteLanguage(name = languageName).also {
                    it.id = repository.insertLanguage(it)
                }

            val stage = repository.getStageByName(language.id, stageName)
                ?: NoteStage(languageId = language.id, name = stageName).also {
                    it.id = repository.insertStage(it)
                }

            val lesson = repository.getLessonByNumber(stage.id, lessonNumber)
                ?: NoteLesson(stageId = stage.id, lessonNumber = lessonNumber).also {
                    it.id = repository.insertLesson(it)
                }

            val subLesson = NoteSubLesson(
                lessonId = lesson.id,
                subLessonNumber = subLessonNumber,
                title = title,
                description = description
            )
            repository.insertSubLesson(subLesson)
        }
    }

    suspend fun getNotes(
        languageName: String,
        stageName: String,
        lessonNumber: Int,
        subLessonNumber: Float,
    ): List<NoteSubLesson> {
        return repository.getNotes(languageName, stageName, lessonNumber, subLessonNumber)
    }
}
