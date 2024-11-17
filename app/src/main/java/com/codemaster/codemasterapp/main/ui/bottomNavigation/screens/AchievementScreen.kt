package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens

import androidx.compose.animation.core.animate
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.bottomNavigation.components.AchievementCard
import com.codemaster.codemasterapp.main.ui.bottomNavigation.components.AchievementScreenCustomTopBar
import com.codemaster.codemasterapp.main.ui.bottomNavigation.components.HomeScreenCustomTopBar
import com.codemaster.codemasterapp.main.ui.components.ContinueLearningCard
import com.codemaster.codemasterapp.main.ui.components.LanguageCardDesign
import com.codemaster.codemasterapp.ui.theme.bluishJava
import com.codemaster.codemasterapp.ui.theme.bluishPython
import com.codemaster.codemasterapp.ui.theme.greenishPython
import com.codemaster.codemasterapp.ui.theme.magentaCpp
import com.codemaster.codemasterapp.ui.theme.purpleCpp
import com.codemaster.codemasterapp.ui.theme.purpleKt
import com.codemaster.codemasterapp.ui.theme.yellowishJava
import com.codemaster.codemasterapp.ui.theme.yellowishKt
import androidx.compose.runtime.*
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AchievementScreen(navController: NavController) {
    val scrollState = rememberScrollState()
    var currentTab by remember { mutableStateOf(0) }
    val pagerState = rememberPagerState(pageCount = { 2 })
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            /*TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "CodeMaster",
                            color = Color(0xFFE5E5C2),
                            style = MaterialTheme.typography.titleLarge
                        )
                        Spacer(Modifier.weight(1f))
                        IconButton(onClick = { /* Navigate to Profile Screen */ }) {
                            Icon(
                                imageVector = Icons.Filled.Person,
                                contentDescription = "Profile",
                                tint = Color.White,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF2F3E4C),
                ),
            )*/
            AchievementScreenCustomTopBar(
                onTabSelected = { selectedIndex ->
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(selectedIndex) // Animate to selected tab
                    }
                },
                pagerState = pagerState // Pass the pagerState as well
            )
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF7F9FC)) // Soft background color for the main area
                    .padding(paddingValues)

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                        // .padding(start = 8.dp, end = 8.dp)
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
    )
}

@Composable
fun AchievementsContent() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        // First Row
        item {
            Row() {
                AchievementCard(
                    title = "C",
                    progressValue = 0f,
                    animationResource = R.raw.cardbadge,
                    modifier = Modifier.weight(1f)
                )
                AchievementCard(
                    title = "C++",
                    progressValue = 0.2f,
                    animationResource = R.raw.cardbadge,
                    modifier = Modifier.weight(1f)
                )
            }
        }

        // Second Row
        item {
            Row() {
                AchievementCard(
                    title = "Python",
                    progressValue = 0.4f,
                    animationResource = R.raw.cardbadge,
                    modifier = Modifier.weight(1f)
                )
                AchievementCard(
                    title = "Java",
                    progressValue = 0.6f,
                    animationResource = R.raw.cardbadge,
                    modifier = Modifier.weight(1f)
                )
            }
        }

        // Third Row
        item {
            Row() {
                AchievementCard(
                    title = "DSA",
                    progressValue = 0.8f,
                    animationResource = R.raw.cardbadge,
                    modifier = Modifier.weight(1f)
                )
                AchievementCard(
                    title = "Kotlin",
                    progressValue = 1f,
                    animationResource = R.raw.cardbadge,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
fun ProgressContent() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        // First Row
        item {
            Row() {
                AchievementCard(
                    title = "C",
                    progressValue = 0f,
                    animationResource = R.raw.cardbadge,
                    modifier = Modifier.weight(1f)
                )
                AchievementCard(
                    title = "C++",
                    progressValue = 0.2f,
                    animationResource = R.raw.cardbadge,
                    modifier = Modifier.weight(1f)
                )
            }
        }

        // Second Row
        item {
            Row() {
                AchievementCard(
                    title = "Python",
                    progressValue = 0.4f,
                    animationResource = R.raw.cardbadge,
                    modifier = Modifier.weight(1f)
                )
                AchievementCard(
                    title = "Java",
                    progressValue = 0.6f,
                    animationResource = R.raw.cardbadge,
                    modifier = Modifier.weight(1f)
                )
            }
        }

        // Third Row
        item {
            Row() {
                AchievementCard(
                    title = "DSA",
                    progressValue = 0.8f,
                    animationResource = R.raw.cardbadge,
                    modifier = Modifier.weight(1f)
                )
                AchievementCard(
                    title = "Kotlin",
                    progressValue = 1f,
                    animationResource = R.raw.cardbadge,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}
