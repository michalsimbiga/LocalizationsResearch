package com.payeye.feature_three

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import com.payeye.core.R

@Composable
fun FeatureThreeScreen() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {

        repeat(30){ index ->
            Text(text = LocalContext.current.resources.getQuantityString(
                R.plurals.numberOfSongsAvailable, index, index))
        }
    }
}