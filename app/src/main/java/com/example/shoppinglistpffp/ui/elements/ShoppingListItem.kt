package com.example.shoppinglistpffp.ui.elements

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun ShoppingListItem(
    name: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    onRemove: () -> Unit
) {
    Row {
        Text(text = name)
        Checkbox(checked = checked, onCheckedChange = onCheckedChange)
        IconButton(onClick = onRemove) {
            Icon(Icons.Filled.Close, contentDescription = "Close")
        }
    }
}