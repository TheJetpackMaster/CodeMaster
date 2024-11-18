package com.codemaster.codemasterapp.main.ui.auth

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
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
import com.codemaster.codemasterapp.main.ui.bottomNavigation.components.CustomTextField
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.AuthRoutes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(navController: NavController) {
    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {
            TopAppBar(
                windowInsets = WindowInsets(top = 30.dp),
                navigationIcon = {
                    Spacer(Modifier.width(12.dp))
                    OutlinedIconButton(
                        border = BorderStroke(width = 2.dp, color = Color.White.copy(.8f)),
                        modifier = Modifier
                            .height(34.dp)
                            .width(44.dp)
                            .padding(start = 10.dp),
                        onClick = { navController.popBackStack() }
                    ) {

                        Icon(
                            imageVector = Icons.AutoMirrored.Default.KeyboardArrowLeft,
                            contentDescription = "Back",
                            tint = Color.White.copy(.8f),
                            modifier = Modifier.size(26.dp)
                        )
                    }
                },
                title = {
                    /*Text(
                        text = "Login",
                        style = MaterialTheme.typography.titleMedium.copy(color = Color.White)
                    )*/
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent)
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Color(0xFF576cd6)
                    )
                    .padding(paddingValues),
                // .verticalScroll(scrollState),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                SignUpSection(
                    onLoginClick = {
                        navController.navigate(AuthRoutes.LoginScreen.route)
                    },
                    onRegisterClick = {
                        navController.navigate(AuthRoutes.LoginScreen.route)
                    })
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpSection(
    onLoginClick: () -> Unit,
    onRegisterClick: () -> Unit,
) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var ConfirmPassword by remember { mutableStateOf("") }

    // Load Lottie composition
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.signup))

    // Animate the composition
    val progress by animateLottieCompositionAsState(
        composition = composition,
        iterations = LottieConstants.IterateForever // Infinite loop
    )


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 0.dp,
                start = 18.dp, end = 18.dp,
            )
            .verticalScroll(rememberScrollState())

    ) {
        LottieAnimation(
            composition = composition,
            progress = { progress },
            modifier = Modifier
                .size(120.dp)
                .scale(1.4f)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp)
        ) {

            Text(
                text = "Register",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Create your account",
                style = MaterialTheme.typography.bodyMedium.copy(color = Color.White),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(24.dp))

            // Username TextField
            CustomTextField(
                value = username,
                onValueChange = { username = it },
                hint = "Username",
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Username Icon",
                        tint = Color.Gray
                    )
                }
            )

            Spacer(modifier = Modifier.height(12.dp))

            CustomTextField(
                value = email,
                onValueChange = { email = it },
                hint = "Email",
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Username Icon",
                        tint = Color.Gray
                    )
                }
            )

            Spacer(modifier = Modifier.height(12.dp))

            CustomTextField(
                value = password,
                onValueChange = { password = it },
                hint = "Password",
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Username Icon",
                        tint = Color.Gray
                    )
                }
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Password TextField
            CustomTextField(
                value = ConfirmPassword,
                onValueChange = { ConfirmPassword = it },
                hint = "Confirm Password",
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Username Icon",
                        tint = Color.Gray
                    )
                }
            )

            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "By continuing, you agree to our Terms of Service and Privacy Policy.",
                style = MaterialTheme.typography.bodySmall.copy(color = Color.White),
                textAlign = TextAlign.Start
            )
        }


        Spacer(modifier = Modifier.weight(1f))
        Spacer(Modifier.height(12.dp))

        // Register Button
        Button(
            onClick = onRegisterClick,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            contentPadding = PaddingValues(),
            modifier = Modifier.shadow(2.dp, shape = CircleShape)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color(0xFF252B52), // First gradient color
                                Color(0xFF3F4C88)  // Second gradient color
                            )
                        ),
                        shape = RoundedCornerShape(8.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Register",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }

        //Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Already have an account?",
                style = MaterialTheme.typography.bodyMedium.copy(color = Color.White),
                textAlign = TextAlign.Center
            )
            TextButton(onClick = onLoginClick) {
                Text(
                    text = "Login",
                    style = MaterialTheme.typography.bodyMedium.copy(color = Color.White),
                    textAlign = TextAlign.Center
                )
            }
        }

        Spacer(Modifier.height(24.dp))
    }
}


