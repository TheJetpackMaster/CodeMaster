package com.codemaster.codemasterapp.main.AllCourses.CppCourse


import com.codemaster.codemasterapp.main.data.Course

class CPPCourseProvider {
    fun getCompleteCPPCourse(): Course {
        return Course(
            id = "cpp_course",
            name = "C++",
            stages = listOf(
                cppBeginnerCourse(),
                cppIntermediateCourse(),
                cppAdvancedCourse(),
                cppExpertCourse()
            )
        )
    }
}
