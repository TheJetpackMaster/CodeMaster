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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AchievementCard(
    cardGradientColor: Brush,
    title: String, // Title of the achievement (can be customized)
    progressValue: Float, // Progress value (0.0f to 1.0f)
    progressBarColor: Color = Color(0xFF42C72A), // Muted Green for progress
    completedText: String = "Completed", // Text to show when progress is completed
    ImageResource: Int,
    modifier: Modifier = Modifier,
) {
    // Card to contain the content with gradient background
    Card(
        modifier = modifier
            .height(200.dp)
            .padding(8.dp), // Adjust padding around the card
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent // We use transparent to apply a gradient
        ),
    ) {
        // Gradient Background for the card
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    cardGradientColor
                )
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                // Title at the top center
                Text(
                    text = title,
                    color = Color.White,
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
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Lottie Animation
                    Image(
                        painter = painterResource(id = ImageResource), // Replace with your drawable resource ID
                        contentDescription = "Example Badge", // Describe the image for accessibility
                        modifier = Modifier.size(80.dp) // Modify size as needed
                    )

                    // Custom Progress Bar with Text Above it (only if progress is not 100%)
                    if (progressValue < 1f) {
                        // Custom Progress Bar with Text Above it
                        Column(
                            modifier = Modifier.fillMaxWidth()
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

                            AchievementCustomProgressBar(
                                progressValue = progressValue,
                                progressBarColor = progressBarColor // Use the muted green color for progress
                            )
                        }
                    } else {
                        // If progress is 100%, show "Completed" text instead of progress bar
                        Text(
                            text = completedText,
                            style = MaterialTheme.typography.titleMedium.copy(
                                color = Color.White,
                            ),
                            modifier = Modifier.padding(top = 16.dp)
                        )
                    }
                }
            }
        }
    }
}


@Composable
fun AchievementCustomProgressBar(
    progressValue: Float, // The current progress (0.0f to 1.0f)
    progressBarColor: Color = Color.Yellow, // Color of the progress bar
) {
    Box(
        modifier = Modifier
            .height(10.dp)
            .fillMaxWidth() // Fill the width of the container
            .clip(RoundedCornerShape(5.dp)) // Rounded edges
            .background(Color.Gray.copy(alpha = 0.4f)) // Background of the progress bar
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