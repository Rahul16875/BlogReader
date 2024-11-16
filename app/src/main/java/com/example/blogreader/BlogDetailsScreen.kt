package com.example.blogreader

//@SuppressLint("SetJavaScriptEnabled")
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun BlogDetailScreen(url: String) {
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text("Blog Content") }
//            )
//        }
//    ) { paddingValues ->
//        AndroidView(
//            factory = { context ->
//                WebView(context).apply {
//                    webViewClient = WebViewClient() // Ensures content opens in the WebView
//                    settings.javaScriptEnabled = true // Enable JavaScript if needed
//                    loadUrl(url) // Load the blog content URL
//                }
//            },
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(paddingValues)
//        )
//    }
//}
import android.annotation.SuppressLint
import android.net.Uri
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@SuppressLint("SetJavaScriptEnabled")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BlogDetailScreen(url: String) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Blog Content") }
            )
        }
    ) { paddingValues ->
        // Decode the URL before loading it in the WebView
        val decodedUrl = Uri.decode(url) // Decode the URL

        // Ensure the URL uses https://, if it doesn't, replace it
        val finalUrl = if (decodedUrl.startsWith("http://")) {
            decodedUrl.replace("http://", "https://")
        } else {
            decodedUrl
        }

        // Log the URL being passed to WebView
        Log.d("WebView", "Loading URL: $finalUrl") // Log the URL

        AndroidView(
            factory = { context ->
                WebView(context).apply {
                    webViewClient = WebViewClient() // Ensures content opens in the WebView
                    settings.javaScriptEnabled = true // Enable JavaScript if needed
                    loadUrl(finalUrl) // Load the blog content URL
                }
            },
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        )
    }
}

