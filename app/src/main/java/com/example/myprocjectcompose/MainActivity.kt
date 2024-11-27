package com.example.myprocjectcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BoxOne()
        }
    }
}

@Composable
private fun BoxOne() {
    Column (
        modifier = Modifier
            .fillMaxHeight(0.4f)
            .background(color = Color.Gray)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Image(
                modifier = Modifier
                    .widthIn(150.dp)
                    .heightIn(150.dp)
                    .offset { IntOffset(0, 15) },
                painter = painterResource(id = R.drawable.diamond),
                contentDescription = "image"
            )

            Image(
                modifier = Modifier
                    .widthIn(150.dp)
                    .heightIn(150.dp)
                    .offset { IntOffset(0, -10) },
                painter = painterResource(id = R.drawable.dostavka),
                contentDescription = "image"
            )

            Column(modifier = Modifier.width(250.dp).height(250.dp)

                .offset { IntOffset(0, -20) }) {
                Image(
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(250.dp),
                    painter = painterResource(id = R.drawable.avto),
                    contentDescription = "image"

                )

            }


        }
    }
}