package com.codemaster.codemasterapp.main.ui.bottomNavigation;

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.util.Log
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import com.codemaster.codemasterapp.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.codemaster.codemasterapp.main.DataBase.NoteViewModel
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.RootNavHost
import com.codemaster.codemasterapp.main.ui.bottomNavigation.navgraph.routes.BottomNavRoutes
import com.codemaster.codemasterapp.main.ui.viewModels.CourseViewModel
import kotlin.random.Random


@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun MainScreen(
    courseViewModel: CourseViewModel,
    noteViewModel: NoteViewModel,
    context: Context
) {
    val navController = rememberNavController()


    // Showing bottom bar
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination?.route
    val showBar =
        currentDestination == BottomNavRoutes.HomeScreen.route || currentDestination == BottomNavRoutes.AchievementsScreen.route


    // Ask for exiting app
    val shouldExit = remember { mutableStateOf(false) }

    // Handle back press
    val backDispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher
    DisposableEffect(backDispatcher) {
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {

                if (!shouldExit.value) {
                    shouldExit.value = true
                } else {
                    (context as? Activity)?.finish()
                }
            }
        }

        backDispatcher?.addCallback(callback)
        onDispose {
            callback.remove()
        }
    }

    Log.d("exit",shouldExit.value.toString())
    Scaffold(
        bottomBar = {
            if (showBar) {

                val bottomBarItems = listOf(
                    BottomBarItem(
                        "Home",
                        R.drawable.stud,
                        route = BottomNavRoutes.HomeScreen.route
                    ),
                    BottomBarItem(
                        "Compiler",
                        R.drawable.com,
                        route = BottomNavRoutes.CompilerScreen.route
                    ),
                    BottomBarItem(
                        "Achievements",
                        R.drawable.achivments,
                        route = BottomNavRoutes.AchievementsScreen.route
                    )
                )

                CustomBottomBar(
                    items = bottomBarItems,
                    navController = navController
                )
            }
        }
    ) { innerPadding ->
        val darkGradient = Brush.verticalGradient(
            colors = listOf(
                Color(0xFF2C5364), // Charcoal
                Color(0xFF203A43), // Dark Teal Blue
                Color(0xFF0F2027), // Deep Blackish Teal

            )
        )

        val blueTechGradient = Brush.verticalGradient(
            colors = listOf(
                Color(0xFF344759),  // Steel Blue
                Color(0xFF202833), // Slightly Lighter Blue Gray
                Color(0xFF1A1D23), // Dark Charcoal Blue
            )
        )

        val purpleAccentGradient = Brush.verticalGradient(
            colors = listOf(
                Color(0xFF1E0630), // Dark Purple
                Color(0xFF2A104B), // Deep Violet
                Color(0xFF3E2068)  // Muted Purple
            )
        )

        TechBackground(
            navController = navController,
            courseViewModel = courseViewModel,
            noteViewModel = noteViewModel
        )


        ExitConfirmationDialog(
            openDialog = shouldExit,
            onExitClick = {
                (context as? Activity)?.finish()
                shouldExit.value = false
            },

            onCancelClick = {
                shouldExit.value = false
            }
        )


    }
}




val blueTechGradient = Brush.verticalGradient(
    colors = listOf(
        Color(0xFF344759),  // Steel Blue
        Color(0xFF202833), // Slightly Lighter Blue Gray
        Color(0xFF1A1D23), // Dark Charcoal Blue
    )
)

val screenBackgroundGradient = Brush.verticalGradient(
    colors = listOf(
        Color(0xFF101820), // Very Dark Blue
        Color(0xFF0F263D), // Slightly Brighter Blue
        Color(0xFF15476E)  // Cool Medium Blue
    )
)

