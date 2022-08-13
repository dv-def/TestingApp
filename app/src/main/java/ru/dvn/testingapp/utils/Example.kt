package ru.dvn.testingapp.utils

class Example {
    fun forArray(): Array<String> {
        return arrayOf("user_name1", "user_name2", "user_name3")
    }

    fun forNullable(isNullable: Boolean): Any? {
        return if (isNullable) null else Any()
    }

    data class Same(val number: Int)
}