package com.example.instagramclone.ui.views.bottomnavigation

import com.example.instagramclone.R

sealed class BottomNavItem(val route: String, val icon: Int) {
    object Home: BottomNavItem("home", R.drawable.home_icon)
    object Search: BottomNavItem("search", R.drawable.search_icon)
    object Profile: BottomNavItem("profile", R.drawable.profile_icon)

}
