package net.kotlinDemo

import kotlin.coroutines.experimental.buildIterator

fun main(args: Array<String>) {
//    val ia: IntArray = intArrayOf(3, 5, 7)
//    var total: Int = 0
//
//    for (n in ia) {
//        total += n
//    }
//    println("Total: $total")

    val ia: IntArray = intArrayOf(120, 30, 15, 27, 66)
    ia.filter { it > 50 }
            .sortedBy { it }
            .map { it / 10 }
            .forEach({ i -> print("$i ") })
}