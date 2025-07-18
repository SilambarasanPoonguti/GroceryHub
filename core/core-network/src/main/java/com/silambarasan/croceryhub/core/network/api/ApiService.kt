package com.silambarasan.croceryhub.core.network.api

import com.silambarasan.croceryhub.core.network.model.ProductDto
import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getProducts(): List<ProductDto>
}