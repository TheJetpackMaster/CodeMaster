package com.codemaster.codemasterapp.main.DataBase.lessonStatusDB;

import androidx.room.Dao
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.TypeConverters
import com.codemaster.codemasterapp.main.data.LessonStatus

@Entity(tableName = "lesson_status")
@TypeConverters(Converters::class)  // Register the TypeConverter
data class LessonStatusEntity(
    @PrimaryKey val id: String,  // ID of the lesson or sub-lesson
    val status: LessonStatus  // Enum stored as a String
)

@Dao
interface LessonStatusDao {

    // Insert or update a lesson status
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStatus(lessonStatus: LessonStatusEntity)

    // Get the status of a lesson by its ID
    @Query("SELECT * FROM lesson_status WHERE id = :lessonId LIMIT 1")
    suspend fun getStatusById(lessonId: String): LessonStatusEntity?

    // Get all lesson statuses
    @Query("SELECT * FROM lesson_status")
    suspend fun getAllLessonStatuses(): List<LessonStatusEntity>

    // Update a lesson status
    @Query("UPDATE lesson_status SET status = :status WHERE id = :lessonId")
    suspend fun updateStatus(lessonId: String, status: LessonStatus)

    // Get the statuses of all lessons by their IDs
    @Query("SELECT * FROM lesson_status WHERE id IN (:lessonIds)")
    suspend fun getLessonStatusesByIds(lessonIds: List<String>): List<LessonStatusEntity>


    // Delete all lesson statuses
    @Query("DELETE FROM lesson_status")
    suspend fun clearAllStatuses()

    // Delete a specific lesson status
    @Query("DELETE FROM lesson_status WHERE id = :lessonId")
    suspend fun clearSingleLessonStatus(lessonId: String)
}

