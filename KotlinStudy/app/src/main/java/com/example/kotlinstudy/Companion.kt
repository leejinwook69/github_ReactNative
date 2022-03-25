package com.example.kotlinstudy

class Book private constructor(val id : Int, val name : String)
{

    companion object
    {
        fun create() : Book = Book(0, "animal")
    }
}
