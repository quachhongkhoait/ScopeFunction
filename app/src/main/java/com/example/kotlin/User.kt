package com.example.kotlin

data class User1(val id: Int, val name : String) {
    constructor(id: Int) : this(id, ""){
    }
    constructor() : this(0,"")
}

data class User11(val name: String, val age: Int)
{
    constructor(name1: String): this(name1, -1) {
    }

    constructor(age: Int): this("Anon", age) {
    }
}