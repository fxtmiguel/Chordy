package com.example.chordy.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.chordy.ui.theme.AccordionTreble34Interactive
import com.example.chordy.ui.theme.chordButtonMap

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(onNavigateToSettings: () -> Unit = {}) {

    val chordTabs = listOf("G", "F", "Bb", "Eb")
    var selectedTab by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Accordion Chords") },
                actions = {
                    IconButton(onClick = onNavigateToSettings) {
                        Icon(Icons.Default.Settings, contentDescription = "Settings")
                    }
                }
            )
        },
        contentWindowInsets = WindowInsets(0, 0, 0, 0)

    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            TabRow(selectedTabIndex = selectedTab) {
                chordTabs.forEachIndexed { index, chord ->
                    Tab(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        text = { Text(chord) }
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 0.dp),
                contentAlignment = Alignment.Center
            ) {
                val highlighted = chordButtonMap[chordTabs[selectedTab]] ?: emptySet()
                AccordionTreble34Interactive(selectedChord = chordTabs[selectedTab])
            }
        }
    }
}
