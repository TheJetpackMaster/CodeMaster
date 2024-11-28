package com.codemaster.codemasterapp.main.AllCourses.helperFuntions

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import com.codemaster.codemasterapp.main.data.Stage

fun createSimpleText(text: Stage): AnnotatedString{
    return  buildAnnotatedString {
        append("Now, let’s level up! In modern C++, you can use ranges and expressions within a switch-case. Let’s look at an example of checking ranges:")
    }
}