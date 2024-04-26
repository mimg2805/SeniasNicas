package com.marcosmiranda.seniasnicas

import androidx.room.Dao
import androidx.room.Query

@Dao
interface LetraDao {
    @Query("SELECT * FROM letra")
    fun getAll(): List<Letra>

    @Query("SELECT * FROM letra WHERE id = :id")
    fun get(id: Int): Letra
}