package com.example.calculator

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol : String,
    modifier: Modifier,
    onClick : () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier // if we take the modifier passed as an arguemnt then the changes
            .clip(CircleShape) // will b applied aftr tht mdfr(the one which is passed externally) is applied
            .clickable { onClick() } // eg clipping will happen after the modifier is passed
            .then(modifier) // this way we applied our modifier at the end
    )
    {
        Text(
            text = symbol,
            color = Color.White,
            fontSize = 36.sp
        )

    }
}