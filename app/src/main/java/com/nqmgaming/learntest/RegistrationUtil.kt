package com.nqmgaming.learntest

object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    /**
     * the input is not valid if...
     * ...the username/password is empty
     * ...the password does not match the confirm password
     * ...the password contains less than 2 digits
     * ...the username is already taken
     */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        return true
    }
}