package com.example.apollo.reproducer.shared

object Platform {
    fun platformString(): String {
        val greeting = Greeting()
        return "Android ${greeting.greeting()}"
    }
}
