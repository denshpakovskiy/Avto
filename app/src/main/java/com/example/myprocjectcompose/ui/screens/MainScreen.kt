package com.example.myprocjectcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.example.myprocjectcompose.R

@Composable
fun MainScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(color = Color.White)
            .padding(top = 30.dp),
        contentAlignment = Alignment.TopCenter
    ) {
            Image(
                modifier = Modifier.widthIn(150.dp).heightIn(150.dp).offset { IntOffset(0, 15) },
                painter = painterResource(id = R.drawable.diamond),
                contentDescription = "image"
            )

            Image(
                modifier = Modifier.widthIn(150.dp).heightIn(150.dp).offset { IntOffset(0, -10) },
                painter = painterResource(id = R.drawable.dostavka),
                contentDescription = "image"
            )

            Column(modifier =
                Modifier
                    .width(250.dp)
                    .height(250.dp)
                    ) {
                Spacer(modifier = Modifier.height(50.dp))
                Image(
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.size(250.dp)
                        .offset { IntOffset(0, -20) }
                    ,
                    painter = painterResource(id = R.drawable.avto),
                    contentDescription = "image"

                )
            }

    }
}