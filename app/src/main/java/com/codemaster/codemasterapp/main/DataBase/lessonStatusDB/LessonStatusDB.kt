package com.codemaster.codemasterapp.main.DataBase.lessonStatusDB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters


@Database(entities = [LessonStatusEntity::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)  // Register the TypeConverter
abstract class LessonStatusDB : RoomDatabase() {
    abstract fun lessonStatusDao(): LessonStatusDao


    companion object{
        @Volatile
        private var INSTANCE: LessonStatusDB? = null

        fun getDatabase(context: Context): LessonStatusDB {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    LessonStatusDB::class.java,
                    "lesson_status_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}