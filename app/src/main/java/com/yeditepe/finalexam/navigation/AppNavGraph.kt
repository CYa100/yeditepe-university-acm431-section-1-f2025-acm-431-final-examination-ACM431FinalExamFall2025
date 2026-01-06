package com.yeditepe.finalexam.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "tasks"
    ) {

        // TODO 1: Add composable for "tasks"
        composable("tasks") {
            TaskListScreen(navController = navController, viewModel = viewModel)
        }

        // TODO 2: Add composable for "taskDetail/{title}"
                composable(
            "taskDetail/{title}",
            arguments = listOf(navArgument("title") { type = NavType.IntType })
        ) {
            backStackEntry ->
            val task = backStackEntry.arguments?.getInt("title") ?: -1
            if (task >= 0) {
                TaskDetailScreen(task = task, viewModel = viewModel)
            }
        }
    }
}
