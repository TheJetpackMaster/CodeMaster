package com.codemaster.codemasterapp.main.DataBase.lessonStatusDB

import com.codemaster.codemasterapp.main.data.Course
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.ui.viewModels.AllCoursesProvider

class LessonStatusRepo(private val dao: LessonStatusDao) {

    // Add or update a lesson status
    suspend fun addOrUpdateLessonStatus(lessonStatus: LessonStatusEntity) {
        dao.insertStatus(lessonStatus)
    }

    // Get a lesson status by its ID
    suspend fun getLessonStatusById(lessonId: String): LessonStatusEntity? {
        return dao.getStatusById(lessonId)
    }

    // Get all lesson statuses
    suspend fun getAllLessonStatuses(): List<LessonStatusEntity> {
        return dao.getAllLessonStatuses()
    }

    // Update a lesson status
    suspend fun updateLessonStatus(lessonId: String, status: LessonStatus) {
        dao.updateStatus(lessonId, status)
    }

    // Clear all lesson statuses
    suspend fun clearAllLessonStatuses() {
        dao.clearAllStatuses()
    }

    // Clear a specific lesson status
    suspend fun clearSingleLessonStatus(lessonId: String) {
        dao.clearSingleLessonStatus(lessonId)
    }

    // Check the status of all sub-lessons for a lesson
    suspend fun updateLessonStatusIfAllSubLessonsCompleted(
        lessonId: String,
        subLessonIds: List<String>
    ) {
        // Get all sub-lessons for the given lesson
        val subLessonStatuses = dao.getLessonStatusesByIds(subLessonIds)

        // Check if all sub-lessons are completed
        val allSubLessonsCompleted = subLessonStatuses.all { it.status == LessonStatus.COMPLETED }

        if (allSubLessonsCompleted) {
            // If all sub-lessons are completed, update the parent lesson to completed
            dao.updateStatus(lessonId, LessonStatus.COMPLETED)

            // Now set the first sub-lesson as active
            val firstSubLessonId = subLessonIds.firstOrNull()
            if (firstSubLessonId != null) {
                dao.updateStatus(firstSubLessonId, LessonStatus.ACTIVE)
            }

            // Optionally set the next sub-lesson as active as well (if any)
            val nextSubLessonId = subLessonIds.getOrNull(1)
            if (nextSubLessonId != null) {
                dao.updateStatus(nextSubLessonId, LessonStatus.ACTIVE)
            }
        }
    }
}
