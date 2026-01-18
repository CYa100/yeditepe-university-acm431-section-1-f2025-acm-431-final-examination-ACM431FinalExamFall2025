package com.yeditepe.finalexam.navigation

import android.net.Uri
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yeditepe.finalexam.ui.TaskDetailScreen
import com.yeditepe.finalexam.ui.TaskListScreen

@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "tasks"
    ) {

        // TODO 1: Add composable for "tasks"
        composable("tasks") {
            // Burada TaskListScreen'i parametresiz çağırıyoruz (mevcut imzaya uyumlu)
            TaskListScreen()
        }

        // TODO 2: Add composable for "taskDetail/{title}"
        composable("taskDetail/{title}") { backStackEntry ->
            val rawTitle = backStackEntry.arguments?.getString("title") ?: ""
            val title = Uri.decode(rawTitle)
            TaskDetailScreen(title = title)
        }
    }
}
