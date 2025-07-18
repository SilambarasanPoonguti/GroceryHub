package com.silambarasan.croceryhub.domain.product

import com.silambarasan.croceryhub.domain.model.Product

interface ProductRepository {
    suspend fun getProducts(): List<Product>
}