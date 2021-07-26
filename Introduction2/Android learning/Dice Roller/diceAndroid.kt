// Dice roller with random numbers

fun main()
{
    val diceRange = 1..6
    val randomNumber = diceRange.random()
    println("you have rolled ${randomNumber} from range of 1 to 6")
}
