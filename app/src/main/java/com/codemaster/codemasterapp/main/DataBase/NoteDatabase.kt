package com.codemaster.codemasterapp.main.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.NoteLanguage
import com.codemaster.codemasterapp.main.data.NoteLesson
import com.codemaster.codemasterapp.main.data.NoteStage
import com.codemaster.codemasterapp.main.data.NoteSubLesson
import com.codemaster.codemasterapp.main.data.Stage
import org.intellij.lang.annotations.Language

@Database(
    entities = [NoteLanguage::class, NoteStage::class, NoteLesson::class, NoteSubLesson::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteLanguageDao(): NoteLanguageDao
    abstract fun noteStageDao(): NoteStageDao
    abstract fun noteLessonDao(): NoteLessonDao
    abstract fun noteSubLessonDao(): NoteSubLessonDao

    companion object {
        @Volatile
        private var INSTANCE: NoteDatabase? = null

        fun getDatabase(context: Context): NoteDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NoteDatabase::class.java,
                    "note_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
