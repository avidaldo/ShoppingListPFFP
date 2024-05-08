package com.example.shoppinglistpffp.domain

import com.example.shoppinglistpffp.domain.model.Product

fun getFakeShoppingProducts() =
    List(10) { Product("Producto $it") }