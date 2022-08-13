package ru.dvn.testingapp

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import ru.dvn.testingapp.utils.EmailValidator

class EmailValidatorTest {
    private lateinit var emailValidator: EmailValidator

    @Before
    fun init() {
        emailValidator = EmailValidator()
    }

    @Test
    fun correctEmail_ReturnsTrue() {
        assertTrue(emailValidator.isValid("username@gmail.com"))
    }

    @Test
    fun correctEmailSubdomains_ReturnsTrue() {
        assertTrue(emailValidator.isValid("username@email.bk.ru"))
    }

    @Test
    fun invalidEmail_ReturnsFalse() {
        assertFalse(emailValidator.isValid("username@gmail"))
    }

    @Test
    fun invalidEmailWithDoubleDot_ReturnsFalse() {
        assertFalse(emailValidator.isValid("username@gmail..com"))
    }

    @Test
    fun invalidEmailWithoutUsername_ReturnsFalse() {
        assertFalse(emailValidator.isValid("@gmail.com"))
    }

    @Test
    fun emptyEmail_ReturnsFalse() {
        assertFalse(emailValidator.isValid(""))
    }

    @Test
    fun blankEmail_ReturnFalse() {
        assertFalse(emailValidator.isValid("     "))
    }

    @Test
    fun nullEmail_ReturnsFalse() {
        assertFalse(emailValidator.isValid(null))
    }

}