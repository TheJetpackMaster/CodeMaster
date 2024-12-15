package com.codemaster.codemasterapp.main.ui.learning.lessons.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.LessonStatus
import kotlin.collections.set

@Composable
fun InteractiveCodeBlockView(
    contentBlock: ContentBlock.InteractiveCodeBlock,
    isAnswerGiven: MutableState<Boolean>,
    answerFeedbackText: MutableState<String>,
    subLessonStatus: LessonStatus = LessonStatus.ACTIVE

    ) {

    // Track the incomplete code and user answer state
    var codeWithAnswer by remember { mutableStateOf(contentBlock.incompleteCode) }
    var userAnswer by remember { mutableStateOf(contentBlock.userAnswer ?: "") }
    var feedback by remember { mutableStateOf("") }


    var isAnswerCorrect by remember { mutableStateOf(false) }
    val buttonState = remember {
        mutableStateMapOf<String, String>().apply {
            contentBlock.options.forEach { put(it, it) } // Initialize with all options
        }
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

        // Code Block Display
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black, shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
        ) {
            Text(
                text = codeWithAnswer.replace(
                    "___",
                    userAnswer.takeIf { it.isNotEmpty() } ?: "___ (Select Option)"
                ),
                style = TextStyle(fontSize = 16.sp, color = Color.White)
            )
        }


        // Action Buttons (Clear, Reverse, Play)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Left: Clear and Reverse Buttons
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {

                //Reverse Button
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .clickable(onClick = {
                            userAnswer = ""
                            codeWithAnswer = contentBlock.incompleteCode
                            feedback = ""
                            buttonState.clear()
                            contentBlock.options.forEach { buttonState[it] = it }
                            isAnswerGiven.value = false
                            answerFeedbackText.value = ""

                        })
                        .background(Color(0xFF2D3040).copy(alpha = 0.3f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Refresh,
                        contentDescription = "Clear",
                        tint = Color.White
                    )
                }

                // Clear Button
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .clickable(onClick = {
                            // Add logic for reversing actions if needed
                            feedback = "Undo not implemented yet!"
                        })
                        .background(Color(0xFF2D3040).copy(alpha = 0.3f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Clear,
                        contentDescription = "Reverse",
                        tint = Color.White
                    )
                }
            }

            // Right: Play Button
            Box(
                modifier = Modifier
                    .size(36.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .clickable(onClick = {
                        if (userAnswer.isNotEmpty()) {
                            isAnswerCorrect = userAnswer == contentBlock.correctAnswer
                            feedback = if (isAnswerCorrect) "Correct!" else "Try Again!"
                            answerFeedbackText.value = if (isAnswerCorrect) "T" else "F"
                            isAnswerGiven.value = true
                        }
                    })
                    .background(Color(0xFF66116E).copy(alpha = 0.3f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "Play",
                    tint = Color.White
                )
            }
        }

        Spacer(Modifier.height(6.dp))

        // Option Buttons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            contentBlock.options.forEach { option ->
                Button(
                    onClick = {
                        // Reset the previous button
                        if (userAnswer.isNotEmpty()) {
                            buttonState[userAnswer] = userAnswer
                        }

                        // Update the selected answer
                        userAnswer = option
                        codeWithAnswer = contentBlock.incompleteCode.replace("___", option)
                        buttonState[option] = "" // Mark this button as selected
                        isAnswerGiven.value = false // Reset feedback until confirmed

                    },
                    enabled = buttonState.getOrElse(option) { option }
                        .isNotEmpty() && !isAnswerGiven.value,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF2D3040),
                        disabledContainerColor = Color(0xFF242734)
                    ),
                    shape = RoundedCornerShape(8.dp),
                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp),
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(),
                ) {
                    Text(
                        text = buttonState.getOrElse(option) { option },
                        style = TextStyle(fontSize = 14.sp, color = Color.White)
                    )
                }
            }
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