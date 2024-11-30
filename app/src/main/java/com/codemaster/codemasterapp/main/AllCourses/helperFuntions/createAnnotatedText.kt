package com.codemaster.codemasterapp.main.AllCourses.helperFuntions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

fun createAnnotatedText(text: String, styledText: List<String> = emptyList()): AnnotatedString {
    return buildAnnotatedString {
        val text =
            text

        append(text)

        val styledWords = styledText
        for (word in styledWords) {
            val start = text.indexOf(word)
            if (start >= 0) {
                addStyle(
                    style = SpanStyle(
                        fontSize = 16.sp,
                        color = Color(0xFF05B3E7),
                        fontWeight = FontWeight.Bold
                    ),
                    start = start,
                    end = start + word.length
                )
            }
        }
    }
}