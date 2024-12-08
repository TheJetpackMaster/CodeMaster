package com.codemaster.codemasterapp.main.DataBase


import android.util.Log
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

    fun addOrUpdateSubLesson(
        languageName: String,
        stageName: String,
        lessonNumber: Int,
        subLessonNumber: Float,
        title: String,
        description: String
    ) = viewModelScope.launch {
        try {
            repository.getOrInsertSubLesson(
                languageName = languageName,
                stageName = stageName,
                lessonNumber = lessonNumber,
                subLessonNumber = subLessonNumber,
                title = title,
                description = description
            )
            Log.d("NoteViewModel", "Sub-lesson added or updated successfully.")
        } catch (e: Exception) {
            Log.e("NoteViewModel", "Error adding or updating sub-lesson: ${e.message}")
        }
    }

    // Function to retrieve sub-lesson by names
    fun getSubLessonByNames(
        languageName: String,
        stageName: String,
        lessonNumber: Int,
        subLessonNumber: Float,
        onResult: (NoteSubLesson?) -> Unit
    ) = viewModelScope.launch {
        try {
            val subLesson = repository.getSubLessonByNames(
                languageName = languageName,
                stageName = stageName,
                lessonNumber = lessonNumber,
                subLessonNumber = subLessonNumber
            )
            onResult(subLesson)
        } catch (e: Exception) {
            Log.e("NoteViewModel", "Error retrieving sub-lesson: ${e.message}")
            onResult(null)
        }
    }

    // Function to get all sub-lessons
    fun getAllSubLessons(onResult: (List<NoteSubLesson>) -> Unit) = viewModelScope.launch {
        try {
            val subLessons = repository.getAllSubLessons()
            onResult(subLessons)
        } catch (e: Exception) {
            Log.e("NoteViewModel", "Error retrieving all sub-lessons: ${e.message}")
            onResult(emptyList()) // Return an empty list in case of error
        }
    }

}

