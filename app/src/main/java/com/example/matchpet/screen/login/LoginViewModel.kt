package com.example.matchpet.screen.login

import androidx.lifecycle.viewModelScope
import com.example.matchpet.base.mvvm.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginRepository: LoginRepository
) : BaseViewModel() {

    fun SignInWhitGoogle() {
        viewModelScope.launch(Dispatchers.IO) {
//            val signInWhitGoogle = loginRepository.SignInWhitGoogle()
        }
    }

}
