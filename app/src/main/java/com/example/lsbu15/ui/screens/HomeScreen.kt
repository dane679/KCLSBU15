package com.example.lsbu15.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lsbu15.R

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF6F6F6))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ProfileImageWithOutline()
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text("Welcome", fontSize = 14.sp, color = Color.Gray)
                Text("John Doe", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun ProfileImageWithOutline() {
    Box(
        modifier = Modifier
            .size(77.dp) // Overall size of the outlined image
            .border(
                width = 3.dp,
                color = Color(0xFFFFC107),
                shape = RoundedCornerShape(45.dp) // Circular shape
            )
            .padding(5.dp) // Space between outline and image
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_image_placeholder),
            contentDescription = "Placeholder profile image",
            modifier = Modifier
                .fillMaxSize()
                .clip(CircleShape)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HomeScreen()
}