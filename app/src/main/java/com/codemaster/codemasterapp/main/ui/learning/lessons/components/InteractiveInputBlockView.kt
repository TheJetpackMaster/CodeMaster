package com.codemaster.codemasterapp.main.ui.learning.lessons.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.LessonStatus

//
//@OptIn(ExperimentalLayoutApi::class)
//@Composable
//fun InteractiveInputBlockView(
//    contentBlock: ContentBlock.InteractiveInputBlock,
//    isAnswerGiven: MutableState<Boolean>,
//    answerFeedbackText: MutableState<String>,
//    subLessonStatus: LessonStatus = LessonStatus.ACTIVE
//) {
//    // Manage user input for each blank separately
//    val userInputs = remember {
//        mutableStateListOf<String>().apply {
//            repeat(contentBlock.incompleteCode.split("___").size - 1) { add("") }
//        }
//    }
//
//    var feedback by remember { mutableStateOf("") }
//    var isCodeCorrect by remember { mutableStateOf(false) }
//
//    LaunchedEffect(Unit) {
//        if (subLessonStatus == LessonStatus.COMPLETED) {
//            val correctCodeParts = contentBlock.correctCode.split(" ") // Adjust delimiter as needed
//            correctCodeParts.forEachIndexed { index, correctAnswer ->
//                if (index < userInputs.size) {
//                    userInputs[index] = correctAnswer
//                }
//            }
//        }
//    }
//
//
//    Column(
//        modifier = Modifier
//            .fillMaxWidth(),
//        //.padding(16.dp),
//        verticalArrangement = Arrangement.spacedBy(10.dp)
//    ) {
//        // Question
//        Text(
//            text = contentBlock.question,
//            style = TextStyle(fontSize = 18.sp, color = Color.White),
//            modifier = Modifier.padding(bottom = 8.dp)
//        )
//
//        // Display code block with placeholders
//        Column(
//            modifier = Modifier
//                .background(Color.Black, shape = RoundedCornerShape(8.dp))
//                .padding(16.dp)
//                .fillMaxWidth()
//        ) {
//            // Process the incomplete code
//            contentBlock.incompleteCode.lines().forEach { line ->
//                Row(
//                    modifier = Modifier.fillMaxWidth(),
//                    // verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.Start
//                ) {
//                    val parts = line.split("___")
//                    parts.forEachIndexed { index, part ->
//                        // Add static text parts
//                        Text(
//                            text = part,
//                            style = TextStyle(fontSize = 16.sp, color = Color.White)
//                        )
//                        // Add input fields only where `___` exists
//                        if (index < parts.size - 1) {
//                            BasicTextField(
//                                value = userInputs[index],
//                                onValueChange = { userInputs[index] = it },
//                                textStyle = TextStyle(fontSize = 16.sp, color = Color.White),
//                                singleLine = true,
//                                cursorBrush = SolidColor(Color.White),
//                                modifier = Modifier
//                                    .width(30.dp)
//                                    .height(20.dp), // Adjusted height
//
//                                decorationBox = { innerTextField ->
//                                    if (userInputs[index].isEmpty()) {
//                                        Text(
//                                            text = "___",
//                                            style = TextStyle(
//                                                fontSize = 16.sp,
//                                                color = Color.White
//                                            ),
//                                        )
//                                    }
//                                    innerTextField()
//                                }
//                            )
//                            //
//                        }
//                    }
//
//                }
//            }
//        }
//
//        // Submit Button
//        Button(
//            onClick = {
//                val trimmedUserInputs = userInputs.map { it.replace("\\s".toRegex(), "") }
//                val trimmedCorrectCode = contentBlock.correctCode.replace("\\s".toRegex(), "")
//
//                isCodeCorrect = (trimmedUserInputs.joinToString("") == trimmedCorrectCode)
//                feedback = if (isCodeCorrect) "Correct!" else "Try Again!"
//                contentBlock.isCodeCorrect = isCodeCorrect
//                contentBlock.userInput = trimmedUserInputs.joinToString(" ")
//                answerFeedbackText.value = if (isCodeCorrect) "T" else "F"
//                isAnswerGiven.value = true
//            },
//            colors = ButtonDefaults.buttonColors(
//                containerColor = Color(0xFF66116E),
//                disabledContainerColor = Color(0xFF242734)
//            ),
//            shape = RoundedCornerShape(8.dp),
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text(text = "Submit", style = TextStyle(fontSize = 16.sp, color = Color.White))
//        }
//
//        // Feedback
//        if (isAnswerGiven.value) {
//            Text(
//                text = feedback,
//                style = TextStyle(
//                    fontSize = 18.sp,
//                    color = if (isCodeCorrect) Color.Green else Color.Red
//                ),
//                modifier = Modifier.padding(top = 16.dp)
//            )
//        }
//    }
//}


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun InteractiveInputBlockView(
    contentBlock: ContentBlock.InteractiveInputBlock,
    isAnswerGiven: MutableState<Boolean>,
    answerFeedbackText: MutableState<String>,
    subLessonStatus: LessonStatus = LessonStatus.ACTIVE
) {
    val userInputs = remember {
        mutableStateListOf<String>().apply {
            repeat(contentBlock.incompleteCode.split("___").size - 1) { add("") }
        }
    }

    var feedback by remember { mutableStateOf("") }
    var isCodeCorrect by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        if (subLessonStatus == LessonStatus.COMPLETED) {
            val correctCodeParts = contentBlock.correctCode.split(" ")
            correctCodeParts.forEachIndexed { index, correctAnswer ->
                if (index < userInputs.size) {
                    userInputs[index] = correctAnswer
                }
            }
        }
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(
            text = contentBlock.question,
            style = TextStyle(fontSize = 18.sp, color = Color.White),
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Column(
            modifier = Modifier
                .background(Color.Black, shape = RoundedCornerShape(8.dp))
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            contentBlock.incompleteCode.lines().forEach { line ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start
                ) {
                    val parts = line.split("___")
                    parts.forEachIndexed { index, part ->
                        Text(
                            text = part,
                            style = TextStyle(fontSize = 16.sp, color = Color.White)
                        )
                        if (index < parts.size - 1) {
                            BasicTextField(
                                value = userInputs[index],
                                onValueChange = { userInputs[index] = it },
                                textStyle = TextStyle(fontSize = 16.sp, color = Color.White),
                                singleLine = true,
                                cursorBrush = SolidColor(Color.White),
                                modifier = Modifier
                                    .width(IntrinsicSize.Min) // Dynamically adjust width based on content
                                    .wrapContentWidth(Alignment.Start)
                                    .height(20.dp), // Ensure consistent height

                                decorationBox = { innerTextField ->
                                    Box(
                                        contentAlignment = Alignment.CenterStart,
                                    ) {
                                        if (userInputs[index].isEmpty()) {
                                            Text(
                                                text = "___",
                                                style = TextStyle(
                                                    fontSize = 16.sp,
                                                    color = Color.White.copy(alpha = 0.5f)
                                                ),
                                            )
                                        }
                                        innerTextField()
                                    }
                                }
                            )
                        }
                    }
                }
            }
        }

        Button(
            onClick = {
                val trimmedUserInputs = userInputs.map { it.replace("\\s".toRegex(), "") }
                val trimmedCorrectCode = contentBlock.correctCode.replace("\\s".toRegex(), "")

                isCodeCorrect = (trimmedUserInputs.joinToString("") == trimmedCorrectCode)
                feedback = if (isCodeCorrect) "Correct!" else "Try Again!"
                contentBlock.isCodeCorrect = isCodeCorrect
                contentBlock.userInput = trimmedUserInputs.joinToString(" ")
                answerFeedbackText.value = if (isCodeCorrect) "T" else "F"
                isAnswerGiven.value = true
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF66116E),
                disabledContainerColor = Color(0xFF242734)
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Submit", style = TextStyle(fontSize = 16.sp, color = Color.White))
        }

        if (isAnswerGiven.value) {
            Text(
                text = feedback,
                style = TextStyle(
                    fontSize = 18.sp,
                    color = if (isCodeCorrect) Color.Green else Color.Red
                ),
                modifier = Modifier.padding(top = 16.dp)
            )
        }
    }
}
