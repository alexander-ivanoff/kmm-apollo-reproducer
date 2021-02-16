package com.example.apollo.reproducer.shared

import GetRandomQuery


class Greeting {
    fun greeting(): String {
        return GetRandomQuery::class.simpleName ?: "Hello"
    }
}
