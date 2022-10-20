package com.payeye.feature_one

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun FeatureOneScreen() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Text(text = stringResource(id = R.string.code_was_))
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = stringResource(id = R.string.code_was_sent_to, "Twoj stary"))
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = stringResource(id = R.string.new_code_info, "20"))
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = stringResource(id = R.string.the_code_was_sent_info, "5", "12"))
    }
}