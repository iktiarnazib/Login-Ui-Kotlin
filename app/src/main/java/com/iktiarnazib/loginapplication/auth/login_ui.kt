package com.iktiarnazib.loginapplication.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iktiarnazib.loginapplication.R

@Preview(showBackground = true, showSystemUi = true
)
@Composable
fun LoginScreen(modifier: Modifier = Modifier, onSignUpClick: () -> Unit = {}) {

    var email = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    var errorMessage = remember { mutableStateOf("") }
    Box(
modifier = Modifier.fillMaxSize(),

    ){
        Image(
            painter = painterResource(id = R.drawable.login_bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
            , alpha = 0.4f

        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.puclogo),
                contentDescription = "Puc logo",
                modifier = Modifier.size(120.dp))

            Text(text = "Welcome back", style = MaterialTheme.typography.headlineLarge)
            Spacer(modifier = Modifier.height(14.dp))
            OutlinedTextField(
                value = email.value,
                onValueChange = {
                    email.value = it
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                label = {Text(text = "Email")},
                shape = RoundedCornerShape(20.dp)
            )

            OutlinedTextField(
                value = password.value,
                onValueChange = {
                    password.value = it
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                label = {Text(text = "Password")},
                shape = RoundedCornerShape(20.dp)

            )


            if(errorMessage.value.isNotEmpty()){
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = errorMessage.value, color = Color.Red)
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    if(email.value.isNotBlank() && password.value.isNotBlank()){
                        errorMessage.value = ""
                    } else {
                        errorMessage.value = "Please fill both textfields"
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Login")
            }

            Spacer(modifier = Modifier.height(20.dp))
            Divider(thickness = 1.5.dp)

            Spacer(modifier= Modifier.height(30.dp))

            Text(text = "Don't have an account?")
            Spacer(modifier= Modifier.height(8.dp))
            Text(text = "Sign up", fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.Blue, modifier = Modifier.clickable{
                onSignUpClick()
            })


        }
    }
}