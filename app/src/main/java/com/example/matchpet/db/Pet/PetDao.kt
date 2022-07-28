package com.example.matchpet.db.Pet

import androidx.room.*
import com.example.matchpet.model.Pet

@Dao
interface PetDao {

    @Query("select * from pet")
    fun getAll(): List<Pet>

    @Query("select * from pet where id in (:petIds)")
    fun loadAllByIds(petIds: IntArray): List<Pet>

    @Query("select * from pet where type like :petType")
    fun loadAllByType(petType: String): List<Pet>

    @Query("select * from pet where name like :name")
    fun findByName(name: String): Pet

    @Insert
    fun insertAll(vararg pets: Pet)

    @Delete
    fun delete(pet: Pet)

    @Update
    fun update(pet: Pet)
}