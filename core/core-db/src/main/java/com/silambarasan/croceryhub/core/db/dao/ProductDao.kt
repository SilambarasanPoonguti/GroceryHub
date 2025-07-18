package com.silambarasan.croceryhub.core.db.dao

@Dao
interface ProductDao {
    @Query("SELECT * FROM products")
    suspend fun getAll(): List<ProductEntity>
}