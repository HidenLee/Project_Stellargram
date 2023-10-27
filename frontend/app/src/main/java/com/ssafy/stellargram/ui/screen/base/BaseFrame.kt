package com.ssafy.stellargram.ui.screen.base

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BaseFrame(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title= { Text(text = "title") },
                modifier = Modifier
            )
        },
        bottomBar = {  }
    ) {
        Box(modifier = Modifier.padding(it)) {
            Text(text = "")
        }
    }
}