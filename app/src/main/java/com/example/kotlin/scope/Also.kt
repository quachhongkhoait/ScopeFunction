package com.example.kotlin.scope

data class Person(var name: String = "", var age: Int = 0, var city: String = "")

fun main() {
    Person("Adam", 20, "London").run {
        name = "Nguyen Van C"
        age = 18
        city = "Ha Loi"
        println(this) // Person(name=Nguyen Van C, age=18, city=Ha Loi)
    }

//    val numbers = mutableListOf(
//        "one",
//        "two",
//        "three"
//    ).also { println("The list elements before adding new one: $it") }
//        .add("four")
//    //The list elements before adding new one: [one, two, three]
//

    val numbers = mutableListOf("one", "two", "three")
    val firstAndLast = with(numbers) {
        "The first element is ${first()}," +
                " the last element is ${last()}"
    }
    println(firstAndLast)
    // The first element is one, the last element is three

}


