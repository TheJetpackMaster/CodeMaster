package com.codemaster.codemasterapp.main.DataBase


import android.util.Log
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.Note
import kotlinx.coroutines.flow.Flow

class NoteRepository(private val noteDao: NoteDao) {

    // Insert a new note
    suspend fun insertNote(note: Note): String {
        noteDao.insert(note)
        return note.id
    }

    // Update an existing note
    suspend fun updateNote(note: Note) {
        noteDao.insert(note) // Using `REPLACE` strategy in DAO will update if the ID exists
    }

    // Get a note by its ID
    suspend fun getNoteById(noteId: String): Note? {
        return noteDao.getNoteById(noteId)
    }

    // Get all notes as a Flow
    fun getAllNotes(): Flow<List<Note>> {
        return noteDao.getAllNotes()
    }

    // Delete a note
    suspend fun deleteNote(note: Note) {
        noteDao.delete(note)
    }
}
