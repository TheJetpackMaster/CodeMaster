package com.codemaster.codemasterapp.main.DataBase.lessonStatusDB

import androidx.room.TypeConverter
import com.codemaster.codemasterapp.main.data.LessonStatus

class Converters {

    @TypeConverter
    fun fromLessonStatus(status: LessonStatus): String {
        return status.name  // Converts the enum to a string
    }

    @TypeConverter
    fun toLessonStatus(status: String): LessonStatus {
        return LessonStatus.valueOf(status)  // Converts the string back to the enum
    }
}
