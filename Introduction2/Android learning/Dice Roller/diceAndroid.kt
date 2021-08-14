// Dice roller with random numbers

fun main()
{
    val diceRange = 1..6
    val randomNumber = diceRange.random()
    println("you have rolled ${randomNumber} from range of 1 to 6")
}



// Android  Dice Roller 
// Dice roller with random numbers

fun main()
{
    val diceRange = 1..6
    val randomNumber = diceRange.random()
    println("you have rolled ${randomNumber} from range of 1 to 6")
}



// classes and Dice Rolling 

// Dice Class Roller
class Dice{
    var sides = 6
}

fun main()
{
   val firstDice = Dice()
   println(firstDice.sides)
  
}


// Rolling with dice calles and function

// Dice Class Roller
class Dice{
    fun rollDice(){
        val roll = (1..6).random()
        println(roll)
    }
}

fun main()
{
   val firstDice = Dice()
   firstDice.rollDice()
  
}



// Rolling with Return types from function

// Return types  Kotlin 
// 
// Dice Class Roller
class Dice{
    fun rollDice(): Int {
        val roll = (1..6).random()
        return roll
    }
}

fun main()
{
   val firstDice = Dice()
   val rolled = firstDice.rollDice()
   println("You have just rolled ${rolled}")
  
}



// Rolling with unspecified sided 
// updating sides of a roller in the main function
// Dice Class Roller
class Dice{
    var sides = 6
    fun rollDice(): Int {
        val roll = (1..sides).random()
        return roll
    }
}

fun main()
{
   val firstDice = Dice()
   val rolled = firstDice.rollDice()
   println("Your ${firstDice.sides} sided dice just rolled ${rolled}")
   
   firstDice.sides = 20
    
   println("Your ${firstDice.sides} sided dice just rolled ${firstDice.rollDice()}")
  
}
// output
Your 6 sided dice just rolled 5
Your 20 sided dice just rolled 19




// Class parameter To be rolled:

class Dice(val numSides : Int ){
    fun rollDice(): Int {
        val roll = (1..numSides).random()
        return roll
    }
}

fun main()
{
   val firstDice = Dice(20)
   val rolled = firstDice.rollDice()
   println("Your ${firstDice.numSides} sided dice just rolled ${rolled}")
}



// Class Instnace  (2)

class Dice(val numSides : Int ){
    fun rollDice(): Int {
        val roll = (1..numSides).random()
        return roll
    }
}

fun main()
{
   val firstDice = Dice(20)
   val rolled = firstDice.rollDice()
   println("Your ${firstDice.numSides} sided dice just rolled ${rolled}")
   
   val diceTwo = Dice(6)
   val dice2Roll = diceTwo.rollDice()
   println("Your ${diceTwo.numSides} sided dice just rolled ${dice2Roll}")
}
// output
Your 20 sided dice just rolled 10
Your 6 sided dice just rolled 1



// Simplifying the Code

class Dice(val numSides : Int ){
    fun rollDice(): Int {
        return (1..numSides).random()
    }
}

fun main()
{
   val firstDice = Dice(20)
   println("Your ${firstDice.numSides} sided dice just rolled ${firstDice.rollDice()}")
   
   val diceTwo = Dice(6)
   println("Your ${diceTwo.numSides} sided dice just rolled ${diceTwo.rollDice()}")
}
//output
Your 20 sided dice just rolled 3
Your 6 sided dice just rolled 1





// CHALLENGE 
// create Coin class and have different colors and sides. (challenge)

fun main() {
    val dice = Dice(12, "Blue")
    println("${dice.numSides} sided ${dice.color} dice Rolled ${dice.roll()}")
    val dice2 = Dice(120, "Red")
    println("your ${dice2.numSides} sided ${dice2.color} dice rolled ${dice2.roll()}")
    val coin = Coin()
    println("The first flip is ${coin.flip()}")
    val coinRoll = CoinRoll()
    println("Coind rolled: ${coinRoll.flip()}")
}
class Dice(val numSides : Int, val color : String){
    fun roll() : Int {
        return (1..numSides).random()
    }
}
class Coin(){
    fun flip() : Int {
        return (1..2).random()
    }
}
class CoinRoll(){
    fun flip() : String{
        val head = ("Heads")
        val tail = ("Tails")
        return listOf(head, tail).random()
    }
}



// simplifed version of the challenge on Dice challenge Kotlin basic
fun main() = println("The flidded side is ${Coin().flip()}")

class Coin {
    fun flip() = listOf("Heads","Tail").random()
}
