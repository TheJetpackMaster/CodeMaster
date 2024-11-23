package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.codemaster.codemasterapp.R


val codeBreeze = Brush.verticalGradient(
    colors = listOf(
        Color(0xFF175D67), // Cyan
        Color(0xFF009688)  // Teal
    )
)



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LanguageProgressCard(
    cardGradientColor: Brush = codeBreeze,
    title: String, // Title of the achievement (can be customized)
    progressValue: Float, // Progress value (0.0f to 1.0f)
    progressBarColor: Color = Color.Yellow, // Color of the progress bar
    completedText: String = "Completed", // Text to show when progress is completed
    animationResource: Int,
    bgDecorativeIcon: Int = R.drawable.cpp,
    modifier: Modifier,

    //Test
    decorativeImagePadding:Dp = 0.dp
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
            .padding(8.dp)
            .shadow(4.dp, shape = RoundedCornerShape(16.dp))
            .background(cardGradientColor, shape = RoundedCornerShape(16.dp)),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(decorativeImagePadding)
                    .alpha(.2f),
                colorFilter = ColorFilter.tint(color = Color.White),
                painter = painterResource(bgDecorativeIcon),
                contentDescription = "")

            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                // Title at the top center
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium.copy(
                        color = Color.White,
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(top = 16.dp)
                )

                // Lottie Animation and Progress Bar Section
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    // Lottie Animation
//                    LottieAnimation(
//                        composition = composition,
//                        progress = { LottieProgress },
//                        modifier = Modifier
//                            .size(80.dp)
//                            .scale(1.2f)
//                            .padding(bottom = 8.dp)
//
//                        // Space between animation and progress bar
//                    )
                    // Custom Progress Bar with Text Above it (only if progress is not 100%)
                    if (progressValue < 1f) {
                        // Custom Progress Bar with Text Above it
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 16.dp),
                        ) {
                            // Label text above progress bar (on the left)
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Next", // Left label
                                    style = MaterialTheme.typography.bodyMedium.copy(
                                        color = Color.White,
                                    ),
                                )
                                Text(
                                    text = "${(progressValue * 100).toInt()}%", // Right progress percentage
                                    style = MaterialTheme.typography.bodyMedium.copy(
                                        color = Color.White,
                                    ),
                                )
                            }

                            LanguageCardProgressBar(
                                progressValue = progressValue,
                                progressBarColor = progressBarColor
                            ) // Use the progress value
                        }
                    } else {
                        // If progress is 100%, show "Completed" text instead of progress bar
                        Text(
                            text = completedText,
                            style = MaterialTheme.typography.titleMedium.copy(
                                color = Color.White,
                            ),
                            modifier = Modifier.padding(top = 16.dp) // Space between the animation and "Completed" text
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun LanguageCardProgressBar(
    progressValue: Float, // The current progress (0.0f to 1.0f)
    progressBarColor: Color = Color.Yellow, // Color of the progress bar
) {
    Box(
        modifier = Modifier
            .height(10.dp)
            .fillMaxWidth() // Fill the width of the container
            .clip(RoundedCornerShape(5.dp)) // Rounded edges
            .background(Color.LightGray.copy(alpha = 0.5f)) // Background of the progress bar
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
