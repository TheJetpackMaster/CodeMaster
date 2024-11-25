package com.codemaster.codemasterapp.main.DataBase

import android.content.Context
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
}
