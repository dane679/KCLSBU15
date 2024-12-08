package com.example.lsbu15

import androidx.compose.runtime.Composable

sealed class TabItem(val title: String, val icon: Int, val screen: @Composable () -> Unit) {
    object Home : TabItem("Home", R.drawable.home_subtract, { HScreen() })
    object Profile : TabItem("Community", R.drawable.community_icon_color, { CommunityScreen() })
    object Services : TabItem("Services", R.drawable.services_icon_color, { ServicesScreen() })
    object Events : TabItem("Events", R.drawable.events_icon_color, { EventsScreen() })
    object Clubs : TabItem("Clubs", R.drawable.clubs_icon_color, { ClubsScreen() })
}