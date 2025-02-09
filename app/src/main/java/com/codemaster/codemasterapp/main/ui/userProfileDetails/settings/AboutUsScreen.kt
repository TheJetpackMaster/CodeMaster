package com.codemaster.codemasterapp.main.ui.userProfileDetails.settings

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavController
import com.codemaster.codemasterapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutUs(
    navController: NavController
) {
    Scaffold(
        containerColor = Color.Transparent,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        modifier = Modifier.padding(start = 24.dp),
                        text = "About Us",
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
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "CodeMaster",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "(Your Ultimate Coding Companion)",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.LightGray,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Version 1.0.0",
                fontSize = 14.sp,
                color = Color.LightGray,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color.DarkGray)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.codemasterlogo),
                    contentDescription = "CodeMaster Logo",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(RoundedCornerShape(12.dp))
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Developed by",
                fontSize = 14.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Parvez Mayar & Khubaib Aziz",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Cyan,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Owned by KP Creative Labs",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Cyan,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "CodeMaster is the brainchild of Parvez Mayar and Khubaib Aziz, two passionate developers " +
                        "from Lasbela, Balochistan. With limited access to tech resources, their determination led them " +
                        "to build an all-in-one coding companion. CodeMaster is designed to empower developers, streamline " +
                        "their workflow, and ignite creativity. Whether you're a beginner or an expert, this app is here to " +
                        "elevate your coding experience. Join us in revolutionizing the way we code, one line at a time.",
                fontSize = 14.sp,
                color = Color.LightGray,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Justify
            )
        }
    }
}
