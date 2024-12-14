package com.codemaster.codemasterapp.main.DataBase


import com.codemaster.codemasterapp.main.data.Note
import kotlinx.coroutines.flow.Flow


class NoteRepository(private val noteDao: NoteDao) {

    suspend fun addOrUpdateNote(note: Note): String {
        noteDao.insert(note)
        return note.id
    }

    suspend fun getNoteById(noteId: String): Note? {
        return noteDao.getNoteById(noteId)
    }

    fun getAllNotes(): Flow<List<Note>> = noteDao.getAllNotes()

    suspend fun deleteNote(note: Note) = noteDao.delete(note)

    suspend fun deleteAllNotes() = noteDao.deleteAllNotes()
}

