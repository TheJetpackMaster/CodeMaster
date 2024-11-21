package com.codemaster.codemasterapp.main.ui.components;


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codemaster.codemasterapp.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit



@Composable
fun ContinueLearningCard(
    completedLessons: Int,
    totalLessons: Int = 30,
    levelName: String = "Level Name",
    lessonName: String = "Lesson Name",
    progressPercentage: Float = 0.0f,
    cardHeight: Dp = 130.dp,
    cardCornerRadius: Dp = 16.dp,
    decorativeLogo: Int = R.drawable.cpp,
    gradientColors: List<Color> = listOf(
        Color(0xFF9EEEA7),
        Color(0xFF87E8C6)
    ),
    animatedButtonBorderColor1:Color = Color(0xFF0B8755),
    animatedButtonBorderColor2:Color = Color(0xFFB9FBC0),
    levelTextColor: Color = Color(0xFF0B3D2E),
    lessonTextColor: Color = Color(0xFF558776),
    progressBarColor: Color = Color(0xFF0B8755),
    progressBarTrackColor: Color = Color(0xFFCDE2D0),
    buttonBackgroundColor: Color = Color(0xFF0B8755),
    buttonTextColor: Color = Color.White,
    buttonText: String = "Resume",
    buttonTextSize: TextUnit = 12.sp,
    buttonHeight: Dp = 38.dp,
    onContinueClick: () -> Unit,
    paddingValues: PaddingValues

) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(cardHeight)
            .padding(paddingValues)
            .shadow(
                elevation = 10.dp, // Adjust shadow elevation
                shape = RoundedCornerShape(cardCornerRadius) // Match the corner shape
            )
            .clip(RoundedCornerShape(cardCornerRadius))
            .background(
                brush = Brush.linearGradient(colors = gradientColors)
            )
            .padding(16.dp)
            ,

        contentAlignment = Alignment.BottomStart
    ) {
        // Decorative Logo
        Image(
            painter = painterResource(id = decorativeLogo),
            contentDescription = null,
            modifier = Modifier
                .scale(1.6f)
                .padding(4.dp)
                .alpha(0.2f),
            colorFilter = ColorFilter.tint(Color.White)
        )

        Row {
            // Left: Lessons Info
            Column(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = levelName,
                    style = MaterialTheme.typography.titleMedium.copy(
                        color = levelTextColor,
                        fontWeight = FontWeight.SemiBold
                    )
                )

                Text(
                    text = "$completedLessons steps completed",
                    style = MaterialTheme.typography.titleSmall.copy(
                        color = levelTextColor,
                    )
                )

                Text(
                    text = lessonName,
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = lessonTextColor,
                    ),
                    color = lessonTextColor,
                    modifier = Modifier.padding(top = 4.dp)
                )

                Spacer(Modifier.height(10.dp))

                // Linear Progress Indicator
                LinearProgressIndicator(
                    progress = { progressPercentage },
                    gapSize = 0.dp,
                    strokeCap = StrokeCap.Butt,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(10.dp)
                        .clip(CircleShape),
                    color = progressBarColor, // Green progress bar
                    trackColor = progressBarTrackColor, // Light green background
                    drawStopIndicator = {

                    }
                )
            }

            // Right: Resume Button
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ) {
                AnimatedResumeButton(
                    buttonText = buttonText,
                    buttonTextColor = buttonTextColor,
                    buttonTextSize = buttonTextSize,
                    buttonBackgroundColor = buttonBackgroundColor,
                    buttonHeight = buttonHeight,
                    onClick = {
                        onContinueClick()
                    },
                    animatedButtonBorderColor1 = animatedButtonBorderColor1,
                    animatedButtonBorderColor2 = animatedButtonBorderColor2,

                )
            }
        }
    }
}
