package com.codemaster.codemasterapp.main.ui.userProfileDetails.settings

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutCodeMaster(navController: NavController) {
    Scaffold(
        containerColor = Color.Transparent,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        modifier = Modifier.padding(start = 24.dp),
                        text = "About CodeMaster",
                        color = Color.White
                    )
                },
                navigationIcon = {
                    OutlinedIconButton(
                        onClick = {
                            if (navController.currentBackStackEntry?.lifecycle?.currentState
                                == Lifecycle.State.RESUMED
                            ) {
                                navController.popBackStack()
                            }
                        },
                        modifier = Modifier
                            .statusBarsPadding()
                            .padding(start = 8.dp)
                            .size(36.dp),
                        border = BorderStroke(
                            1.3.dp,
                            color = Color.LightGray.copy(alpha = 0.4f)
                        ), // Light border with transparency
                        colors = IconButtonDefaults.outlinedIconButtonColors(
                            containerColor = Color.White.copy(.08f),
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = "",
                            modifier = Modifier.size(26.dp),
                            tint = Color.White.copy(alpha = 0.8f) // White icon with some transparency for the glass effect
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF122A40)
                ),
                modifier = Modifier.shadow(2.dp, spotColor = Color.White)
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0x77123C46))
                .padding(innerPadding)
                .padding(top = 16.dp)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "CodeMaster - Your Ultimate Coding Companion!",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center
            )

            Spacer(Modifier.height(16.dp))

            Text(
                text = "Learn coding interactively with multiple programming languages, ranging from beginner to expert levels!\n\n" +
                        "✔ Step-by-step learning paths\n" +
                        "✔ Engaging quizzes & coding challenges\n" +
                        "✔ Achievement badges for milestones\n" +
                        "✔ Real-time progress tracker\n\n" +
                        "Start your coding journey today!",
                fontSize = 16.sp,
                color = Color.LightGray,
                textAlign = TextAlign.Justify
            )
        }
    }
}
