package com.marcosmiranda.seniasnicas

import androidx.room.Dao
import androidx.room.Query

@Dao
interface PalabraDao {
    @Query("SELECT * FROM palabra")
    fun getAll(): List<Palabra>

    @Query("SELECT * FROM palabra WHERE id = :id")
    fun get(id: Int): Palabra

    @Query("SELECT * FROM palabra WHERE categoria = :id")
    fun getByCategoria(id: Int): List<Palabra>
}