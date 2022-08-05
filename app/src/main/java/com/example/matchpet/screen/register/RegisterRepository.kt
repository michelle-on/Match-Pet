package com.example.matchpet.screen.register

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import javax.inject.Inject

class RegisterRepository @Inject constructor() {
    private var successful: Boolean = false

    fun RegisterUserWhitFirebase(email: String, password: String): Boolean {
        Firebase.auth.createUserWithEmailAndPassword(email, password)
            .addOnSuccessListener {
                successful = true
            }
            .addOnFailureListener {
                successful = false
                Log.d(TAG, it.message.toString())
            }
        return successful
    }
}
