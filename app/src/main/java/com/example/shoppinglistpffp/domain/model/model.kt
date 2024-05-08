package com.example.shoppinglistpffp.domain.model


data class Product(val name: String, var checked: Boolean = false) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Product) return false
        if (name != other.name) return false

        return true
    }
}