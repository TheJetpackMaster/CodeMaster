package com.codemaster.codemasterapp.main.DataBase


import com.codemaster.codemasterapp.main.data.Note
import kotlinx.coroutines.flow.Flow


class NoteRepository(private val noteDao: NoteDao) {

    /**
     * Add or update a note. If the note already exists (by ID), it will be updated.
     * If the note is new, it will be added.
     */
    suspend fun addOrUpdateNote(note: Note): String {
        noteDao.insert(note) // Using `REPLACE` strategy in DAO handles both insert and update
        return note.id
    }

    /**
     * Get a note by its ID.
     */
    suspend fun getNoteById(noteId: String): Note? {
        return noteDao.getNoteById(noteId)
    }

    /**
     * Get all notes as a Flow. Useful for observing changes in real time.
     */
    fun getAllNotes(): Flow<List<Note>> {
        return noteDao.getAllNotes()
    }

    /**
     * Delete a specific note.
     */
    suspend fun deleteNote(note: Note) {
        noteDao.delete(note)
    }

    /**
     * Delete all notes from the database.
     */
    suspend fun deleteAllNotes() {
        noteDao.deleteAllNotes()
    }
}
