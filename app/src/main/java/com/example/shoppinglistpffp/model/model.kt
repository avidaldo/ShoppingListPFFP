package com.example.shoppinglistpffp.model


class Product(val name: String, var checked: Boolean = false)


fun getFakeShoppingProducts() =
    List(30) {Product("Producto $it") }