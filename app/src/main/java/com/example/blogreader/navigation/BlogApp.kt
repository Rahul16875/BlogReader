package com.example.blogreader.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.blogreader.BlogDetailScreen
import com.example.blogreader.MainScreen

@Composable
fun BlogApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "blogList"
    ) {
        composable("blogList") {
            MainScreen(navController = navController)
        }
        composable("blogDetail/{url}") { backStackEntry ->
            val url = backStackEntry.arguments?.getString("url") ?: ""
            BlogDetailScreen(url)
        }
    }
}
