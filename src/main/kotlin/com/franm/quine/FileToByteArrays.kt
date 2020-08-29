package com.franm.quine

import java.io.File

fun main() {
    var lineNo = 1
    File("C:\\Users\\franm\\dev\\Kotlin-Quine\\src\\main\\kotlin\\com\\franm\\quine\\QuineSrc.txt").forEachLine {
        print("listOf(")
        it.toByteArray().forEach {
            print(it)
            print(',')
        }
        lineNo++
        println(')')
    }
}