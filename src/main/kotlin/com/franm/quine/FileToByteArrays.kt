package com.franm.quine

import java.io.File

fun main() {
    File("C:\\Users\\franm\\dev\\Kotlin-Quine\\src\\main\\kotlin\\com\\franm\\quine\\Quine.kt").forEachLine {
        println(it)
    }
}