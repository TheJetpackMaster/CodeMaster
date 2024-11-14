package com.codemaster.codemasterapp.ui.theme

import android.app.Activity
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ripple
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import com.codemaster.codemasterapp.ui.theme.CodeMasterThemes.colorScheme


private val SmallTypography = CodeMasterTypography(
    titleLarge = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    ),
    titleMedium = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium
    ),
    titleSmall = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium
    ),
    bodyLarge = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    ),
    bodyMedium = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Medium
    ),
    bodySmall = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal
    )
)

private val MediumTypography = CodeMasterTypography(
    titleLarge = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    ),
    titleMedium = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium
    ),
    titleSmall = TextStyle(
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium
    ),
    bodyLarge = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    ),
    bodyMedium = TextStyle(
        fontSize = 13.sp,
        fontWeight = FontWeight.Medium
    ),
    bodySmall = TextStyle(
        fontSize = 13.sp,
        fontWeight = FontWeight.Normal
    )
)

private val LargeTypography = CodeMasterTypography(
    titleLarge = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    ),
    titleMedium = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Medium
    ),
    titleSmall = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium
    ),
    bodyLarge = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal
    ),
    bodyMedium = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium
    ),
    bodySmall = TextStyle(
        fontSize = 13.sp,
        fontWeight = FontWeight.Normal
    )
)

// Sizes


private val smallestSizes = CodeMasterSizes(
    large = 260.dp,
    medium = 200.dp,
    normal = 40.dp,
    small = 12.dp
)

private val smallSizes = CodeMasterSizes(
    large = 300.dp,
    medium = 245.dp,
    normal = 46.dp,
    small = 12.dp
)

private val mediumSizes = CodeMasterSizes(
    large = 340.dp,
    medium = 280.dp,
    normal = 54.dp,
    small = 18.dp
)

private val largeSizes = CodeMasterSizes(
    large = 380.dp,
    medium = 305.dp,
    normal = 62.dp,
    small = 24.dp
)


@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun CodeMasterThemes(
    activity: Activity,
    content: @Composable () -> Unit
) {
    val windows = calculateWindowSizeClass(activity = activity)
    val config = LocalConfiguration.current

//    val colorScheme = when (themeChoice) {
//
//        else -> throw IllegalArgumentException("Invalid theme choice: $themeChoice")
//    }
    val rippleIndication = ripple(
        bounded = true,
        color = CodeMasterThemes.colorScheme.secondary,
        radius = Dp.Unspecified
    )

    val typography = when (windows.widthSizeClass) {
        WindowWidthSizeClass.Compact -> {
            if (config.screenWidthDp <= 360) {
                SmallTypography


            } else if (config.screenWidthDp <= 411) {
                MediumTypography

            } else {
                LargeTypography
            }
        }

        else -> {
            LargeTypography // Default typography for other size classes
        }

    }

    val sizes = when (windows.widthSizeClass) {
        WindowWidthSizeClass.Compact -> {
            if (config.screenWidthDp < 360) {
                smallestSizes

            } else if(config.screenWidthDp == 360){
                smallSizes

            } else if (config.screenWidthDp <= 411) {
                mediumSizes

            } else {
                largeSizes
            }
        }

        else -> {
            largeSizes
        }

    }

    CompositionLocalProvider(
        localCodeMasterColorScheme provides colorScheme,
        localCodeMasterTypography provides typography,
        localCodeMasterSize provides sizes,
        LocalIndication provides rippleIndication,
        content = content
    )

    val darkTheme = isSystemInDarkTheme()
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = Color.Transparent.toArgb()
            window.navigationBarColor = Color.Transparent.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars
        }
    }
}

object CodeMasterThemes {
    val colorScheme: CodeMasterColorScheme
        @Composable get() = localCodeMasterColorScheme.current

    val typography: CodeMasterTypography
        @Composable get() = localCodeMasterTypography.current

    val sizes: CodeMasterSizes
        @Composable get() = localCodeMasterSize.current
}
