package com.payeye.localizationsresearch

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.payeye.feature_one.FeatureOneScreen
import com.payeye.feature_three.FeatureThreeScreen
import com.payeye.feature_two.FeatureTwoScreen
import com.payeye.localizationsresearch.ui.theme.LocalizationsResearchTheme

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    LocalizationsResearchTheme {
        Scaffold(
            bottomBar = { BottomNav(navController = navController) }
        ) {
            NavigationGraph(navController = navController)
        }
    }
}

@Composable
fun BottomNav(navController: NavController) {
    val bottomItems = listOf(
        NavigationItem.FeatureOne,
        NavigationItem.FeatureTwo,
        NavigationItem.FeatureThree,
    )
    BottomNavigation(
        backgroundColor = colorResource(id = R.color.teal_200),
        contentColor = Color.Black
    ) {

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        bottomItems.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = rememberVectorPainter(image = item.icon),
                        contentDescription = item.title
                    )
                },
                label = { Text(text = item.title) },
                selectedContentColor = White,
                unselectedContentColor = White.copy(0.4f),
                alwaysShowLabel = true,
                selected = item.route == currentRoute,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { screen_route ->
                            popUpTo(screen_route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }

    }
}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        modifier = Modifier.fillMaxSize(),
        navController = navController,
        startDestination = NavigationItem.FeatureOne.route
    ) {
        composable(NavigationItem.FeatureOne.route) { FeatureOneScreen() }
        composable(NavigationItem.FeatureTwo.route) { FeatureTwoScreen() }
        composable(NavigationItem.FeatureThree.route) { FeatureThreeScreen() }
    }
}

@Composable
@Preview
fun MainScreenPreview() {
    MainScreen()
}