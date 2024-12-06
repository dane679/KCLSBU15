package com.example.lsbu15

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color

@Composable
fun BottomNavigationDemo() {
    val tabs = listOf(TabItem.Home, TabItem.Services,TabItem.Profile, TabItem.Events, TabItem.Clubs)
    var selectedTabIndex by remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            Column {
                // Divider for the top border
                HorizontalDivider(
                    color = Color(0xFF81858F), // Hex color for #81858F
                    thickness = 2.dp,          // Thickness of the border
                    modifier = Modifier.fillMaxWidth()
                )
                // Navigation Bar
                NavigationBar(containerColor = Color.White) { // Set the NavigationBar background to white
                    tabs.forEachIndexed { index, tab ->
                        NavigationBarItem(
                            selected = selectedTabIndex == index,
                            onClick = { selectedTabIndex = index },
                            icon = { Icon(
                                painter = painterResource(id = tab.icon),
                                contentDescription = tab.title,
                                tint = if (selectedTabIndex == index) Color(0xFFFFC102) else Color.Gray
                            )},
                            label = {
//                                Text(
//                                tab.title,
//                                color = if (selectedTabIndex == index) Color(0xFFFFC102) else Color.Gray // Change text color
//                                    )
                                AutoResizedText(
                                    text = tab.title,
                                    color = if (selectedTabIndex == index) Color(0xFFFFC102) else Color.Gray // Change text color
                                )
                            },
                            alwaysShowLabel = true,
                            colors = NavigationBarItemDefaults.colors( // Override background effect
                                selectedIconColor = Color(0xFFFFC102),
                                unselectedIconColor = Color.Gray,
                                selectedTextColor = Color(0xFFFFC102),
                                unselectedTextColor = Color.Gray,
                                indicatorColor = Color.Transparent // Remove the default background indicator
                            )
                        )
                    }
                }
            }
        }
    ) { contentPadding ->
        Surface(
            modifier = Modifier.padding(contentPadding),
            color = MaterialTheme.colorScheme.background
        ) {
            tabs[selectedTabIndex].screen()
        }
    }
}