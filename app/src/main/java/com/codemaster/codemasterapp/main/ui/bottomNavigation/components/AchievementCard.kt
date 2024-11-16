package com.codemaster.codemasterapp.main.ui.bottomNavigation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.codemaster.codemasterapp.R
import androidx.compose.runtime.*
import androidx.compose.ui.draw.scale
import com.airbnb.lottie.compose.animateLottieCompositionAsState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AchievementCard(
    title: String, // Title of the achievement (can be customized)
    progressValue: Float, // Progress value (0.0f to 1.0f)
    progressBarColor: Color = Color.Yellow, // Color of the progress bar
    completedText: String = "Completed", // Text to show when progress is completed
    animationResource: Int,
    modifier: Modifier,
) {
    // Lottie composition and animation state
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(animationResource))
    val LottieProgress by animateLottieCompositionAsState(
        composition = composition,
        iterations = LottieConstants.IterateForever
    )

    // Card to contain the content
    Card(
        modifier = modifier
            .height(200.dp)
            .padding(8.dp), // Adjust padding around the card
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1E2C)) // Dark theme
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Title at the top center
            Text(
                text = title,
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 16.dp)
            )

            // Lottie Animation and Progress Bar Section
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Lottie Animation
                LottieAnimation(
                    composition = composition,
                    progress = { LottieProgress },
                    modifier = Modifier
                        .size(80.dp)
                        .scale(1.2f)
                        .padding(bottom = 8.dp)

                    // Space between animation and progress bar
                )


                // Custom Progress Bar with Text Above it (only if progress is not 100%)
                if (progressValue < 1f) {
                    // Custom Progress Bar with Text Above it
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        // Label text above progress bar (on the left)
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Next", // Left label
                                color = Color.White,
                                fontSize = 14.sp
                            )
                            Text(
                                text = "${(progressValue * 100).toInt()}%", // Right progress percentage
                                color = Color.White,
                                fontSize = 14.sp
                            )
                        }

                        CustomProgressBar(
                            progressValue = progressValue,
                            progressBarColor = progressBarColor
                        ) // Use the progress value
                    }
                } else {
                    // If progress is 100%, show "Completed" text instead of progress bar
                    Text(
                        text = completedText,
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 16.dp) // Space between the animation and "Completed" text
                    )
                }
            }
        }
    }
}

@Composable
fun CustomProgressBar(
    progressValue: Float, // The current progress (0.0f to 1.0f)
    progressBarColor: Color = Color.Yellow, // Color of the progress bar
) {
    Box(
        modifier = Modifier
            .height(10.dp)
            .fillMaxWidth() // Fill the width of the container
            .clip(RoundedCornerShape(5.dp)) // Rounded edges
            .background(Color.Gray.copy(alpha = 0.3f)) // Background of the progress bar
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(fraction = progressValue) // Set the width based on progressValue
                .fillMaxHeight()
                .clip(RoundedCornerShape(5.dp)) // Same rounded edges
                .background(progressBarColor) // Custom progress color
        )
    }
}
