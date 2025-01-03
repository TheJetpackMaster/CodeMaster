package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.codemaster.codemasterapp.R
import androidx.compose.runtime.*
import com.airbnb.lottie.compose.LottieAnimation
import kotlinx.coroutines.launch



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AchievementScreenCustomTopBar(
    onTabSelected: (Int) -> Unit,
    pagerState: PagerState
) {
    // State for selected tab
    var selectedTabIndex by remember { mutableStateOf(0) }
    val tabTitles = listOf("Achievements", "Progress")

    // Load Lottie composition
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.achivment))

    // Animate the composition
    val progress by animateLottieCompositionAsState(
        composition = composition,
        iterations = LottieConstants.IterateForever // Infinite loop
    )

    val coroutineScope = rememberCoroutineScope()

    Column {
        // Top Bar with Gradient and Profile Section
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp) // Adjusted height
                .background(Color.Transparent)
        ) {
            // Gradient Background with Stars
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .blur(100.dp)
            ) {
                Canvas(modifier = Modifier.fillMaxSize()) {
                    val width = size.width
                    val height = size.height

                    val gradientBrush = Brush.sweepGradient(
                        colors = listOf(
                            Color(0xFF0F2027), // Midnight Blue
                            Color(0xFF203A43), // Deep Teal
                            Color(0xFF1E1E2C)  // Dark color, similar to your base color
                        ),
                        center = Offset(width / 2, height / 2)
                    )

                    drawRect(
                        brush = gradientBrush,
                        size = size
                    )
                }
            }

            // Top Section with Profile
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .statusBarsPadding()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Column for "My Honor" and the subtext
                    Column(
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            modifier = Modifier.padding(start = 4.dp),
                            text = "My Honor",
                            style = MaterialTheme.typography.titleLarge.copy(
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            ),
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Row(
                            modifier = Modifier
                                .background(Color.White.copy(0.2f), shape = CircleShape)
                                .padding(horizontal = 8.dp, vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center // Center everything horizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.badge), // Replace with your drawable resource ID
                                contentDescription = "Example Badge", // Describe the image for accessibility
                                modifier = Modifier.size(15.dp) // Modify size as needed
                            )
                            Spacer(modifier = Modifier.width(4.dp)) // Add some space between the icon and text
                            Text(
                                text = "Award 1/10",
                                style = MaterialTheme.typography.bodyMedium.copy(
                                    color = Color.White,
                                ),
                            )
                        }
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    // Lottie Animation completely on the right
                    LottieAnimation(
                        composition = composition,
                        progress = { progress },
                        modifier = Modifier
                            .size(100.dp)
                            .scale(1.5f)
                    )
                }

                Spacer(modifier = Modifier.weight(1f))
                TabRow(
                    selectedTabIndex = pagerState.currentPage,
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = Color.Transparent,
                    contentColor = Color.White,
                    indicator = { tabPositions ->
                        TabRowDefaults.Indicator(
                            Modifier.tabIndicatorOffset(tabPositions[pagerState.currentPage]),
                            color = Color.White,
                            height = 4.dp
                        )
                    }
                ) {
                    tabTitles.forEachIndexed { index, title ->
                        Tab(
                            selected = pagerState.currentPage == index,
                            onClick = {
                                coroutineScope.launch {
                                    pagerState.animateScrollToPage(index) // Scroll to the selected page
                                }
                                onTabSelected(index) // Trigger callback with the selected index
                            },
                            text = {
                                Text(
                                    text = title,

                                    style = MaterialTheme.typography.bodyMedium.copy(
                                        color = if (pagerState.currentPage == index) Color.White else Color.White.copy(
                                            0.7f
                                        ),
                                        fontWeight = if (pagerState.currentPage == index) FontWeight.SemiBold
                                        else FontWeight.Normal,
                                    ),
                                )
                            }
                        )
                    }
                }
            }
        }
    }
}
