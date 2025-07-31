package dev.drummachine.testing

class Trying {
    fun stringBuilder(someString: String): String {
        return someString
    }
}

fun main() {
    print("Enter your favourite string: ")
    val inputString: String = readln()
    val trying = Trying()

    println(trying.stringBuilder(inputString))
}