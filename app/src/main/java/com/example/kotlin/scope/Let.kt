package com.example.kotlin.scope

fun main() {

    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val resultList = numbers.map { it.length }.filter { it > 3 }
    println(resultList) // [5, 4, 4]

    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)  // [5, 4, 4]
    }


    //region ex1
    val stringBuilder = StringBuilder()
    val numberOfCharacters = stringBuilder.let {
        it.append("This is a transformation function. ")
        it.append("It takes a StringBuilder instance and returns the number of characters in the generated String")
        it.length
    }
    println(numberOfCharacters)
    println(stringBuilder)
    //endregion ex1
    //region ex2
    val message: String? = "hello there!"
    val charactersInMessage = message?.let {
        "value was not null: $it"
    } ?: "value was null"
    println(charactersInMessage)
    //endregion ex2

}