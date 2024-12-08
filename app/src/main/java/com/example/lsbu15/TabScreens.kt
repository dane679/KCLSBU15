package com.example.lsbu15

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.lsbu15.ui.screens.HomeScreen

@Composable
fun HScreen() {
//    Column {
//        Row {
//        Image(
//            painter = painterResource(id = R.drawable.profile_image_placeholder),
//            contentDescription = "Placeholder profile image")
//        }
//    }
    HomeScreen()
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