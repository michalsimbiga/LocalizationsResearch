package com.payeye.feature_two

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource

@Composable
fun FeatureTwoScreen() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        val array = stringArrayResource(id = com.payeye.core.R.array.planets_array)

        Text(stringResource(id = R.string.beautifull_planets))
        array.forEach { planet ->
            Text(text = planet)
        }
    }
}