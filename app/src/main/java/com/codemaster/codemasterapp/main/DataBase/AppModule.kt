package com.codemaster.codemasterapp.main.DataBase

import android.content.Context
import androidx.room.Room
import com.codemaster.codemasterapp.main.DataBase.lessonStatusDB.LessonStatusDB
import com.codemaster.codemasterapp.main.DataBase.lessonStatusDB.LessonStatusDao
import com.codemaster.codemasterapp.main.DataBase.lessonStatusDB.LessonStatusRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): NoteDatabase {
        return NoteDatabase.getDatabase(context)
    }

    @Provides
    fun provideNoteLanguageDao(database: NoteDatabase): NoteLanguageDao = database.noteLanguageDao()

    @Provides
    fun provideNoteStageDao(database: NoteDatabase): NoteStageDao = database.noteStageDao()

    @Provides
    fun provideNoteLessonDao(database: NoteDatabase): NoteLessonDao = database.noteLessonDao()

    @Provides
    fun provideNoteSubLessonDao(database: NoteDatabase): NoteSubLessonDao = database.noteSubLessonDao()

    @Provides
    @Singleton
    fun provideNoteRepository(
        noteLanguageDao: NoteLanguageDao,
        noteStageDao: NoteStageDao,
        noteLessonDao: NoteLessonDao,
        noteSubLessonDao: NoteSubLessonDao
    ): NoteRepository {
        return NoteRepository(noteLanguageDao, noteStageDao, noteLessonDao, noteSubLessonDao)
    }


    @Provides
    @Singleton
    fun provideLessonStatusDatabase(@ApplicationContext context: Context): LessonStatusDB {
        return LessonStatusDB.getDatabase(context)
    }

    @Provides
    fun provideLessonStatusDao(database: LessonStatusDB): LessonStatusDao {
        return database.lessonStatusDao()
    }

    @Provides
    @Singleton
    fun provideLessonStatusRepository(lessonStatusDao: LessonStatusDao): LessonStatusRepo {
        return LessonStatusRepo(lessonStatusDao)
    }
}
