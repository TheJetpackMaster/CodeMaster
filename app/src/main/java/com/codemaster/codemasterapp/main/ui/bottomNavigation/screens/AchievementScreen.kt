package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.bottomNavigation.components.AchievementCard
import com.codemaster.codemasterapp.main.ui.bottomNavigation.components.AchievementScreenCustomTopBar
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Brush
import com.codemaster.codemasterapp.main.ui.bottomNavigation.components.LanguageProgressCard
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AchievementScreen(navController: NavController) {
    val scrollState = rememberScrollState()
    var currentTab by remember { mutableStateOf(0) }
    val pagerState = rememberPagerState(pageCount = { 2 })
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        containerColor = Color.Transparent,
        topBar = {
            AchievementScreenCustomTopBar(
                onTabSelected = { selectedIndex ->
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(selectedIndex) // Animate to selected tab
                    }
                },
                pagerState = pagerState // Pass the pagerState as well
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
//                .background(Color(0xFFF7F9FC)) // Soft background color for the main area
                .padding(paddingValues)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                // .padding(bottom = 80.dp),
                //  .verticalScroll(scrollState),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                HorizontalPager(
                    state = pagerState,
                ) { page ->
                    when (page) {
                        0 -> AchievementsContent()
                        1 -> ProgressContent()
                    }
                }
            }

        }

    }
}

@Composable
fun AchievementsContent() {

    // List of 100 titles
    val titles = listOf(
        "Achiever",
        "Prodigy",
        "Master",
        "Champion",
        "Maverick",
        "Hero",
        "Legend",
        "Titan",
        "Conqueror",
        "Innovator",
        "Strategist",
        "Philanthropist",
        "Expert",
        "Winner",
        "Adventurer",
        "Pathfinder",
        "Explorer",
        "Creator",
        "Builder",
        "Visionary",
        "Revolutionary",
        "Pioneer",
        "Goalsetter",
        "Transformer",
        "Empowerer",
        "Inspire",
        "Mentor",
        "Influencer",
        "Leader",
        "Inventor",
        "Guru",
        /* "Evolver",
         "Mastermind",
         "Navigator",
         "Determined",
         "Focused",
         "Hustler",
         "Go-Getter",
         "Overcomer",
         "Legendary",
         "Breakthrough",
         "Elevator",
         "Optimist",
         "Game-Changer",
         "Shaker",
         "Craftsman",
         "Shining Star",
         "Innovative",
         "Achiever",
         "Tactician"*/
    )

    // List of progress values, representing the completion of the achievement
    /*val progressValues = listOf(0.1f, 0.2f, 0.3f, 0.4f, 0.5f,
        0.6f, 0.7f, 0.8f, 0.9f, 1.0f)*/

    // List of animation resource IDs (Assume you have different animation files)
    val animationResources = listOf(
        R.drawable.achiever, R.drawable.prodigy,
        R.drawable.master, R.drawable.champion,
        R.drawable.maverick, R.drawable.hero,
        R.drawable.legend, R.drawable.titan,
        R.drawable.conqueror, R.drawable.innovator,

        R.drawable.strategist, R.drawable.philanthropist,
        R.drawable.expert, R.drawable.winner,
        R.drawable.adventurer, R.drawable.pathfinder,
        R.drawable.explorer, R.drawable.creator,
        R.drawable.builder, R.drawable.visionary,

        R.drawable.revolutionary, R.drawable.pioneer,
        R.drawable.goalsetter, R.drawable.transformer,
        R.drawable.empowerer, R.drawable.inspire,
        R.drawable.mentor, R.drawable.influencer,
        R.drawable.leader, R.drawable.inventor,

        /* R.drawable.guru, R.drawable.evolver,
         R.drawable.goalsetter, R.drawable.transformer,
         R.drawable.empowerer, R.drawable.inspire,
         R.drawable.mentor, R.drawable.influencer,
         R.drawable.leader, R.drawable.inventor,*/
    )

    // Progress values and animation resources for each achievement
    val progressValues = List(30) { (it + 1) / 100f }
    // val animationResources = List(48) { R.raw.cardbadge }

    // Create a list of 10 achievements with different titles, progress, and animation
    val achievements = List(30) { index ->
        AchievementItem(
            title = titles[index],  // Unique title
            progressValue = progressValues[index],  // Unique progress
            animationResource = animationResources[index]  // Unique animation
        )
    }



    // AchievementCard bg colors
    val achievementCardColor = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF002F6C), // Deep ocean blue at the top
            Color(0xFF1565C0)  // Brighter blue at the bottom
        )
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        // Dynamically create rows based on the list of achievements
        items(achievements.chunked(2)) { achievementRow ->
            Row(modifier = Modifier.fillMaxWidth()) {
                achievementRow.forEach { achievement ->
                    AchievementCard(
                        title = achievement.title,
                        progressValue = achievement.progressValue,
                        ImageResource = achievement.animationResource,
                        modifier = Modifier.weight(1f),
                        cardGradientColor = achievementCardColor

                    )
                }
            }
        }
        item {
            Spacer(modifier = Modifier.height(80.dp))
        }
    }
}

// Data class to represent each achievement
data class AchievementItem(
    val title: String,
    val progressValue: Float,
    val animationResource: Int,
)

@Composable
fun ProgressContent() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        // First Row
        item {
            Row() {
                LanguageProgressCard(
                    title = "C",
                    progressValue = 0f,
                    animationResource = R.raw.cardbadge,
                    bgDecorativeIcon = R.drawable.cpp,
                    modifier = Modifier.weight(1f),

                    //Test
                    decorativeImagePadding = 0.dp
                )
                LanguageProgressCard(
                    title = "C++",
                    progressValue = 0.2f,
                    animationResource = R.raw.cardbadge,
                    bgDecorativeIcon = R.drawable.cpp,
                    modifier = Modifier.weight(1f),

                    //Test
                    decorativeImagePadding = 0.dp
                )
            }
        }

        // Second Row
        item {
            Row() {
                LanguageProgressCard(
                    title = "Python",
                    progressValue = 0.4f,
                    animationResource = R.raw.cardbadge,
                    bgDecorativeIcon = R.drawable.pythonlogo,
                    modifier = Modifier.weight(1f),

                    //Test
                    decorativeImagePadding = 24.dp
                )
                LanguageProgressCard(
                    title = "Java",
                    progressValue = 0.6f,
                    animationResource = R.raw.cardbadge,
                    bgDecorativeIcon = R.drawable.java,
                    modifier = Modifier.weight(1f),

                    //Test
                    decorativeImagePadding = 24.dp
                )
            }
        }

        // Third Row
        item {
            Row() {
                LanguageProgressCard(
                    title = "DSA",
                    progressValue = 0.8f,
                    animationResource = R.raw.cardbadge,
                    bgDecorativeIcon = R.drawable.cpp,
                    modifier = Modifier.weight(1f),

                    //Test
                    decorativeImagePadding = 0.dp
                )
                LanguageProgressCard(
                    title = "Kotlin",
                    progressValue = 1f,
                    animationResource = R.raw.cardbadge,
                    bgDecorativeIcon = R.drawable.kotlin,
                    modifier = Modifier.weight(1f),


                    //Test
                    decorativeImagePadding = 34.dp
                )
            }
        }

        item {
            Spacer(modifier = Modifier.height(80.dp))
        }
    }
}
