package com.example.apollo.reproducer.shared

import com.apollographql.apollo.api.ApolloExperimental
import com.apollographql.apollo.api.Input

object Platform {

    @ApolloExperimental
    fun platformString(): String {
        val input = Input.absent<Int>()
        val greeting = Greeting()
        return "iOS ${greeting.greeting()}"
    }
}
