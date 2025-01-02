package com.jamshidbek.rockpaperscissors

fun main(){

    println("Who is this coffee for?")
    var name = readln()

    println("How many spoon of sugar do you want?")
    val sugarCount = readln()

    val sugarCountInt = sugarCount.toInt()
    //Call Function
    makeCoffee(sugarCountInt, name)

}

// Define Function SC
fun makeCoffee(sugarCount:Int, name:String){
    if (sugarCount == 1){
        println("Coffee with $sugarCount spoon of sugar for $name is ready!")
    }else if(sugarCount == 0){
        println("Coffee with no sugar for $name is ready!")
    }else{
        println("Coffee with $sugarCount spoons of sugar for $name is ready!")
    }
}