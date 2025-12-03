package com.example.chordy.navigation

import androidx.annotation.DrawableRes
import com.example.chordy.R

sealed class BottomNavItem(
    val route: String,
    val title: String,
    @DrawableRes val icon: Int
) {
    data object Home : BottomNavItem("home", "Home", R.drawable.ic_home)
    data object Progress : BottomNavItem("progress", "Progress", R.drawable.ic_progress)
}
