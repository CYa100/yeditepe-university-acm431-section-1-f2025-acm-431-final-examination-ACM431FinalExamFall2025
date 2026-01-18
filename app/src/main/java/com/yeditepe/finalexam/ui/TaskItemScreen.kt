package com.yeditepe.finalexam.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TaskItemScreen() {

    // TODO 1: Create a mutable state to hold completion status (Boolean)
    // Initial value should be false
    var completed by remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(16.dp)) {

        Text(
            text = "Submit Final Project",
            style = MaterialTheme.typography.titleLarge
        )

        // TODO 2: Show text "Completed" or "Not Completed"
        // depending on completion state
        Text(
            text = if (completed) "Completed" else "Not Completed",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
        )

        Button(
            onClick = {
                // TODO 3: Toggle completion state
                completed = !completed
            }
        ) {
            Text("Change Status")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskItemPreview() {
    // TODO: Call TaskItemScreen
    TaskItemScreen()
}
