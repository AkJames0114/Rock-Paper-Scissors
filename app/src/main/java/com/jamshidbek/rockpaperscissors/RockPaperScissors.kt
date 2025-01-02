package com.jamshidbek.rockpaperscissors

fun main(){

    var computerChoice = ""
    var playerChoice = ""

    // Ask for the player's choice
    println("Rock, Paper or Scissors? Enter your choice")
    playerChoice = readln().lowercase() //Normalize player input to lowercase

    // Input validation loop
    while (playerChoice !in listOf("rock", "paper", "scissors")) {
        println("Invalid choice. Please enter Rock, Paper, or Scissors.")
        playerChoice = readln().lowercase()  // Ensure the input is normalized to lowercase
    }

    // Generate a random number to determine the computer's choice to lowercase
    val randomNumber = (1..3).random()

    // Assign computer's choices
    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }
    // Display computer's choice
    println(computerChoice)
    
    // Determine the winner!
    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    // Output the results
    if (winner == "Tie"){
        println("It is a Tie!")
    }else{
        println("$winner won!!!")
    }

}
