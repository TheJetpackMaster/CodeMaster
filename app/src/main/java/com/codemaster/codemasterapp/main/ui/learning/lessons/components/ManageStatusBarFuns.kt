package com.codemaster.codemasterapp.main.ui.learning.lessons.components

import android.os.Build
import android.view.View
import android.view.Window
import android.view.WindowInsets
import android.view.WindowInsetsController
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect


@Composable
fun ManageStatusBar(window: Window, onDispose: () -> Unit) {
    DisposableEffect(Unit) {
        // Hide the status bar when this composable is created
        hideStatusBar(window)

        onDispose {
            onDispose()
            // Restore the status bar when the composable is disposed
            showStatusBar(window)
        }
    }
}

private fun hideStatusBar(window: Window) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
        // API 30 and above
        val controller = window.insetsController
        controller?.hide(WindowInsets.Type.statusBars())
        controller?.systemBarsBehavior =
            WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
    } else {
        // Below API 30
        @Suppress("DEPRECATION")
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_FULLSCREEN or
                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                )
    }
}

private fun showStatusBar(window: Window) {
    // Restore the status bar when leaving the screen
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
        window.insetsController?.show(WindowInsets.Type.statusBars())
    } else {
        @Suppress("DEPRECATION")
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
    }

}
