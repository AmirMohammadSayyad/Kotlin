import kotlin.random.Random
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    
    val options = listOf("left hand", "right hand")

    val hiddenHand = options[Random.nextInt(options.size)]

    println("Welcome to the Gol ya Pooch game!")

    println("Which hand do you think the item is in? (left hand / right hand):")
    
    val userGuess = scanner.nextLine()

    if (userGuess.lowercase() == hiddenHand.lowercase()) {
        println("You guessed it right! It was in the $hiddenHand.")
    } else {
        println("Wrong guess! It was actually in the $hiddenHand.")
    }
}