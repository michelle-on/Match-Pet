package com.example.matchpet.screen.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.matchpet.base.mvvm.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    private val repository: RegisterRepository
) : BaseViewModel() {

    val isSuccessful: LiveData<Boolean> = MutableLiveData()

    fun registerUser(email: String, password: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val registerUserWhitFirebase = repository
                .RegisterUserWhitFirebase(email, password)
            isSuccessful.postValue(registerUserWhitFirebase)
        }
    }

}
