package com.example.shoppinglistpffp.ui.elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.shoppinglistpffp.ui.state.SLViewModel

@Composable
fun MainScreen() {
    val vm: SLViewModel = viewModel()

    Column {
        AddBlock(addProduct = {
            vm.add(it)
        })
        LazyColumn {
            items(items = vm.list){ product ->
                ShoppingListItem(
                    name = product.name,
                    checked = product.checked,
                    onCheckedChange = {
                       /* vm.changeChecked(product)*/
                    },
                    onRemove = {
                        vm.remove(product) }
                )
            }
        }


    }


}

