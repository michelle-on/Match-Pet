package com.example.matchpet.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.matchpet.db.Pet.PetDao
import com.example.matchpet.model.Pet

@Database(entities = [Pet::class],
    version = 1,
    exportSchema = false)

abstract class DataBase : RoomDatabase() {
    abstract fun getPetDAO(): PetDao
}