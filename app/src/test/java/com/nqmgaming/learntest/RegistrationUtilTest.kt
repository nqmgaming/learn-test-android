package com.nqmgaming.learntest

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `valid username and correctly repeated password return true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Minh",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username is already exists return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Carl",
            password = "123",
            confirmPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password empty return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Minh",
            password = "",
            confirmPassword = ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password not match return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Minh",
            password = "123",
            confirmPassword = "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contain less than 2 digits return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Minh",
            password = "abc",
            confirmPassword = "abc"
        )
        assertThat(result).isFalse()
    }
}