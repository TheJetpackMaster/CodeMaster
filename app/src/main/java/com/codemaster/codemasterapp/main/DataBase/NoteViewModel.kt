package com.codemaster.codemasterapp.main.DataBase


import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.codemaster.codemasterapp.main.data.Note
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    private val repository: NoteRepository,
) : ViewModel() {

    // Function to add or update a note
    fun addOrUpdateNote(note: Note, onResult: (String) -> Unit) = viewModelScope.launch {
        try {
            val noteId = repository.addOrUpdateNote(note)
            Log.d("NoteViewModel", "Note added or updated successfully: $noteId")
            onResult(noteId)
        } catch (e: Exception) {
            Log.e("NoteViewModel", "Error adding or updating note: ${e.message}")
            onResult("")
        }
    }

    // Function to get a note by ID
    fun getNoteById(noteId: String, onResult: (Note?) -> Unit) = viewModelScope.launch {
        try {
            val note = repository.getNoteById(noteId)
            Log.d("NoteViewModel", "Note retrieved successfully: $note")
            onResult(note)
        } catch (e: Exception) {
            Log.e("NoteViewModel", "Error retrieving note: ${e.message}")
            onResult(null)
        }
    }

    // Function to get all notes as a Flow
    fun getAllNotes(): Flow<List<Note>> {
        return repository.getAllNotes()
    }

    // Function to delete a specific note
    fun deleteNote(note: Note, onComplete: (Boolean) -> Unit) = viewModelScope.launch {
        try {
            repository.deleteNote(note)
            Log.d("NoteViewModel", "Note deleted successfully.")
            onComplete(true)
        } catch (e: Exception) {
            Log.e("NoteViewModel", "Error deleting note: ${e.message}")
            onComplete(false)
        }
    }

    // Function to delete all notes
    fun deleteAllNotes(onComplete: (Boolean) -> Unit) = viewModelScope.launch {
        try {
            repository.deleteAllNotes()
            Log.d("NoteViewModel", "All notes deleted successfully.")
            onComplete(true)
        } catch (e: Exception) {
            Log.e("NoteViewModel", "Error deleting all notes: ${e.message}")
            onComplete(false)
        }
    }
}
