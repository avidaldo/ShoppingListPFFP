package com.example.shoppinglistpffp.ui.elements

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@Composable
fun AddBlock(
    addProduct: (String) -> Unit,
) {
    Row {

        var value by rememberSaveable { mutableStateOf("") }

        TextField(value = value, onValueChange = { value = it })
        Button(onClick = {
            addProduct(value)
            value = ""
        }) {
            Text(text = "Añadir")
        }
    }
}