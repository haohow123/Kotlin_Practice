package net.kotlinDemo

// 宣告類別時加open，代表此類別可以被繼承
// (var name: String)是一個字串參數的主要建構式（primary constructor）
open class Person(var name: String) {

    //一個可以改變的屬性
    var gender: Char = 'U'
    //一個不可以改變的屬性
    val information: String
    //為information加入getter方法
        get() = "$name(${if (gender == 'M') "Male" else "Female"})"

    // 其它建構式，使用this(name)呼叫主要建構式
    constructor(name: String, gender: Char) : this(name) {
        this.gender = gender
    }

    //function
    fun sayGreeting() {
        println("Hello, $name!!")
    }

    open fun printInformation() {
        println("Name: $name")
        println("Gender: $gender")
    }
}


// 宣告Employee類別，沒有使用open，表示這個類別不可以被繼承
// (name: String)是一個字串參數的主要建構式（primary constructor）
// 使用Person(name)呼教父類別的建構式
class Employee(name: String) : Person(name) {

    var salary: Double = 0.0

    // 其它建構式，使用this(name)呼叫主要建構式
    constructor(name: String, gender: Char, salary: Double) : this(name) {
        super.gender = gender
        this.salary = salary
    }

    override fun printInformation() {
        super.printInformation()
        println("Salary: $salary")
    }
}

fun main(args: Array<String>) {
    //呼叫主要建構式
    val lin: Person = Person("Kotlin")
    //call function
    lin.sayGreeting()
    //設定屬性
    lin.gender = 'M'
    //使用屬性
    println(lin.information)

    println()

    val mary = Person("Mary", 'F')
    mary.sayGreeting()
    println("${mary.name}'s gender is ${mary.gender}")
    mary.printInformation()

    println()

    val henry= Employee("Henry",'M',42000.0)
    henry.printInformation()
}