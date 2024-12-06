package com.example.lsbu15

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {
    Text("Welcome to the Home Screen!", style = MaterialTheme.typography.headlineLarge)
}

@Composable
fun CommunityScreen() {
    Text("This is your Profile.", style = MaterialTheme.typography.headlineLarge)
}

@Composable
fun ServicesScreen() {
    Text("This is the ServicesScreen.", style = MaterialTheme.typography.headlineLarge)
}

@Composable
fun EventsScreen() {
    Text("Here is the Settings screen.", style = MaterialTheme.typography.headlineLarge)
}

@Composable
fun ClubsScreen() {
    Text("Here is the Settings screen.", style = MaterialTheme.typography.headlineLarge)
}