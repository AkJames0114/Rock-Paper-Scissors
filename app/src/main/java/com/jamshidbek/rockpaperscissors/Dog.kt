package com.jamshidbek.rockpaperscissors

class Dog (val name: String, val breed: String, var age: Int = 2){

    // Executes functions here
    init {
        bark(name)
    }

    fun bark(name: String){
        println("$name says woof woof")
    }
}