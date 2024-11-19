package com.codemaster.codemasterapp.main.ui.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codemaster.codemasterapp.ui.theme.bluishPython
import com.codemaster.codemasterapp.ui.theme.yellowishKt


@Composable
fun LanguageCardDesign(
    languageName: String,
    difficulty: String,
    lessonCount: Int,
    completedLessonCount:Int,
    gradientColors: List<Color>,
    languageImage: Painter,
    onClick: () -> Unit,
    modifier: Modifier
) {

    val progress = remember {
        mutableStateOf(
            (completedLessonCount.toFloat()/lessonCount.toFloat())
        )
    }

    Log.d("progress",progress.value.toString())

    Card(
        modifier = modifier
            .height(155.dp)
            .clickable { onClick() },
//            .shadow(8.dp, RoundedCornerShape(24.dp), ambientColor = Color.White, spotColor = Color.White),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        // Outer Box with gradient background
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.linearGradient(
                        colors = gradientColors,
                        start = Offset(500f, 0f), // Further out to the right
                        end = Offset(0f, 300f)    // Further down to the left
                    )
                ),
        ) {
            // Glass effect overlay
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.White.copy(alpha = 0.15f))
                    .border(1.dp, Color.White.copy(alpha = 0.3f), RoundedCornerShape(20.dp))
                    .padding(12.dp),
                contentAlignment = Alignment.Center

            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    // Top Row for Image and Difficulty
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top
                    ) {
                        Image(
                            painter = languageImage,
                            contentDescription = "$languageName icon",
                            modifier = Modifier
                                .size(55.dp)
                                .clip(CircleShape)

                                .background(Color.Black)
                                .padding(10.dp),
                            colorFilter = ColorFilter.tint(Color.White)
                        )

                        Text(
                            text = difficulty,
                            color = Color.Black.copy(.7f),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier
                                .background(Color.White.copy(alpha = 0.2f), CircleShape)
                                .padding(horizontal = 12.dp, vertical = 2.dp)
                        )
                    }

                    // Bottom Section for Language Name and Lesson Count
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(4.dp),
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Text(
                            text = languageName,
                            color = Color.Black,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "lessons:$completedLessonCount/$lessonCount",
                            color = Color.Black.copy(alpha = 0.75f),
                            fontSize = 13.sp
                        )
                    }
                }
            }


            LinearProgressIndicator(

                gapSize = 0.dp,
                strokeCap = StrokeCap.Square,
                progress = {progress.value},
                trackColor = Color.White.copy(.5f),
                color = bluishPython.copy(.6f),
                modifier = Modifier.align(Alignment.BottomCenter)
                    .height(5.dp)
            )
        }
    }
}