@Composable
fun TechBackground(
    navController: NavHostController,
    courseViewModel: CourseViewModel,
    noteViewModel: NoteViewModel
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = screenBackgroundGradient)

    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val width = size.width
            val height = size.height

            // Binary numbers
            for (i in 0..30) {
                drawContext.canvas.nativeCanvas.drawText(
                    if (Random.nextBoolean()) "1010 0101" else "1100 1110",
                    Random.nextFloat() * width,
                    Random.nextFloat() * height,
                    android.graphics.Paint().apply {
                        color = android.graphics.Color.WHITE
                        alpha = 40
                        textSize = 20f
                        isAntiAlias = true
                    }
                )
            }

            // Circular paths
            for (i in 1..5) {
                val centerX = Random.nextFloat() * width
                val centerY = Random.nextFloat() * height
                drawCircle(
                    color = Color.White.copy(alpha = 0.05f),
                    radius = 50f * i,
                    center = Offset(centerX, centerY),
                    style = Stroke(width = 1.5f)
                )
            }

            // Curved coding brackets
            for (i in 0..2) {
                val bracketPath = Path().apply {
                    moveTo(Random.nextFloat() * width, Random.nextFloat() * height)
                    cubicTo(
                        Random.nextFloat() * width, Random.nextFloat() * height,
                        Random.nextFloat() * width, Random.nextFloat() * height,
                        Random.nextFloat() * width, Random.nextFloat() * height
                    )
                }
                drawPath(
                    path = bracketPath,
                    color = Color.White.copy(alpha = 0.1f),
                    style = Stroke(width = 2f)
                )
            }

            // Coding symbols ("</>")
            for (i in 0..15) {
                drawContext.canvas.nativeCanvas.drawText(
                    "</>",
                    Random.nextFloat() * width,
                    Random.nextFloat() * height,
                    android.graphics.Paint().apply {
                        color = android.graphics.Color.WHITE
                        alpha = 40 // Slightly more visible
                        textSize = 25f
                        isAntiAlias = true
                    }
                )
            }

            // Circuit lines
            for (i in 0..10) {
                val startX = Random.nextFloat() * width
                val startY = Random.nextFloat() * height
                val endX = startX + (Random.nextFloat() * 100f - 50f)
                val endY = startY + (Random.nextFloat() * 100f - 50f)
                drawLine(
                    color = Color.White.copy(alpha = 0.2f),
                    start = Offset(startX, startY),
                    end = Offset(endX, endY),
                    strokeWidth = 1.5f
                )
            }
        }

        val screenBackgroundGradient2 = Brush.verticalGradient(
            colors = listOf(
                Color(0x99101820), // Very Dark Blue
                Color(0x990F263D), // Slightly Brighter Blue
                Color(0x9915476E)  // Cool Medium Blue
            )
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(screenBackgroundGradient2)
        ) {

        }
        RootNavHost(
            navController = navController,
            courseViewModel = courseViewModel,
            noteViewModel = noteViewModel
        )
    }
}


@Composable
fun ExitConfirmationDialog(
    openDialog: MutableState<Boolean>,
    onExitClick: () -> Unit = {},
    onCancelClick: () -> Unit = {}
) {
    if (openDialog.value) {
        AlertDialog(
            containerColor = Color.Transparent,
            onDismissRequest = { openDialog.value = false },
            title = {
                Text(
                    text = "Exit?",
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontWeight = FontWeight.Bold
                    ),
                    color = MaterialTheme.colorScheme.onSurface
                )
            },
            text = {
                Text(
                    text = "Are you sure you want to exit? You can always come back! 👋",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            },
            confirmButton = {
                TextButton(
                    colors = ButtonDefaults.textButtonColors(containerColor = Color(0xFF121A2D)),
                    onClick = {
                        onExitClick()
                    }
                ) {
                    Text(
                        text = "Exit",
                        color = Color(0xFFDD2C00), // Bright red for confirmation
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            },
            dismissButton = {
                TextButton(
                    colors = ButtonDefaults.textButtonColors(containerColor = Color(0xFF121A2D)),
                    onClick = {
                        onCancelClick()
                    }
                ) {
                    Text(
                        text = "Stay Here",
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.bodyLarge.copy(
                            fontWeight = FontWeight.Bold
                        )
                    )
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(Color(0xFF1A233A), shape = RoundedCornerShape(12.dp))
        )
    }
}