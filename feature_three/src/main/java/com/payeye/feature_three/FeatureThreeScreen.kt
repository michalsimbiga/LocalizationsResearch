package com.payeye.feature_three

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import com.payeye.core.R

@Composable
fun FeatureThreeScreen() {
    LazyColumn(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        item {
            Text(stringResource(id = R.string.who_sings_this_song))
        }

        items(100) { count ->
            Text(
                text = LocalContext.current.resources.getQuantityString(
                    R.plurals.numberOfSongsAvailable, count, count
                )
            )
        }
    }
}