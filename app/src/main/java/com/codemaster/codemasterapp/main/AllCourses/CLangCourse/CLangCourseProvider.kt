package com.codemaster.codemasterapp.main.AllCourses.CLangCourse

import com.codemaster.codemasterapp.main.data.Course


class CLangCourseProvider() {


    fun getCompleteCLangCourse(): Course {
        return Course(
            id = "c_course",
            language = "C",
            stages = listOf(
                CBeginnerCourse(),
                CIntermediateCourse(),
                CAdvancedCourse(),
                CExpertCourse()
            )
        )
    }
}