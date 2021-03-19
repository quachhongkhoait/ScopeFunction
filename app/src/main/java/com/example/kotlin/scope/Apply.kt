package com.example.kotlin.scope

fun main() {
    val aStudent = Student().apply {
        studentId = "1234567"
        name = "Mary"
        surname = "Smith"
    }


    val teacher = Teacher()
        .id(1000)
        .name("Martha")
        .surname("Spector")

    println(aStudent)
    println(teacher)
}


data class Teacher(var id: Int = 0, var name: String = "", var surname: String = "") {
    fun id(anId: Int): Teacher = apply { id = anId }
    fun name(aName: String): Teacher = apply { name = aName }
    fun surname(aSurname: String): Teacher = apply { surname = aSurname }
}

data class Student(var studentId: String, var name: String, var surname: String) {
    constructor() : this("", "", "")
}





