package com.codemaster.codemasterapp.main.ui.learning.lessons.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codemaster.codemasterapp.main.data.ContentBlock
import com.codemaster.codemasterapp.main.data.LessonContent
import com.codemaster.codemasterapp.main.data.LessonContentType
import com.codemaster.codemasterapp.main.data.LessonStatus
import com.codemaster.codemasterapp.main.ui.learning.lessons.shouldEnableContinueButton
import com.codemaster.codemasterapp.ui.theme.bluishPython
import kotlinx.coroutines.CoroutineScope

@Composable
fun LessonContentView(
    lessonContent: LessonContent,
    onNext: () -> Unit,
    pagerState: PagerState,
    coroutineScope: CoroutineScope,
    subLessons: List<LessonContent>,
    isAnswerGiven: MutableState<Boolean>,
    answerFeedbackText: MutableState<String>,
    onFinish: () -> Unit,
    subLessonStatus: LessonStatus

    ) {


    val isInteractiveTypeLesson =
        remember {
            mutableStateOf(
                lessonContent.type == LessonContentType.INTERACTIVE || lessonContent.type == LessonContentType.QUIZ
            )
        }


    LaunchedEffect(
        lessonContent.type == LessonContentType.INTERACTIVE,
        lessonContent.type == LessonContentType.QUIZ
    ) {
        Log.d("contentType", lessonContent.type.toString())
        isInteractiveTypeLesson.value =
            lessonContent.type == LessonContentType.INTERACTIVE || lessonContent.type == LessonContentType.QUIZ
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        // Show the lesson title at the top
        Text(
            text = lessonContent.title,
            style = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White
            ),
            modifier = Modifier.padding(bottom = 16.dp) // Space below the title
        )

        lessonContent.contentBlocks.forEach { contentBlock ->
            when (contentBlock) {
                is ContentBlock.Text -> {
                    Text(
                        text = contentBlock.text,
                        style = TextStyle(fontSize = 16.sp, color = Color.White),
                        lineHeight = 24.sp
                    )
                }

                is ContentBlock.Image -> {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(contentBlock.imageRes),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }

                is ContentBlock.Code -> {

                    ScrollableCodeBlock(contentBlock.code)
                }


                is ContentBlock.InteractiveCodeBlock -> {

                    InteractiveCodeBlockView(
                        contentBlock = contentBlock,
                        isAnswerGiven = isAnswerGiven,
                        answerFeedbackText = answerFeedbackText,
                    )
                }

                is ContentBlock.QuizContentBlock -> {
                    QuizContentBlock(
                        contentBlock = contentBlock,
                        isAnswerGiven = isAnswerGiven,
                        answerFeedbackText = answerFeedbackText,
                    )
                }

                is ContentBlock.InteractiveInputBlock -> {
                    InteractiveInputBlockView(
                        contentBlock = contentBlock,
                        isAnswerGiven = isAnswerGiven,
                        answerFeedbackText = answerFeedbackText
                    )
                }
            }
        }

        Spacer(modifier = Modifier.weight(1f))


        //Continue Button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .height(46.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                modifier = Modifier
                    .fillMaxSize(),
                onClick = {
                    onNext()
                    if (pagerState.currentPage >= subLessons.size - 1) {
                        onFinish()
                    }

                },
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = bluishPython,
                    disabledContainerColor = Color(0xFF414559)
                ),
                enabled = shouldEnableContinueButton(
                    isInteractive = isInteractiveTypeLesson.value,
                    answerFeedbackText = answerFeedbackText.value,
                    isAnswerGiven = isAnswerGiven.value,
                    subLessonStatus = subLessonStatus
                )
            ) {
                Text(
                    text = if (pagerState.currentPage < subLessons.size - 1) "Continue" else "Finish",
                    style = TextStyle(fontSize = 16.sp, color = Color.White)
                )
            }
        }
    }
}
