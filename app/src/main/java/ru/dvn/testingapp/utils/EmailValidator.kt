package ru.dvn.testingapp.utils

import android.util.Patterns

class EmailValidator  {
    private val pattern = Patterns.EMAIL_ADDRESS

    fun isValid(email: CharSequence?): Boolean {
        return !email.isNullOrBlank() && pattern.matcher(email).matches()
    }
}