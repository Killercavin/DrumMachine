package dev.drummachine.testing

class Totaller(var total: Int = 0) {
    fun add(num: Int): Int {
        total += num
        return total
    }
}

fun main() {
    val totaller = Totaller()
    println(totaller.add(5))
}