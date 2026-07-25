package com.iktiarnazib.classapplication.jetpackCompose

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextExample(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        color = Color.Blue,
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Monospace,
        letterSpacing = 10.sp,
        textAlign = TextAlign.End,
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextFieldExample() {
    var name = remember { mutableStateOf("") }
    TextField(
        value = name.value,
        onValueChange = { name.value = it },
        label = { Text("Enter you rname") },
        leadingIcon = {Text("*")},
        trailingIcon = {Text("#")},
        singleLine = true,
        shape = RoundedCornerShape(5.dp)
    )
}