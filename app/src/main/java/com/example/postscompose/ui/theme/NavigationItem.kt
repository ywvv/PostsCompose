package com.example.postscompose.ui.theme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.postscompose.R

sealed class NavigationItem(
    val titleResId: Int,
    val icon: ImageVector
) {

    object Home : NavigationItem(
        titleResId = R.string.navigation_item_main,
        icon = Icons.Outlined.Home
    )

    object Favourite : NavigationItem(
        titleResId = R.string.navigation_item_favourite,
        icon = Icons.Outlined.FavoriteBorder
    )

    object Profile : NavigationItem(
        titleResId = R.string.navigation_item_profile,
        icon = Icons.Outlined.Person
    )
}