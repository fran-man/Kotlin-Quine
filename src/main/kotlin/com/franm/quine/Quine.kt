package com.franm.quine

const val dblQuote: Char = '\u0022'
const val comma: Char = '\u002c'
const val space: Char = '\u0020'

fun main() {
    "absssssssssssssssc".toByteArray().forEach {
        println(it)
    }
    val spaceString: String = space.toString()
    val padding = spaceString.repeat(8)
    val fileLines = listOf(
        "package com.franm.quine",
        "",
        "const val dblQuote: Char = '\\u0022'",
        "const val comma: Char = '\\u002c'",
        "const val space: Char = '\\u0020'",
        "",
        "fun main() {",
        "    val fileLines = listOf(",
        "    )",
        "    var lineNumber = 1",
        "    fileLines.forEach {",
        "        if (lineNumber == 9) {",
        "            fileLines.forEach { innerLine ->",
        "                println(dblQuote + innerLine + dblQuote + comma)",
        "            }",
        "        }",
        "        println(it)",
        "        lineNumber++",
        "    }",
        "}"
    )
    var lineNumber = 1
    fileLines.forEach {
        if (lineNumber == 9) {
            fileLines.forEach { innerLine ->
                println(padding + dblQuote + innerLine + dblQuote + comma)
            }
        }
        println(it)
        lineNumber++
    }
}