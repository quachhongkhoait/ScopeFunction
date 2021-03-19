package com.example.kotlin

class User {
    var name: String = ""
    var age: Int = 0

    override fun toString(): String {
        return "$name $age"
    }
}

fun main() {
    val user = User()
    user.name = "Nguyen Van A"
    user.age = 20
    println(user)

    user.apply {
        name = "Vo Van C"
        age = 21
        println(this)
    }

    user.let {
        it.name = "Do Van B"
        it.age = 22
        println(it)
    }

    user.run {
        name = "La Van D"
        age = 23
        println(this)
    }

    user.also {
        it.name = "Le Van L"
        it.age = 24
        println(it)
    }

    with(user){
        name = "Ho Van V"
        age = 25
        println(this)
    }
}