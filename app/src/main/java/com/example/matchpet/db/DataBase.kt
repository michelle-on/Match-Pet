package com.example.matchpet.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.matchpet.Pet

@Database(entities = arrayOf(Pet::class),
    version = 1,
    exportSchema = false)

abstract class DataBase : RoomDatabase() {
    abstract fun getPetDAO(): PetDao
}