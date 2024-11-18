package com.codemaster.codemasterapp.main.ui.auth

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.codemaster.codemasterapp.R
import androidx.compose.runtime.*
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.AuthRoutes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PreRegistrationScreen(navController: NavController) {
    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {
            /*TopAppBar(
                navigationIcon = {
                    IconButton(
                        modifier = Modifier
                            .size(30.dp),
                        onClick = { navController.popBackStack() } // Navigate back
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft, // Back arrow icon
                            contentDescription = "Back",
                            tint = Color.Black // Black arrow for better contrast
                        )
                    }
                },
                title = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 30.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Settings", // Title text
                            style = MaterialTheme.typography.titleMedium.copy(
                                color = Color.Black
                            ),
                            modifier = Modifier.padding(start = 8.dp)
                        )
                    }

                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFF7F9FC) // Light background color
                ),
                actions = {
                    // Optional action buttons (if needed)
                    /* IconButton(onClick = { /* Additional action */ }) {
                        Icon(
                            imageVector = Icons.Default.Settings, // Example action icon
                            contentDescription = "Settings",
                            tint = Color.Black
                        )
                    }*/
                }
            )*/
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF576cd6))
                    .padding(paddingValues)
                    .verticalScroll(scrollState),
                horizontalAlignment = Alignment.CenterHorizontally,

            ) {

                PreRegistrationSection(
                    onLoginClick = {
                        navController.navigate(AuthRoutes.LoginScreen.route)
                    },
                    onSignupClick = {
                        navController.navigate(AuthRoutes.SignUpScreen.route)
                    }
                )

            }
        }
    )
}

@Composable
fun PreRegistrationSection(
    onLoginClick: () -> Unit,
    onSignupClick: () -> Unit,
) {
    // Load Lottie composition
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.preregistration))

    // Animate the composition
    val progress by animateLottieCompositionAsState(
        composition = composition,
        iterations = LottieConstants.IterateForever // Infinite loop
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Lottie Animation completely on the right
                LottieAnimation(
                    composition = composition,
                    progress = { progress },
                    modifier = Modifier
                        .size(300.dp)
                        .padding(top = 22.dp)

                )
        // App Name or Heading
        Text(
            text = "Code Master",
            style = MaterialTheme.typography.headlineMedium.copy(
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Subheading or Description
        Text(
            text = "The ultimate platform to code, learn, and master your skills.",
            style = MaterialTheme.typography.bodyMedium.copy(color = Color.White),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Login Button with Gradient
        Button(
            onClick = onLoginClick,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            contentPadding = PaddingValues()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(50.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color(0xFF293959), // First gradient color
                                Color(0xFF354C88)  // Second gradient color
                            )
                        ),
                        shape = RoundedCornerShape(8.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Login",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Signup Button with Transparent Background and Black Border
        OutlinedButton(
            onClick = onSignupClick,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(50.dp),
            border = BorderStroke(2.dp, Color.Black),
            shape = CircleShape,
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.Transparent,
                contentColor = Color.Black
            )
        ) {
            Text(
                text = "Sign Up",
                color = Color.White,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold
                )
            )
        }
    }
}
