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
import com.codemaster.codemasterapp.main.data.LearningProgress
import com.codemaster.codemasterapp.main.data.LessonStatus

@Entity(tableName = "user_learning_progress")
data class UserLearningProgress(
    @PrimaryKey
    @ColumnInfo(name = "last_course_id")
    val lastCourseId: String,

    @ColumnInfo(name = "last_stage_id")
    val lastStageId: String,

    @ColumnInfo(name = "last_lesson_id")
    val lastLessonId: String,

    @ColumnInfo(name = "last_sub_lesson_name")
    val lastSubLessonName: String? = null,

    @ColumnInfo(name = "last_stage_name")
    val lastStageName: String? = null,

    @ColumnInfo(name = "last_sub_lesson_id")
    val lastSubLessonId: String,

    @ColumnInfo(name = "last_sub_lesson_index")
    val lastSubLessonIndex: Int = 0,

    @ColumnInfo(name = "last_updated")
    val lastUpdated: Long // Save timestamp for ordering
)


@Dao
interface UserLearningProgressDao {

    // Query to fetch the last saved progress
    @Query("SELECT * FROM user_learning_progress ORDER BY last_updated DESC LIMIT 1")
    suspend fun getLastSavedProgress(): UserLearningProgress?

    // Check if a progress entry exists for a specific courseId
    @Query("SELECT * FROM user_learning_progress WHERE last_course_id = :courseId")
    suspend fun getProgressForCourse(courseId: String): UserLearningProgress?

    // Insert or update user learning progress
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveUserLearningProgress(userLearningProgress: UserLearningProgress)
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

class UserLearningProgressRepository(private val dao: UserLearningProgressDao) {

    suspend fun saveProgress(progress: LearningProgress) {
        val userProgress = UserLearningProgress(
            lastCourseId = progress.courseId,
            lastStageId = progress.stageId,
            lastLessonId = progress.lessonId,
            lastSubLessonName = progress.subLessonName,
            lastStageName = progress.stageName,
            lastSubLessonId = progress.subLessonId,
            lastSubLessonIndex = progress.subLessonIndex,
            lastUpdated = System.currentTimeMillis() // Save current timestamp
        )
        dao.saveUserLearningProgress(userProgress)
    }

    suspend fun loadLastSavedProgress(): LearningProgress? {
        val userProgress = dao.getLastSavedProgress()
        return userProgress?.let {
            LearningProgress(
                courseId = it.lastCourseId,
                stageId = it.lastStageId,
                lessonId = it.lastLessonId,
                subLessonId = it.lastSubLessonId,
                subLessonName = it.lastSubLessonName.orEmpty(),
                stageName = it.lastStageName.orEmpty(),
                subLessonIndex = it.lastSubLessonIndex
            )
        }
    }

    // Load progress for a specific course by its courseId
    suspend fun loadProgressForCourse(courseId: String): LearningProgress? {
        val userProgress = dao.getProgressForCourse(courseId)
        return userProgress?.let {
            LearningProgress(
                courseId = it.lastCourseId,
                stageId = it.lastStageId,
                lessonId = it.lastLessonId,
                subLessonId = it.lastSubLessonId,
                subLessonName = it.lastSubLessonName.orEmpty(),
                stageName = it.lastStageName.orEmpty(),
                subLessonIndex = it.lastSubLessonIndex
            )
        }
    }
}
