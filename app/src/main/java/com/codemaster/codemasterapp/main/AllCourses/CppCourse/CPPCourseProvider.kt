package com.codemaster.codemasterapp.main.AllCourses.CppCourse


import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.Course
import com.codemaster.codemasterapp.main.data.Lesson
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.data.Stage

class CPPCourseProvider {


    fun getCompleteCPPCourse(): Course {
        return Course(
            id = "cpp_course",
            language = "C++",
            stages = listOf(
                cppBeginnerCourse(),
                cppIntermediateCourse(),
                cppAdvancedCourse(),
                cppExpertCourse()
            )
        )
    }
}
