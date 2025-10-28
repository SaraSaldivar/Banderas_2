package com.example.banderas_2

import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MexicoBandera(modifier: Modifier = Modifier){
    Box(modifier= modifier){
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
        Image(
            painter = painterResource(id = R.drawable.escudomexico),
            contentDescription = "escudo",
            modifier=Modifier.align(Alignment.Center).size(80.dp)

        )
    }
}

@Preview
@Composable
fun MostrarBanderaMX(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.Center
    ){
        MexicoBandera(
            modifier = Modifier
                .size(width = 300.dp, height = 200.dp)
        )
    }
}