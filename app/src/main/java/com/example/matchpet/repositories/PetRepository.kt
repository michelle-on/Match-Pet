package com.example.matchpet.repositories

import com.example.matchpet.data.local.AppDataBase
import com.example.matchpet.data.model.pet.Pet
import javax.inject.Inject

class PetRepository @Inject constructor(
    private val appDataBase: AppDataBase
) {

    fun insertPet(pet: Pet): Int {
        var newPet = appDataBase.petDao().insertAll(pet)

        return appDataBase.petDao().getId(pet)
    }
}