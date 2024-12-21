package com.example.myprocjectcompose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            modifier = Modifier
                .widthIn(330.dp)
                .heightIn(330.dp)
                .offset { IntOffset(0, -110) },
            painter = painterResource(id = R.drawable.dostavka),
            contentDescription = "image"
        )

        Image(
            modifier = Modifier
                .widthIn(250.dp)
                .heightIn(250.dp)
                .offset { IntOffset(0, -220) },
            painter = painterResource(id = R.drawable.diamond),
            contentDescription = "image"
        )


        Spacer(modifier = Modifier.height(50.dp))
        Image(
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(200.dp)
                .offset { IntOffset(0, 250) },
            painter = painterResource(id = R.drawable.avto),
            contentDescription = "image"

        )
    }

    // Состояния для логина и пароля
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Логин", modifier = Modifier.padding(bottom = 8.dp))

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            placeholder = { Text("Введите логин") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(text = "Пароль", modifier = Modifier.padding(bottom = 8.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            placeholder = { Text("*******") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            trailingIcon = {
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    val icon = if (passwordVisible) {
                        painterResource(id = R.drawable.eye) // Иконка для показа пароля
                    } else {
                        painterResource(id = R.drawable.remove_red_eye) // Иконка для скрытия пароля
                    }
                    Icon(painter = icon, contentDescription = null)
                }
            }

        )
    }
    Box(
        modifier = Modifier
            .fillMaxSize(1f)
            .padding(16.dp),
        contentAlignment = Alignment.BottomEnd
    ) {
        // Красная кнопка внизу
        Button(
            onClick = { /* Обработчик клика для кнопки */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 32.dp),

            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text(text = "Войти", color = Color.White, fontSize = 20.sp)
        }
    }
}

