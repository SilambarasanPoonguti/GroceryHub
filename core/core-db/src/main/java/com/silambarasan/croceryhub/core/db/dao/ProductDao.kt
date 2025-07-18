package com.silambarasan.croceryhub.core.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.silambarasan.croceryhub.core.db.entity.ProductEntity

@Dao
interface ProductDao {
    @Query("SELECT * FROM products")
    suspend fun getAll(): List<ProductEntity>
}