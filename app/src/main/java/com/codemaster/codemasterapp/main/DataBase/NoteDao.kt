package com.codemaster.codemasterapp.main.DataBase

import androidx.room.*
import com.codemaster.codemasterapp.main.data.Note
import kotlinx.coroutines.flow.Flow


@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: Note)

    @Query("SELECT * FROM Note WHERE id = :noteId")
    suspend fun getNoteById(noteId: String): Note?

    @Query("SELECT * FROM Note")
    fun getAllNotes(): Flow<List<Note>> // Use Flow instead of LiveData

    @Delete
    suspend fun delete(note: Note)
}
