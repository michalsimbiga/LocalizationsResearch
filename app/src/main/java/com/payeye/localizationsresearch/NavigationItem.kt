package com.payeye.localizationsresearch

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Warning
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationItem(var route: String, var icon: ImageVector, var title: String) {
    object FeatureOne : NavigationItem("featureOne", Icons.Default.Favorite, "One")
    object FeatureTwo : NavigationItem("featureTwo", Icons.Default.Warning, "Two")
    object FeatureThree : NavigationItem("featureThree", Icons.Default.Add, "Three")
}