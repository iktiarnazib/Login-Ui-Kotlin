package com.iktiarnazib.loginapplication.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Preview(showBackground = true, showSystemUi = true
)
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    var email = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    var errorMessage = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Welcome back", style = MaterialTheme.typography.headlineMedium)
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
    }
}