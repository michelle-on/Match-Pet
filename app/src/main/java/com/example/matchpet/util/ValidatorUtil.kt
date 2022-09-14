package com.example.matchpet.util

import android.content.Context
import android.util.Patterns

object ValidatorUtil {

    fun userValidator(
        context: Context,
        email: String,
        password: String,
        confirmPassword: String,
        name: String,
        lastName: String
    ): String {
        var errorString: String = " Error"

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches() || email.isEmpty()) {
            errorString = "invalid Email"
        }

        return errorString
    }
}