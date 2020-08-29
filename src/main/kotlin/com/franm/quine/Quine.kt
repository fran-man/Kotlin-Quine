package com.franm.quine

fun main() {
    val line1 = listOf(112,97,99,107,97,103,101,32,99,111,109,46,102,114,97,110,109,46,113,117,105,110,101)
    val line2 = emptyList<Int>()
    val line3 = listOf(102,117,110,32,109,97,105,110,40,41,32,123)
    val line4 = listOf(32,32,32,32,118,97,108,32,102,105,108,101,76,105,110,101,115,32,61,32,108,105,115,116,79,102,40)
    val line5 = listOf(32,32,32,32,32,32,32,32,34,49,34)
    val line6 = listOf(32,32,32,32,41)
    val line7 = listOf(32,32,32,32,118,97,114,32,108,105,110,101,78,117,109,98,101,114,32,61,32,49)
    val line8 = listOf(32,32,32,32,102,105,108,101,76,105,110,101,115,46,102,111,114,69,97,99,104,32,123)
    val line9 = listOf(32,32,32,32,32,32,32,32,112,114,105,110,116,108,110,40,105,116,41)
    val line10 = listOf(32,32,32,32,32,32,32,32,108,105,110,101,78,117,109,98,101,114,43,43)
    val line11 = listOf(32,32,32,32,125)
    val line12 = listOf(125)
    val fileLines = listOf(
        line1,
        line2,
        line3,
        line4,
        line5,
        line6,
        line7,
        line8,
        line9,
        line10,
        line11,
        line12
    )
    var lineNumber = 1
    fileLines.forEach {
        it.map {char ->
            char.toByte().toChar()
        }.forEach {char ->
            print(char)
        }
        println()
        lineNumber++
    }
}