package com.example.matchpet.screen.registerpet

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.matchpet.base.mvvm.BaseViewModel
import com.example.matchpet.data.model.pet.Pet
import com.example.matchpet.repositories.PetRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterPetViewModel @Inject constructor(
    private val repository: PetRepository
) : BaseViewModel() {

    val petId: LiveData<Int> = MutableLiveData()

    fun insertPet(pet: Pet) {
        viewModelScope.launch(Dispatchers.IO) {
            val pet = repository.insertPet(pet)
            petId.postValue(pet)
        }
    }

}
