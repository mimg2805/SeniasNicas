package com.marcosmiranda.seniasnicas

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Letra::class, Categoria::class, Palabra::class], version = 1)
abstract class Database: RoomDatabase() {
    abstract fun letraDao(): LetraDao
    abstract fun categoriaDao(): CategoriaDao
    abstract fun palabraDao(): PalabraDao
}