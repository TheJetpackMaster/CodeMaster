package com.codemaster.codemasterapp.main.ui.onboarding

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.AuthRoutes
import com.codemaster.codemasterapp.main.ui.viewModels.MainViewModel
import com.google.accompanist.pager.*
import kotlinx.coroutines.launch

@Composable
fun OnBoardingScreen(
    mainViewModel: MainViewModel,
    navController: NavController
) {
    val pagerState = rememberPagerState()
    val scope = rememberCoroutineScope()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF0F2B54),
                        Color(0xFF061934),
                        Color(0xFF030B1E)
                    )
                )
            )
            .padding(bottom = 16.dp)
            .statusBarsPadding()
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Horizontal Pager
            HorizontalPager(
                count = 3,
                state = pagerState,
                modifier = Modifier.weight(1f)
            ) { page ->
                when (page) {
                    0 -> CodeMasterOnboardingPage(
                        animationRes = R.raw.onboarding1,
                        mainText = "Master Coding Skills",
                        paragraphText = "Unlock the secrets of programming with our expertly crafted lessons. Step into the world of coding mastery!"
                    )

                    1 -> CodeMasterOnboardingPage(
                        animationRes = R.raw.onboarding2,
                        lotieScale = 1.5f,
                        mainText = "Interactive Challenges",
                        paragraphText = "Test your skills with hands-on coding challenges designed to push your limits and sharpen your expertise."
                    )

                    2 -> CodeMasterOnboardingPage(
                        animationRes = R.raw.onboarding3,
                        lotieScale = 1.3f,
                        mainText = "Learn Anytime, Anywhere",
                        paragraphText = "Access coding lessons and challenges on the go. Build your skills at your own pace, wherever you are."
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Pager Indicator
            HorizontalPagerIndicator(
                pagerState = pagerState,
                activeColor =  Color.Magenta.copy(.7f),
                inactiveColor = Color.Gray,
                modifier = Modifier.padding(8.dp)

            )

            Spacer(modifier = Modifier.height(26.dp))
        }



        Row( modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomCenter))
        {
            OverlappingWaveLines()
        }

        // Bottom Buttons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextButton(onClick = {
                mainViewModel.setIsFirstTime(false)
                navController.navigate(AuthRoutes.PreRegistrationScreen.route)

            }) {
                Text(
                    text = "Skip",
                    color = Color.LightGray,
                    fontSize = 16.sp
                )
            }

            IconButton(
                onClick = {
                    if (pagerState.currentPage < pagerState.pageCount - 1) {

                        scope.launch { pagerState.animateScrollToPage(pagerState.currentPage + 1) }
                    } else {
                        mainViewModel.setIsFirstTime(false)
                        navController.navigate(AuthRoutes.PreRegistrationScreen.route){
                            // Ensure to pop back to prevent navigating back to onboarding
                            popUpTo(AuthRoutes.OnboardingScreen.route) { inclusive = true }
                        }

                    }
                },
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = Color.Transparent
                ),
                modifier = Modifier.size(48.dp)
                    .clip(CircleShape)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color.Magenta.copy(.9f),
                                Color.Magenta.copy(.4f)
                            )
                        ))

            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Next",
                    tint = Color.White
                )
            }
        }

    }
}


@Composable
fun CodeMasterOnboardingPage(
    animationRes: Int, // Lottie animation resource ID
    lotieScale:Float = 2f,
    mainText: String,
    paragraphText: String
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Remember Lottie composition
        val composition = rememberLottieComposition(LottieCompositionSpec.RawRes(animationRes))

        // Animate the Lottie composition with looping enabled
        val progress = animateLottieCompositionAsState(
            composition = composition.value,
            iterations = LottieConstants.IterateForever
        )

        LottieAnimation(
            composition = composition.value,
            progress = { progress.value },
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(.3f)
                .scale(lotieScale)
                .align(Alignment.CenterHorizontally)

        )

        Spacer(modifier = Modifier.height(120.dp))

        // Main Text
        Text(
            text = mainText,
            color = Color.White.copy(.8f),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Paragraph Text
        Text(
            text = paragraphText,
            color = Color.LightGray.copy(.8f),
            fontSize = 14.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))
    }
}


@Composable
fun OverlappingWaveLines() {
    Canvas(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp) // Height for dramatic waves
    ) {

        // Fixed wave parameters
        val waveWidth = size.width / 2 // Width of each wave segment
        val firstWaveStartY = size.height / 5 // Starting Y for the first wave
        val secondWaveStartY = firstWaveStartY + 30f // Slightly offset the second wave

        // Define two different wave heights for dynamic variation
        val waveHeight1 = 100f // First wave with a large magnitude
        val waveHeight2 = 120f // Second wave with a larger magnitude

        // First Wave (with larger amplitude)
        val path1 = Path().apply {
            moveTo(0f, firstWaveStartY)
            cubicTo(
                waveWidth / 2, firstWaveStartY - waveHeight1, // Control point 1
                waveWidth / 2, firstWaveStartY + waveHeight1, // Control point 2
                waveWidth, firstWaveStartY // End point
            )
            cubicTo(
                waveWidth + waveWidth / 2, firstWaveStartY - waveHeight1,
                waveWidth + waveWidth / 2, firstWaveStartY + waveHeight1,
                size.width, firstWaveStartY
            )
        }
        drawPath(
            path = path1,
            color = Color.Magenta.copy(alpha = 0.5f), // Stronger color for the first wave
            style = Stroke(width = 5f, cap = StrokeCap.Round)
        )

        // Second Wave (with larger amplitude and slight random overlap)
        val path2 = Path().apply {
            moveTo(0f, secondWaveStartY) // Starts slightly lower
            cubicTo(
                waveWidth / 2, secondWaveStartY - waveHeight2, // Control point 1
                waveWidth / 2, secondWaveStartY + waveHeight2, // Control point 2
                waveWidth, secondWaveStartY // End point
            )
            cubicTo(
                waveWidth + waveWidth / 2, secondWaveStartY - waveHeight2,
                waveWidth + waveWidth / 2, secondWaveStartY + waveHeight2,
                size.width, secondWaveStartY
            )
        }
        drawPath(
            path = path2,
            color = Color.Magenta.copy(alpha = 0.2f), // Lighter color for the second wave
            style = Stroke(width = 5f, cap = StrokeCap.Round)
        )
    }
}


