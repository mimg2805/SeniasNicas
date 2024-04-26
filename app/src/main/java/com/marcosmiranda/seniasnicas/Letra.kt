package com.marcosmiranda.seniasnicas

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Letra (
    @PrimaryKey val id: Int,
    val texto: String,
)