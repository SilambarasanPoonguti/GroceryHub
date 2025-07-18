package com.silambarasan.groceryhub.data

import com.silambarasan.croceryhub.core.db.dao.ProductDao
import com.silambarasan.croceryhub.core.network.api.ApiService
import com.silambarasan.croceryhub.domain.model.Product
import com.silambarasan.croceryhub.domain.product.ProductRepository

class ProductRepositoryImpl(
    private val api: ApiService,
    private val dao: ProductDao
) : ProductRepository {

    override suspend fun getProducts(): List<Product> {
        val dtos = api.getProducts()
        return dtos.map {
            Product(
                it.id,
                it.name,
                it.description,
                it.imageUrl,
                it.price,
                it.isAvailable
            )
        }
    }
}