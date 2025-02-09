package com.codemaster.codemasterapp.main.ui.splash

import android.content.Context
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.airbnb.lottie.LottieProperty
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.airbnb.lottie.compose.rememberLottieDynamicProperties
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.AuthRoutes
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.BottomNavRoutes
import com.codemaster.codemasterapp.main.ui.viewModels.MainViewModel
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    mainViewModel: MainViewModel,
    navController: NavController
) {

    val isSignedUp = mainViewModel.isSignedUp.collectAsState()



    // Remember Lottie composition
    val composition = rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.splashscreenlotie))

    // Animate the Lottie composition with looping enabled
    val progress = animateLottieCompositionAsState(
        composition = composition.value,
        iterations = LottieConstants.IterateForever
    )

    // Perfect Background Gradient (Dark Blue → Cyan → Teal)
    val backgroundBrush = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF101820), // Very Dark Blue
            Color(0xFF0F263D), // Slightly Brighter Blue
            Color(0xFF15476E)  // Cool Medium Blue
        )
    )

//    val dynamicProperties = rememberLottieDynamicProperties(
//        LottieProperty.COLOR to Color.Red
//    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundBrush), // Apply gradient background
        contentAlignment = Alignment.Center
    ) {
        LottieAnimation(
            composition = composition.value,
            modifier = Modifier
                .size(300.dp)
                .scale(1.4f)


        )
    }

    LaunchedEffect(Unit) {
        delay(1700) // Delay for 2 seconds (or your desired time)
        navController.navigate(
            if (isSignedUp.value) BottomNavRoutes.BOTTOM_ROOT.route
            else AuthRoutes.AUTH_ROOT.route
        ) {
            popUpTo(if(isSignedUp.value) BottomNavRoutes.HomeScreen.route else AuthRoutes.PreRegistrationScreen.route) {
                inclusive = true // This will remove the pop-up screen from the stack as well
            }
        }

    }
}


