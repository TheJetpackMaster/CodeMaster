package com.codemaster.codemasterapp.main.DataBase.continueLearningprogressDB;

import android.content.Context
import androidx.room.ColumnInfo;
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity;
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey;
import androidx.room.Query
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.codemaster.codemasterapp.main.DataBase.lessonStatusDB.Converters
import com.codemaster.codemasterapp.main.DataBase.lessonStatusDB.LessonStatusDao
import com.codemaster.codemasterapp.main.DataBase.lessonStatusDB.LessonStatusEntity
import com.codemaster.codemasterapp.main.data.LessonStatus

@Entity(tableName = "user_learning_progress")
data class UserLearningProgress(
    @PrimaryKey
    @ColumnInfo(name = "last_sub_lesson_id")
    val lastSubLessonId: String,

    @ColumnInfo(name = "last_course_id")
    val lastCourseId: String,

    @ColumnInfo(name = "last_stage_id")
    val lastStageId: String,

    @ColumnInfo(name = "last_lesson_id")
    val lastLessonId: String,

    )

@Dao
interface UserLearningProgressDao {

    @Query("SELECT * FROM user_learning_progress WHERE last_sub_lesson_id = :subLessonId")
    suspend fun getUserLearningProgress(subLessonId: String): UserLearningProgress?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateUserLearningProgress(userLearningProgress: UserLearningProgress)
}


@Database(entities = [UserLearningProgress::class], version = 1, exportSchema = false)
abstract class UserLearningProgressDB : RoomDatabase() {
    abstract fun UserLearningProgressDao(): UserLearningProgressDao

    companion object{
        @Volatile
        private var INSTANCE: UserLearningProgressDB? = null

        fun getDatabase(context: Context): UserLearningProgressDB {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserLearningProgressDB::class.java,
                    "user_learning_progress_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}

class UserLearningProgressRepository(private val userLearningProgressDao: UserLearningProgressDao) {

    suspend fun getUserLearningProgress(subLessonId: String): UserLearningProgress? {
        return userLearningProgressDao.getUserLearningProgress(subLessonId)
    }

    suspend fun updateUserLearningProgress(userLearningProgress: UserLearningProgress) {
        userLearningProgressDao.updateUserLearningProgress(userLearningProgress)
    }
}