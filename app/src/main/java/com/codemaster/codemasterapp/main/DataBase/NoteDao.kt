package com.codemaster.codemasterapp.main.DataBase

import androidx.room.*
import com.codemaster.codemasterapp.main.data.Note
import kotlinx.coroutines.flow.Flow


@Dao
interface NoteDao {

    // Insert or update a note
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: Note)

    // Update an existing note
    @Update
    suspend fun update(note: Note)

    // Get a note by its ID
    @Query("SELECT * FROM Note WHERE id = :noteId")
    suspend fun getNoteById(noteId: String): Note?

    // Get all notes as a Flow
    @Query("SELECT * FROM Note")
    fun getAllNotes(): Flow<List<Note>>

    // Delete a specific note
    @Delete
    suspend fun delete(note: Note)

    // Delete all notes
    @Query("DELETE FROM Note")
    suspend fun deleteAllNotes()
}

