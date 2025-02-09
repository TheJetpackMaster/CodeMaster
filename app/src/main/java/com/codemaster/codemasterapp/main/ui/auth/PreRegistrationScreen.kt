package com.codemaster.codemasterapp.main.ui.auth


import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalContext
import com.codemaster.codemasterapp.main.ui.auth.components.AuthActionButton
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.AuthRoutes
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PreRegistrationScreen(navController: NavController) {

    val scrollState = rememberScrollState()

    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()

    // To prevent repeated toasts
    var toastJob by remember { mutableStateOf<Job?>(null) }

    // To prevent repeated toasts
    var isToastShowing by remember { mutableStateOf(false) }

    // Show maintenance message
    val showToast = {
        if (!isToastShowing) {
            isToastShowing = true
            Toast.makeText(context, "Currently under maintenance", Toast.LENGTH_SHORT).show()
            // After a short delay, allow showing the toast again
            coroutineScope.launch {
                delay(2000)  // Adjust delay time if needed (time in milliseconds)
                isToastShowing = false
            }
        }
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF576cd6))
            .statusBarsPadding()
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        PreRegistrationScreenContent(
            onLoginClick = {
                showToast()
            },
            onSignupClick = {
                showToast()
            },
            onGuestClick = {
                navController.navigate(AuthRoutes.GuestScreen.route)
            }
        )

    }
}

@Composable
fun PreRegistrationScreenContent(
    onLoginClick: () -> Unit,
    onSignupClick: () -> Unit,
    onGuestClick:()-> Unit
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
            .padding(12.dp)
    ) {
        // Lottie Animation completely on the right
        LottieAnimation(
            composition = composition,
            progress = { progress },
            modifier = Modifier
                .size(280.dp)
                .padding(top = 22.dp)

        )

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

        // LoginButton
        AuthActionButton(
            text = "Login",
            onClick = {
                onLoginClick()
            },
            modifier = Modifier.shadow(2.dp, shape = CircleShape)
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Signup Button with Transparent Background and Black Border
        AuthActionButton(
            text = "Sing Up",
            onClick = {
                onSignupClick()
            },
            modifier = Modifier
                .shadow(2.dp, shape = CircleShape)
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Guest Button
        AuthActionButton(
            text = "Guest",
            onClick = {
                onGuestClick()
            },
            gradientColors = listOf(
                Color.Transparent,
                Color.Transparent
            ),
            modifier = Modifier
                .border(
                    width = 2.dp,
                    color = Color(0xFF252B52),
                    shape = CircleShape
                )
                .shadow(0.dp, shape = CircleShape)
        )
    }
}
