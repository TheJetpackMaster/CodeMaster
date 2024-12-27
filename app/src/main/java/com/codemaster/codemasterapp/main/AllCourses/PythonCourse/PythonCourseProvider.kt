package com.codemaster.codemasterapp.main.AllCourses.PythonCourse

import com.codemaster.codemasterapp.main.AllCourses.CppCourse.cppAdvancedCourse
import com.codemaster.codemasterapp.main.AllCourses.CppCourse.cppBeginnerCourse
import com.codemaster.codemasterapp.main.AllCourses.CppCourse.cppExpertCourse
import com.codemaster.codemasterapp.main.AllCourses.CppCourse.cppIntermediateCourse
import com.codemaster.codemasterapp.main.data.Course

class PythonCourseProvider {
    fun getCompletePythonCourse(): Course {
        return Course(
            id = "python_course",
            language = "Python",
            stages = listOf(
                PythonBeginnerCourse(),
                PythonIntermediateCourse(),
                PythonAdvancedCourse(),
                PythonExpertCourse()
            )
        )
    }
}