package com.example.shoppinglistpffp.ui.state

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.shoppinglistpffp.model.Product

class SLViewModel: ViewModel() {
    private var _list = mutableStateListOf<Product>()
    val list: List<Product> get() = _list


    fun remove(product: Product){
        _list.remove(product)
    }

    fun changeChecked(product: Product) {
        product.checked = !product.checked
    }

    fun addProduct(name: String) {
        _list.add(Product(name))
    }

}