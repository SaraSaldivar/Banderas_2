package com.example.banderas_2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MexicoBandera(modifier: Modifier = Modifier){
    Row(modifier= modifier){
        Box (modifier=Modifier
            .weight(1f)
            .fillMaxHeight()
            .background(Color(0xFF006847))
        )
        Box(modifier=Modifier
            .weight(1f)
            .fillMaxHeight()
            .background(Color.White)
        )
        Box(modifier= Modifier
            .weight(1f)
            .fillMaxHeight()
            .background(Color(0xFFCE1126))
        )
    }
}

@Composable
fun MostrarBanderaMX(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ){
        MexicoBandera(
            modifier = Modifier
                .size(width = 300.dp, height = 200.dp)
        )
    }
}