package com.example.matchpet.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.matchpet.data.model.pet.Pet

@Database(entities = [Pet::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract class AppDatabase : RoomDatabase() {
        companion object {
            fun newInstance(context: Context): AppDatabase {
                return Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "database-pet"
                ).build()
            }
        }

    }
    abstract fun petDao(): PetDao
}