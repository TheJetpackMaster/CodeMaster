package com.codemaster.codemasterapp.main.AllCourses.DSACourse;

import com.codemaster.codemasterapp.main.data.Course

class DSACourseProvider {
    fun getCompleteDSACourse(): Course {
        return Course(
            id = "dsa_course",
            name = "DSA | C++",
            stages = listOf(
                DSABeginnerCourse(),
                DSAIntermediateCourse(),
                DSAAdvancedCourse(),
                DSAExpertCourse()
            )
        )
    }
}