package com.example.shoppinglistpffp.ui.state

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.shoppinglistpffp.domain.model.Product

class SLViewModel : ViewModel() {
    private var _list by mutableStateOf(mutableSetOf<Product>())  // (1)
    val list get()= _list.toList()

/*  private var _list = getFakeShoppingProducts().toMutableStateList()

    //private var _list = mutableStateListOf<Product>()
    val list get() = _list.toList()  */


    fun remove(product: Product) {
        _list.remove(product)
    }

    fun changeChecked(product: Product) {
        _list.toMutableList()[_list.indexOf(product)] =
            product.copy(checked = !product.checked)
    }

    fun add(name: String) {
        _list
    }
}