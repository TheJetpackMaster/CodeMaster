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
    fun provideLanguageDao(database: NoteDatabase): LanguageDao = database.languageDao()

    @Provides
    fun provideStageDao(database: NoteDatabase): StageDao = database.stageDao()

    @Provides
    fun provideLessonDao(database: NoteDatabase): LessonDao = database.lessonDao()

    @Provides
    fun provideSubLessonDao(database: NoteDatabase): SubLessonDao = database.subLessonDao()

    @Provides
    @Singleton
    fun provideNoteRepository(
        languageDao: LanguageDao,
        stageDao: StageDao,
        lessonDao: LessonDao,
        subLessonDao: SubLessonDao
    ): NoteRepository {
        return NoteRepository(languageDao, stageDao, lessonDao, subLessonDao)
    }
}
