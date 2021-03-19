package com.example.kotlin

class Person(var name: String, var age: Int, var address: String, var location: Location?) {
    override
    fun toString(): String {
        return "Name: ${name}, age: ${age}, address: ${address} , location(${location?.lat}, ${location?.long})"
    }
}

data class Location(var lat: String, var long: String)


fun main() {
//    var person = Person("Nguyen Van A", 23, "Quang Nam", Location("lat", "long"))

//    val value = person.let {
//        it.name
//    }
//    println(value)
    // output = Nguyen Van A

//    val value = person.let {
//        it.age != 18
//    }
//    println(value)

//    val value = person.let {
//        it.location?.let { lc ->
//            "lc ${lc.lat}"
//        }
//    }
//    println(value)

//    val value = person.let {
//        it.name = "Tran Van C"
//        "return ${it.name}"
//    }
//    println(value)

//    val numbers = mutableListOf("One", "Two", "Three", "Four", "Five")
//    numbers.map { it.length }.filter { it > 3 }.let { print(it) }
//    // k can tao bien

    // run

//    val person = Person("Nguyen Van A", 23, "BD", null)
//    person.run {
//        name = "Tran Van C"
//        location?.run {
//            lat = "Da Nang"
//            long = "Da aaaa"
//        }
//        toString()
//    }
//    println(person)

//    person = Person("Nguyen Van A", 23, "BD", null)
//    with(person) {
//        this.name = "Tran Van C"
//        location?.lat = "11111"
//        location?.long = "11111"
//    }
//    print(person)

    // apply
//    var person : Person? = Person("Nguyen Van A", 23, "Quang Nam", Location("lat", "long"))
////    var person : Person? = null
//    var a = person?.apply {
//        name = "Tran Van C"
//        address = "Da Nang"
//        location?.apply {
//            lat = "aaaa"
//            long = "bbbbbb"
//        }
//        this.address
//    }
//    print(a)


//    var person = Person("Nguyen Van A", 23, "Quang Nam", Location("lat", "long"))
//    val value = person.apply{
//        name = "Tran Van C"
//        address = "Da Nang"
//        println(this)
//    }
//    println(value)
//    println(person)
//    // output: đều giống nhau là: Name: Tran Van C, age: 23, address: Da Nang

//    var person = Person("Nguyen Van A", 23, "Quang Nam", Location("lat", "long"))
//    val value = person?.also {
//        it.name = "Tran Van C"
//    }
//    println(value)
//    println(person)

//    var str: String? = null
//    str?.run {
//        length
//    }
}


