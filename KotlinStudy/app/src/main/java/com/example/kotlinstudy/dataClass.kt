package com.example.kotlinstudy




data class Ticket(val cpname : String, val name : String, var date : String, var seatNumber : Int)


fun main()
{
    val ticketA = Ticket("koreanair", "jinwook", "20220222", 15)
}
