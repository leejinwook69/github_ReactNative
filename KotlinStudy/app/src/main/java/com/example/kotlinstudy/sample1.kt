package com.example.kotlinstudy

fun main() {
//    helloworld();
//
//    println(add(4, 5))
//
//    val name : String = "Lee"
//    val name2 = "JinWook"
//
//    println("my name is ${name + name2}, im 26")

    forAndWhile()
}

fun helloworld() : Unit {
    println("Hello World!");
}

fun add(a: Int, b : Int) : Int {
    return a+b;
}

fun hi() : Unit {
    val a : Int = 10

    var b : Int = 9

    b = 100

    val c = 100
    var d = 100

    var name : String = "Lee"
}

fun maxBy(a:Int, b:Int) : Int
{
    if(a>b)
    {
        return a
    }else
    {
        return b
    }
}

fun maxBy2(a : Int, b : Int) : Int = if(a>b) a else b

fun checkNum(score : Int)
{
    when(score)
    {
        0 -> println("0")
        else -> println("else")
    }
}

fun array() {
    val array : Array<Int> = arrayOf(1, 2, 3)
    val list : List<Int> = listOf(1, 2, 3)

    val array2 : Array<Any> = arrayOf(1, "d", 3.14)
    val list2 : List<Any> = listOf(1, "d", 3.14)
    val arrayList : ArrayList<Int>
}

fun forAndWhile()
{
    val students : ArrayList<String> = arrayListOf("joyce", "james", "jenny", "jennifer")

    for (name : String in students)
    {
        println("${name}")
    }
}