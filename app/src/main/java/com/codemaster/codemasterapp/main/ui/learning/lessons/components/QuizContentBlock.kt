package com.codemaster.codemasterapp.main.ui.learning.lessons.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.LessonStatus


@Composable
fun QuizContentBlock(
    contentBlock: ContentBlock.QuizContentBlock,
    isAnswerGiven: MutableState<Boolean>,
    answerFeedbackText: MutableState<String>,
    subLessonStatus: LessonStatus = LessonStatus.ACTIVE
) {
    // Track the selected answer and feedback state
    var userAnswer by remember { mutableStateOf("") }
    var isAnswerCorrect by remember { mutableStateOf(false) }
    var feedback by remember { mutableStateOf("") }
//    var isAnswerGiven by remember { mutableStateOf(false) }

    // Function to handle when an option is selected
    fun onOptionSelected(option: String) {
        userAnswer = option
        isAnswerGiven.value = false // Reset feedback until confirmed
//        feedback = "" // Clear previous feedback
    }

    LaunchedEffect(Unit) {
        if(subLessonStatus == LessonStatus.COMPLETED){
            userAnswer = contentBlock.correctAnswer
        }
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        // Question Text
        Text(
            text = contentBlock.question,
            style = TextStyle(fontSize = 16.sp, color = Color.White),
            lineHeight = 24.sp
        )

        // Radio Button Options
        contentBlock.options.forEach { option ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                RadioButton(
                    selected = userAnswer == option,
                    onClick = { onOptionSelected(option) },
                    colors = RadioButtonDefaults.colors(selectedColor = Color(0xFF66116E))
                )
                Text(
                    text = option,
                    style = TextStyle(fontSize = 14.sp, color = Color.White)
                )
            }
        }

        // Submit Button
        Spacer(Modifier.height(16.dp))

        Button(
            onClick = {
                if (userAnswer.isNotEmpty()) {
                    isAnswerCorrect = userAnswer == contentBlock.correctAnswer
                    feedback = if (isAnswerCorrect) "Correct!" else "Incorrect. Try again!"
                    answerFeedbackText.value = if (isAnswerCorrect) "T" else "F"
                    isAnswerGiven.value = true
                }
            },
            enabled = userAnswer.isNotEmpty(),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF66116E)),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Submit Answer",
                style = TextStyle(fontSize = 14.sp, color = Color.White)
            )
        }

        // Feedback Text
        if (isAnswerGiven.value) {
            Text(
                text = feedback,
                style = TextStyle(
                    fontSize = 18.sp,
                    color = if (isAnswerCorrect) Color.Green else Color.Red
                ),
                modifier = Modifier.padding(top = 16.dp)
            )
        }
    }
}
