package com.example.kotlinstudy

class Human
{
    fun eatingCake()
    {
        println("This is good")
    }
}

val suqre : (Int) -> (Int) = {number :Int -> number * number}
// 왼항 오른항 중 한곳에는 자료형 선언 해줘야 한다.

fun extendTest(name : String, age : Int) : String
{
    val introduce : String.(Int) -> String = {"my name is ${this}, age is ${it}\nhi"}

    return name.introduce(age)
}

fun main()
{
    val human = Human() // new 필요 없다
    human.eatingCake()

    println(extendTest("jinwook", 26))
}