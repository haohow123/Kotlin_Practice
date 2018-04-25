package net.kotlinDemo

fun main(args: Array<String>) {
//    val x = 3
//    val y = 5
//    val z: Int
//
//    if (x > y) {
//        z = x
//    } else {
//        z = y
//    }
//
//    println("z: $z")
//
//    val v: Int
//    //簡化
//    v = if (x > y) x else y
//    println("v: $v")

//    val grade = 'B'
//    val bonus: Int
//
//    when (grade) {
//        'A' -> bonus = 5000
//        'B' -> bonus = 3000
//        'C' -> bonus = 1000
//        else -> bonus = 50
//    }
//
//    println("bonus: $bonus")
//
//    val bonus2 = when (grade) {
//        'A' -> 5000
//        'B' -> 3000
//        'C' -> 1000
//        else -> 50
//    }
////
//    println("bonus2: $bonus2")

//    var index = 0
//
//    do {
//        print("$index ")
//        index += 3
//    } while (index < 10)

    for (index: Int in 1..5) {
        print("$index ")
    }

    println()

    //step2 => ori +2 +2....
    for (index: Int in 1..5 step 2) {
        print("$index ")
    }

    println()

    for (index: Int in 5 downTo 1) {
        print("$index ")
    }
}