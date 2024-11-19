package com.codemaster.codemasterapp.main.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
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


val cardGradientColors1 = listOf(
    Color(0xFF6C9BAF), // Muted Light Blue
    Color(0xFF5A8198), // Muted Cyan Blue
    Color(0xFF365264)  // Darker Blue-Grey
)

val cardGradientColors2 = listOf(
    Color(0xFFF58A8C), // Soft Peach
    Color(0xFFFDE3D9), // Light Pink
    Color(0xFFEEA28D)  // Warm Peachy-Coral
)

val cardGradientColors3 = listOf(
    Color(0xFF8ED081), // Soft Green
    Color(0xFF6C9F6E), // Muted Olive Green
    Color(0xFF4F6F4A)  // Earthy Dark Green
)

val cardGradientColors4 = listOf(
    Color(0xFF8E4F96), // Rich Purple
    Color(0xFFBC6C9A), // Soft Pink
    Color(0xFFD3A1C9)  // Pale Lavender
)

val cardGradientColors5 = listOf(
    Color(0xFFEE5F73), // Coral Pink
    Color(0xFFFDBD72), // Light Peach
    Color(0xFFF1C2B8)  // Soft Cream
)

val cardGradientColors6 = listOf(
    Color(0xFF3F8E9B), // Teal
    Color(0xFF50B2C0), // Aqua Blue
    Color(0xFF76D2E4)  // Soft Aqua
)

@Composable
fun LevelSelectionCardDesign(
    stageName: String,
    lessonCount: Int,
    completedLessonCount: Int,
    gradientColors: List<Color> = cardGradientColors1,
//    gradientColors: List<Color> = listOf(yellowishKt,purpleKt), // Example gradient
    icon: Painter,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {



    // Calculate progress percentage
    val progress = remember {
        (completedLessonCount.toFloat() / lessonCount.toFloat()).coerceIn(0f, 1f)
    }

    Card(
        modifier = modifier
            .height(165.dp)
            .clickable { onClick() }
            .padding(0.dp),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        // Background with gradient
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.linearGradient(
                        colors = gradientColors,
                        start = Offset(300f, 0f),
                        end = Offset(0f, 500f)
                    )
                )
        ) {
            // Background graphic (decorative)
            Image(
                painter = icon,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
                    .align(Alignment.BottomEnd)
                    .alpha(0.2f),
                colorFilter = ColorFilter.tint(color = Color.White)
            )

            // Glass effect overlay
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(20.dp))
                    .background(Color.White.copy(alpha = .15f))
                    .border(1.dp, Color.White.copy(alpha = .3f), RoundedCornerShape(20.dp)),
                contentAlignment = Alignment.Center

            ) {
                // Content overlay
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    // Top section: Title
                    Text(
                        text = stageName,
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                    )

                    // Middle section: Lesson progress
                    Column {
                        Text(
                            text = "Lessons: $completedLessonCount/$lessonCount",
                            color = Color.White.copy(alpha = 0.9f),
                            fontSize = 14.sp,
                            modifier = Modifier.padding(bottom = 4.dp)
                        )

                        Spacer(Modifier.height(4.dp))

                        LinearProgressIndicator(
                            progress = { progress },
                            color = Color(0xFF313F3F),
                            strokeCap = StrokeCap.Butt,
                            gapSize = 0.dp,
                            trackColor = Color.White.copy(alpha = 0.4f),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(6.dp)
                                .clip(RoundedCornerShape(4.dp)),
                            drawStopIndicator = {

                            }
                        )
                    }
                }
            }
        }
    }
}
