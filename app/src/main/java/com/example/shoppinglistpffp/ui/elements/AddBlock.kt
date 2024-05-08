package com.example.shoppinglistpffp.ui.elements

import android.widget.Toast
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext

@Composable
fun AddBlock(
    addProduct: (String) -> Boolean,
) {
    Row {

        var value by rememberSaveable { mutableStateOf("") }

        val context = LocalContext.current

        TextField(value = value, onValueChange = { value = it })

        Button(onClick = {
            if (value.isBlank()) {
                Toast.makeText(context, "Vacio", Toast.LENGTH_SHORT).show()
            }
            else if (!addProduct(value)) {
                Toast.makeText(context, "Ya existe", Toast.LENGTH_SHORT).show()
            }
            else {
                value = ""
            }



        }) {
            Text(text = "Añadir")
        }
    }
}

