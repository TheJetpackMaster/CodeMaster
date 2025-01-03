package com.codemaster.codemasterapp.main.AllCourses.PythonCourse

import com.codemaster.codemasterapp.main.data.Course

class PythonCourseProvider {
    fun getCompletePythonCourse(): Course {
        return Course(
            id = "python_course",
            name = "Python",
            stages = listOf(
                PythonBeginnerCourse(),
                PythonIntermediateCourse(),
                PythonAdvancedCourse(),
                PythonExpertCourse()
            )
        )
    }
}