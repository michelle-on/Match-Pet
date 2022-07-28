package com.example.matchpet.base.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class BaseViewModel() : ViewModel(), BaseViewModelContract {

    protected fun <T> LiveData<T>.postValue(data: T) {
        if (this is MutableLiveData<T>) {
            postValue(data)
        }
    }

    protected fun LiveData<Unit>.call() {
        postValue(Unit)
    }
}
