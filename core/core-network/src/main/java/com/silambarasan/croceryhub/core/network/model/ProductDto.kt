package com.silambarasan.croceryhub.core.network.model

import com.silambarasan.croceryhub.domain.model.Product

data class ProductDto(
    val id: String,
    val name: String,
    val description: String,
    val imageUrl: String,
    val price: Double,
    val isAvailable: Boolean
) {
    fun toDomain(): Product {
        return Product(
            id = id,
            name = name,
            description = description,
            imageUrl = imageUrl,
            price = price,
            isAvailable = isAvailable
        )
    }
}