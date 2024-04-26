package com.marcosmiranda.seniasnicas

import androidx.room.Dao
import androidx.room.Query

@Dao
interface CategoriaDao {
    @Query("SELECT * FROM categoria")
    fun getAll(): List<Categoria>

    @Query("SELECT * FROM categoria WHERE id = :id")
    fun get(id: Int): Categoria
}