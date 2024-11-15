package com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph

import com.codemaster.codemasterapp.R
import android.graphics.drawable.Drawable
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


// Helper data class for language information
data class LanguageData(val name: String, val iconRes: Int)


@Composable
fun home(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Home",
            color = Color.White
        )
    }
}

@Composable
fun settings(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Settings",
            modifier = Modifier.clickable(
                onClick = {
                    navController.navigate("test")
                }
            ),
            color = Color.White
        )
    }
}

@Composable
fun main(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "MainScreen",
            color = Color.White
        )
    }
}


//
//@Composable
//fun GlossyLanguageCard(
//    languageName: String,
//    gradientColors: List<Color>,
//    languageImage: Painter,
//    onClick: () -> Unit
//) {
//    Card(
//        modifier = Modifier
//            .padding(16.dp)
//            .fillMaxWidth()
//            .height(200.dp)
//            .clickable { onClick() },
//        shape = RoundedCornerShape(24.dp),
//        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
//        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
//    ) {
//        // Outer Box with gradient background
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(
//                    Brush.linearGradient(
//                        colors = gradientColors,
//                        start = Offset(0f, 0f),
//                        end = Offset(500f, 500f)
//                    )
//                )
//        ) {
//            // Glass effect overlay
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .clip(RoundedCornerShape(24.dp))
//                    .background(Color.White.copy(alpha = 0.2f))
//                    .border(1.dp, Color.White.copy(alpha = 0.4f), RoundedCornerShape(24.dp))
//            ) {
//                Row(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(16.dp),
//                    verticalAlignment = Alignment.CenterVertically,
//                    horizontalArrangement = Arrangement.SpaceBetween
//                ) {
//                    Column(
//                        modifier = Modifier.weight(1f)
//                    ) {
//                        Text(
//                            text = languageName,
//                            style = TextStyle(
//                                color = Color.White,
//                                fontSize = 26.sp,
//                                fontWeight = FontWeight.Bold,
//                                shadow = Shadow(
//                                    color = Color.Black.copy(alpha = 0.25f),
//                                    offset = Offset(4f, 4f),
//                                    blurRadius = 8f
//                                )
//                            )
//                        )
//                        Spacer(modifier = Modifier.height(8.dp))
//                        Text(
//                            text = "Master the basics and beyond!",
//                            style = TextStyle(
//                                color = Color.White.copy(alpha = 0.85f),
//                                fontSize = 16.sp,
//                                fontWeight = FontWeight.Medium
//                            )
//                        )
//                    }
//
//                    Image(
//                        painter = languageImage,
//                        contentDescription = "$languageName icon",
//                        modifier = Modifier
//                            .size(90.dp)
//
//                            .clip(CircleShape)
//                            .border(
//                                BorderStroke(2.dp, Color.White.copy(alpha = 0.9f)),
//                                CircleShape
//                            )
//
//                            .background(Color.White.copy(alpha = 0.2f))
//                            .padding(4.dp)
//                    )
//                }
//            }
//        }
//    }
//}
