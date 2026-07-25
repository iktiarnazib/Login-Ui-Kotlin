package com.iktiarnazib.classapplication.jetpackCompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Composable
private fun RowExample() {
    Row (
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ){ Text(text = "Apple", fontSize = 30.sp);
        Text(text = "Banana",  fontSize = 30.sp);
        Text(text = "Mango",  fontSize = 30.sp); }

}

//column
@Composable
private fun ColumnExample() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Apple", fontSize = 30.sp);
        Text(text = "Banana",  fontSize = 30.sp);
        Text(text = "Mango",  fontSize = 30.sp);
    }
}


//column
@Preview(showBackground = true, showSystemUi = true)
@Preview
@Composable
private fun ColumnLoginExample() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Login Here", fontSize = 30.sp);

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Enter your name") }
        )

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Enter your password") }
        )
    }

}