package com.example.banderas_2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MexicoBandera(modifier: Modifier = Modifier){
    Row(modifier= modifier){
        Box (modifier=Modifier
            .weight(1f)
            .fillMaxHeight()
            .background(Color(0xFF006847))
        )
    }
}