package com.codemaster.codemasterapp.main.ui.learning.selection

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButtonDefaults.elevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.codemaster.codemasterapp.R
import com.codemaster.codemasterapp.main.ui.components.LanguageCardDesign
import com.codemaster.codemasterapp.main.ui.components.SelectionCardDesign
import com.codemaster.codemasterapp.ui.theme.bluishJava
import com.codemaster.codemasterapp.ui.theme.bluishPython
import com.codemaster.codemasterapp.ui.theme.greenishPython
import com.codemaster.codemasterapp.ui.theme.magentaCpp
import com.codemaster.codemasterapp.ui.theme.purpleCpp
import com.codemaster.codemasterapp.ui.theme.yellowishJava

/*@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelectionScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "CodeMaster",
                        color = Color(0xFFE5E5C2),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF255A70)
                ),
            )
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF000000))
                    .padding(paddingValues),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(24.dp) // Increase vertical space between elements
                ) {
                    // Title Text
                    Text(
                        text = "Select your learning stage:",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp) // Extra padding for spacing
                    )

                    // Row for Easy, Medium cards
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(24.dp) // Increased spacing between cards
                    ) {
                        // Easy card
                        SelectionCardDesign(
                            stageName = "Easy",
                            gradientColors = listOf(purpleCpp, magentaCpp),
                            icon = painterResource(id = R.drawable.cpp),
                            onClick = {
                                navController.navigate("courseScreen/easy")
                            },
                            modifier = Modifier.weight(1f)
                        )

                        // Medium card
                        SelectionCardDesign(
                            stageName = "Medium",
                            gradientColors = listOf(purpleCpp, magentaCpp),
                            icon = painterResource(id = R.drawable.cpp),
                            onClick = {
                                navController.navigate("courseScreen/medium")
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }

                    // Row for Hard and Expert cards
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(24.dp) // Increased spacing between cards
                    ) {
                        // Hard card
                        SelectionCardDesign(
                            stageName = "Hard",
                            gradientColors = listOf(purpleCpp, magentaCpp),
                            icon = painterResource(id = R.drawable.cpp),
                            onClick = {
                                navController.navigate("courseScreen/hard")
                            },
                            modifier = Modifier.weight(1f)
                        )

                        // Expert card
                        SelectionCardDesign(
                            stageName = "Expert",
                            gradientColors = listOf(purpleCpp, magentaCpp),
                            icon = painterResource(id = R.drawable.cpp),  // Use an appropriate icon for Expert
                            onClick = {
                                navController.navigate("courseScreen/expert")
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }
        }
    )
}*/


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelectionScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "CodeMaster",
                        color = Color(0xFFE5E5C2),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF255A70)
                ),
            )
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF000000))
                    .padding(paddingValues)
            ) {
                Column(
                    horizontalAlignment = Alignment.Start, // Align items to start horizontally
                    //verticalArrangement = Arrangement.spacedBy(24.dp),
                    modifier = Modifier.fillMaxSize() // Ensure Column takes full size and aligns from top-left
                ) {
                    // Title and Divider
                    Column(
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 8.dp)
                            .padding(horizontal = 16.dp)
                    ) {
                        Text(
                            text = "Select Your Level:",
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "select according to your knowledge:",
                            color = Color.White.copy(alpha = 0.5f),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }


                    // Cards Row (First Row with Easy and Medium)
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp) // Adjusted spacing
                    ) {
                        // Easy card
                        SelectionCard(
                            stageName = "Easy",
                            gradientColors = listOf(
                                Color(0xFF0A2540),
                                Color(0xFF1D3557)
                            ), // Green gradient
                            icon = painterResource(id = R.drawable.cpp), // Replace with actual icon
                            onClick = {
                                //navController.navigate("courseScreen/easy")
                            },
                            modifier = Modifier.weight(1f)
                        )

                        // Medium card
                        SelectionCard(
                            stageName = "Medium",
                            gradientColors = listOf(
                                Color(0xFF0A2540),
                                Color(0xFF1D3557)
                            ), // Orange-Red gradient
                            icon = painterResource(id = R.drawable.cpp), // Replace with actual icon
                            onClick = {
                                //navController.navigate("courseScreen/medium")
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }

                    // Cards Row (Second Row with Hard and Expert)
                    /*Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp) // Adjusted spacing
                    ) {
                        // Hard card
                        SelectionCard(
                            stageName = "Hard",
                            gradientColors = listOf(
                                Color(0xFF0A2540),
                                Color(0xFF1D3557)
                            ), // Teal gradient

                            icon = painterResource(id = R.drawable.cpp), // Replace with actual icon
                            onClick = {
                                navController.navigate("courseScreen/hard")
                            },
                            modifier = Modifier.weight(1f)
                        )

                        // Expert card
                        SelectionCard(
                            stageName = "Expert",
                            gradientColors = listOf(Color(0xFF0A2540), Color(0xFF1D3557)),
                            icon = painterResource(id = R.drawable.cpp), // Replace with actual icon
                            onClick = {
                                navController.navigate("courseScreen/expert")
                            },
                            modifier = Modifier.weight(1f)
                        )
                    }*/

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp) // Adjusted spacing
                    ) {
                        // Hard card
                        SelectionCardDesign(
                            stageName = "Expert",
                            gradientColors = listOf(purpleCpp, magentaCpp),
                            icon = painterResource(id = R.drawable.cpp),  // Use an appropriate icon for Expert
                            onClick = {
                                //navController.navigate("courseScreen/expert")
                            },
                            modifier = Modifier.weight(1f).padding(horizontal = 8.dp)
                        )

                        // Expert card
                        SelectionCardDesign(
                            stageName = "Expert",
                            gradientColors = listOf(purpleCpp, magentaCpp),
                            icon = painterResource(id = R.drawable.cpp),  // Use an appropriate icon for Expert
                            onClick = {
                                //navController.navigate("courseScreen/expert")
                            },
                            modifier = Modifier.weight(1f).padding(horizontal = 8.dp)
                        )
                    }
                }
            }
        }
    )
}


@Composable
fun SelectionCard(
    stageName: String,
    gradientColors: List<Color>,
    icon: Painter,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier = modifier
            .height(155.dp)
            .padding(8.dp)
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent,
            contentColor = Color.White
        ),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.verticalGradient(gradientColors))
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                Icon(
                    painter = icon,
                    contentDescription = null,
                    modifier = Modifier.size(48.dp),
                    tint = Color.White
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = stageName,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}




