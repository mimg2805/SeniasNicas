package com.marcosmiranda.seniasnicas

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Categoria (
    @PrimaryKey val id: Int,
    val nombre: String
)