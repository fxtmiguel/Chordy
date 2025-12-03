package com.example.chordy.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(onNavigateToSettings: () -> Unit = {}) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Text("Home Screen", style = MaterialTheme.typography.headlineMedium)
        Button(onClick = onNavigateToSettings, modifier = Modifier.padding(top = 16.dp)) {
            Text("Go to Settings")
        }
    }
}
