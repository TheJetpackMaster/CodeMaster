package com.codemaster.codemasterapp.main.AllCourses.helperFuntions

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import com.codemaster.codemasterapp.main.data.Stage

fun createSimpleText(text: String): AnnotatedString{
    return  buildAnnotatedString {
        append(text)
    }
}