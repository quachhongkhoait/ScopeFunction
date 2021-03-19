package com.example.kotlin.scope

fun main() {
    val message = StringBuilder()
    val numberOfCharacters = message.run {
        append("This is a transformation function.")
        append("It takes a StringBuilder instance and returns the number of characters in the generated String")
        length
    }
    println(numberOfCharacters)
    println(message)

    val message1: String? = "hello there!"
    val charactersInMessage = message1?.run {
        "value was not null: $this"
    } ?: "value was null"

    println(message1)
    println(charactersInMessage)



}