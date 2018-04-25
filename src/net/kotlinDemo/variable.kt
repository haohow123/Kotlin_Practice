package net.kotlinDemo

fun main(args: Array<String>) {
//    val x: Int = 3  //val不可變動
//    val y = 5       //不指定型態
//    val z: Int      //變數一定要給初始或型態
//    z = 7           //初始化後就不可改變
//
//    println("x: " + x)
//    println("y: " + y)
//    println("z: " + z)

//    以下會造成編譯錯誤
//    x = 13
//    y = 15
//    z = 17

//    var v: Int = 3 //var可變動
//    println("v1: " + v)
//    v = 133
//    println("v2: " + v)


    println(getGreeting("Hello", "Kotlin"))
    println(getGreetingShort("Hello", "Kotlin"))
    sayGreeting("Hello", "Kotlin")
    sayGreetingN("Hello", "Kotlin")
}

//一般寫法
fun getGreeting(greet: String, name: String): String {
    return "$greet ,  $name !!!"
}

//如只有一句return
fun getGreetingShort(greet: String, name: String): String = greet + " , " + "Short " + name + "!!!"

//不回傳用Unit
fun sayGreeting(greet: String, name: String): Unit {
    println(greet + " , " + name + "!!!")
}

//不回傳也可直接不寫
fun sayGreetingN(greet: String, name: String) = println(greet + " , " + "Short" + name + "!!!")
