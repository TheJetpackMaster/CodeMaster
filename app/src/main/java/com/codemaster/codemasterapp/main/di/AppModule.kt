package com.codemaster.codemasterapp.main.di



import android.content.Context
import com.codemaster.codemasterapp.main.DataBase.NoteDao
import com.codemaster.codemasterapp.main.DataBase.NoteDatabase
import com.codemaster.codemasterapp.main.DataBase.NoteRepository
import com.codemaster.codemasterapp.main.DataBase.continueLearningprogressDB.UserLearningProgressDB
import com.codemaster.codemasterapp.main.DataBase.continueLearningprogressDB.UserLearningProgressDao
import com.codemaster.codemasterapp.main.DataBase.continueLearningprogressDB.UserLearningProgressRepository
import com.codemaster.codemasterapp.main.DataBase.lessonStatusDB.LessonStatusDB
import com.codemaster.codemasterapp.main.DataBase.lessonStatusDB.LessonStatusDao
import com.codemaster.codemasterapp.main.DataBase.lessonStatusDB.LessonStatusRepo
import com.codemaster.codemasterapp.main.DataBase.userProfileDB.UserProfileDB
import com.codemaster.codemasterapp.main.DataBase.userProfileDB.UserProfileDao
import com.codemaster.codemasterapp.main.DataBase.userProfileDB.UserProfileRepository
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
    fun provideNoteDatabase(@ApplicationContext context: Context): NoteDatabase {
        return NoteDatabase.Companion.getDatabase(context)
    }

    @Provides
    fun provideNoteDao(database: NoteDatabase): NoteDao {
        return database.noteDao()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(noteDao: NoteDao): NoteRepository {
        return NoteRepository(noteDao)
    }

    // Lesson Status
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


    // Continue Progress
    @Provides
    @Singleton
    fun provideUserLearningProgressDatabase(@ApplicationContext context: Context): UserLearningProgressDB {
        return UserLearningProgressDB.getDatabase(context)
    }

    @Provides
    fun provideUserLearningProgressDao(database: UserLearningProgressDB): UserLearningProgressDao {
        return database.UserLearningProgressDao()
    }

    @Provides
    @Singleton
    fun provideUserLearningProgressRepository(userLearningProgressDao: UserLearningProgressDao): UserLearningProgressRepository {
        return UserLearningProgressRepository(userLearningProgressDao)
    }


    //User profile
    @Provides
    @Singleton
    fun provideUserProfileDatabase(@ApplicationContext context: Context): UserProfileDB {
        return UserProfileDB.getDatabase(context)
    }

    @Provides
    fun provideUserProfileDao(database: UserProfileDB): UserProfileDao {
        return database.userProfileDao()
    }

    @Provides
    @Singleton
    fun provideUserProfileRepository(userProfileDao: UserProfileDao): UserProfileRepository {
        return UserProfileRepository(userProfileDao)
    }

}
