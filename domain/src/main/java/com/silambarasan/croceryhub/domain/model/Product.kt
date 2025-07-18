package com.silambarasan.croceryhub.domain.model

data class Product(
    val id: String,
    val name: String,
    val description: String,
    val imageUrl: String,
    val price: Double,
    val isAvailable: Boolean
)