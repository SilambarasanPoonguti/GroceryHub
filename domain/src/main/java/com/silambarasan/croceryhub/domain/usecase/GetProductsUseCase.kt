package com.silambarasan.croceryhub.domain.usecase

import com.silambarasan.croceryhub.domain.product.ProductRepository

class GetProductsUseCase(private val repository: ProductRepository) {
    suspend operator fun invoke() = repository.getProducts()
}