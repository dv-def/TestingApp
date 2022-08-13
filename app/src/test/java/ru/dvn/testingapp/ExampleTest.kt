package ru.dvn.testingapp

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import ru.dvn.testingapp.utils.Example

class ExampleTest {
    private lateinit var example: Example

    @Before
    fun init() {
        example = Example()
    }

    @Test
    fun assertArrays_ReturnsTrue() {
        val expected = arrayOf("user_name1", "user_name2", "user_name3")
        val actual = example.forArray()
        assertArrayEquals(expected, actual)
    }

    @Test
    fun assertObjectNull_ReturnTrue() {
        val actual = example.forNullable(true)
        assertNull(actual)
    }

    @Test
    fun assertObjectNotNull_ReturnTrue() {
        val actual = example.forNullable(false)
        assertNotNull(actual)
    }

    @Test
    fun assertSame_ReturnFalse() {
        val s1 = Example.Same(1)
        val s2 = Example.Same(1)
        assertNotSame(s1, s2)
    }
}