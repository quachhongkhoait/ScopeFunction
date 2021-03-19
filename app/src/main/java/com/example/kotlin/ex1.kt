package com.example.kotlin

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {
//    miniMaxSum(arrayOf(256741038, 623958417, 467905213, 714532089, 938071625))
//    staircase(6)
//    print(birthdayCakeCandles(arrayOf(1, 2, 3, 4, 5, 6, 5, 6, 6)))
//    println(timeConversion("12:40:22AM"))
    gradingStudents(
        arrayOf(
            44,
            84,
            94,
            21,
            0,
            18,
            100,
            18,
            62,
            30,
            61,
            53
            )
    ).forEach { print("$it ") }
}

fun gradingStudents(grades: Array<Int>): Array<Int> {
    var newlist = mutableListOf<Int>()
    grades.forEach {
        if (it in 38..99) {
            var numlast = it.toString().substring(1, it.toString().length).toInt()
            if (numlast > 5) {
                if (10 - numlast < 3) {
                    var new = it.toString().replace(numlast.toString(), "0").toInt().plus(10)
                    newlist.add(new)
                } else {
                    newlist.add(it)
                }
            } else {
                if (5 - numlast < 3) {
                    var new = it.toString().replace(numlast.toString(), "5").toInt()
                    newlist.add(new)
                } else {
                    newlist.add(it)
                }
            }
        } else {
            newlist.add(it)
        }
    }
    return newlist.toTypedArray()
}

fun timeConversion(s: String): String {
    val str = s.substring(s.length - 2, s.length)
    var result = ""
    val time = s.split(":")[0]
    if (str.equals("PM")) {
        result = s.replace("PM", "").replace(time, "")
        if (time.toInt() == 12) {
            result = time + result
        } else {
            result = "${time.toInt() + 12}" + result
        }

    } else {
        result = s.replace("AM", "")
        if (time.toInt() == 12) {
            result = result.replace(time, "00")
        }
    }
    return result
}


fun birthdayCakeCandles(candles: Array<Int>): Int {
    var max = candles.max()
    var count = 0;
    for (i in 0..candles.size - 1) {
        if (candles[i] == max) {
            count++
        }
    }
    return count
}

//    return candles.count {
//        it == candles.max()
//    }

//fun staircase(n: Int): Unit {
//    for (i in 0..n - 1) {
//        for (j in 0..n - 2 - i) {
//            print(" ")
//        }
//        for (k in 0..i) {
//            print("#")
//        }
//        println()
//    }
//}

fun staircase(n: Int): Unit {
    for (i in 0..n - 1) {
        var a = n - 1 - i
        for (j in 0..n - 1) {
            if (j < a) {
                print(" ")
            } else {
                print("#")
            }
        }
        println()
    }
}

fun miniMaxSum(arr: Array<Int>): Unit {
    arr.sort()
    var min: Long = 0
    var max: Long = 0
    for (i in 0..3) {
        min += arr[i]
        print("${arr[i]} - ")
    }
    println()
    arr.sortDescending()
    for (i in 0..3) {
        max += arr[i]
        print("${arr[i]} - ")
    }
    println()
    print("$min $max")
}
