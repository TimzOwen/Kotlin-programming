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
