package com.codemaster.codemasterapp.main.ui.bottomNavigation.screens

import android.graphics.Bitmap
import android.util.Log
import android.webkit.CookieManager
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebResourceResponse
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.codemaster.codemasterapp.main.ui.userProfileDetails.settings.CompilerOption
import com.codemaster.codemasterapp.main.ui.viewModels.MainViewModel

@Composable
fun CompilerScreen(
    navController: NavController,
    mainViewModel: MainViewModel
) {
    val isFirstTimeUser = remember { mutableStateOf(true) }
    //
    val url1 = "https://www.codechef.com/ide"
    val url2 = "https://www.online-ide.com/"
    val url3 = "https://ide.geeksforgeeks.org/"
    val url4 = "https://ideone.com/"
    val url5 = "https://godbolt.org/"

    val compiler = mainViewModel.selectedCompilerOption.collectAsState().value

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
    ) {
        OnlineCompilerWebView(
            url = when (compiler) {
                CompilerOption.ONLINE_COMPILER_1 -> url1
                CompilerOption.ONLINE_COMPILER_2 -> url2
                CompilerOption.ONLINE_COMPILER_3 -> url3
                CompilerOption.ONLINE_COMPILER_4 -> url4
                CompilerOption.ONLINE_COMPILER_5 -> url5
            }
        )

        // Show the information dialog if it's the first time user
        if (isFirstTimeUser.value) {
            FirstTimeDialog(
                onGoBack = {
                    isFirstTimeUser.value = false
                    navController.popBackStack()
                },
                onContinue = {
                    isFirstTimeUser.value = false
                }
            )
        }
    }

}


@Composable
fun OnlineCompilerWebView(url: String) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            WebView(context).apply {
                // Enable JavaScript and DOM storage
                settings.apply {
                    displayZoomControls = true
                    javaScriptEnabled = true
                    domStorageEnabled = true
                    mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
//                    userAgentString = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36"
                    setSupportZoom(false)
                    builtInZoomControls = false
                    displayZoomControls = false
                    useWideViewPort = true
                    loadWithOverviewMode = false
                }

                // Allow third-party cookies
                CookieManager.getInstance().setAcceptThirdPartyCookies(this, true)

                // Set WebViewClient to manage navigation and handle errors
                webViewClient = object : WebViewClient() {
                    override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                        super.onPageStarted(view, url, favicon)
                        Log.d("WebView", "Page loading started: $url")
                    }

                    override fun onPageFinished(view: WebView?, url: String?) {
                        super.onPageFinished(view, url)
                        Log.d("WebView", "Page loading finished: $url")
                    }

                    override fun onReceivedError(
                        view: WebView?,
                        errorCode: Int,
                        description: String?,
                        failingUrl: String?
                    ) {
                        super.onReceivedError(view, errorCode, description, failingUrl)
                        Log.e("WebView", "Error: $errorCode $description $failingUrl")
                    }

                    override fun onReceivedHttpError(
                        view: WebView?,
                        request: WebResourceRequest?,
                        errorResponse: WebResourceResponse?
                    ) {
                        super.onReceivedHttpError(view, request, errorResponse)
                        Log.e("WebView", "HTTP error: ${errorResponse?.statusCode}")
                    }
                }

                // Add WebChromeClient for better handling of dynamic content
                webChromeClient = WebChromeClient()

                // Enable debugging to inspect the WebView
                WebView.setWebContentsDebuggingEnabled(true)

                // Load the URL
                loadUrl(url)
            }
        }
    )
}

@Composable
fun FirstTimeDialog(onGoBack: () -> Unit, onContinue: () -> Unit) {
    AlertDialog(
        onDismissRequest = {},
        title = { Text("Warning! Read Carefully") },
        text = {

            Text(
                "This is an online compiler integrated into the app for your convenience. " +
                        "Please note that it does not belong to us and may contain ads." +
                        " We’ve added it to simplify your practice experience." +
                        "You can also select different online compilers from general settings section."
            )
        },
        confirmButton = {
            Button(onClick = onContinue) {
                Text("Continue")
            }
        },
        dismissButton = {
            Button(onClick = onGoBack) {
                Text("Go Back")
            }
        }
    )
}

