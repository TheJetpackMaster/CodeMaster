package com.codemaster.codemasterapp.main.ui.viewModels


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codemaster.codemasterapp.main.DataBase.NoteRepository
import com.codemaster.codemasterapp.main.data.Note
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    private val repository: NoteRepository
) : ViewModel() {

    val allNotes = repository.getAllNotes() // Use this to observe notes in the UI

    fun addOrUpdateNote(note: Note, onResult: (String) -> Unit) = viewModelScope.launch {
        try {
            val noteId = repository.addOrUpdateNote(note)
            onResult(noteId)
        } catch (e: Exception) {
            onResult("") // Handle error case
        }
    }

    fun getNoteById(noteId: String, onResult: (Note?) -> Unit) = viewModelScope.launch {
        try {
            val note = repository.getNoteById(noteId)
            onResult(note)
        } catch (e: Exception) {
            onResult(null)
        }
    }

    fun deleteNote(note: Note, onComplete: (Boolean) -> Unit) = viewModelScope.launch {
        try {
            repository.deleteNote(note)
            onComplete(true)
        } catch (e: Exception) {
            onComplete(false)
        }
    }

    fun deleteAllNotes(onComplete: (Boolean) -> Unit) = viewModelScope.launch {
        try {
            repository.deleteAllNotes()
            onComplete(true)
        } catch (e: Exception) {
            onComplete(false)
        }
    }
}

