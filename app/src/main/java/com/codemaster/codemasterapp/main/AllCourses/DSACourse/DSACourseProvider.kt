package com.codemaster.codemasterapp.main.AllCourses.DSACourse;

import com.codemaster.codemasterapp.main.AllCourses.CLangCourse.CAdvancedCourse
import com.codemaster.codemasterapp.main.AllCourses.CLangCourse.CBeginnerCourse
import com.codemaster.codemasterapp.main.AllCourses.CLangCourse.CExpertCourse
import com.codemaster.codemasterapp.main.AllCourses.CLangCourse.CIntermediateCourse
import com.codemaster.codemasterapp.main.data.Course

class DSACourseProvider {
    fun getCompleteDSACourse(): Course {
        return Course(
            id = "dsa_course",
            language = "DSA | C++",
            stages = listOf(
                DSABeginnerCourse(),
                DSAIntermediateCourse(),
                DSAAdvancedCourse(),
                DSAExpertCourse()
            )
        )
    }
}