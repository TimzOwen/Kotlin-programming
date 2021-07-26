

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





// intermediate inheritance and calculations 

// Base classes 

    // simulating classes with residence compunds and house made off

    fun main() {
        // create instance of square cabin
        val squareCabin = SquareCabin(6)
        println("\nSquare Cabin\n============")
        println("Capacity: ${squareCabin.capacity}")
        println("Material: ${squareCabin.buildingMaterial}")
        println("Has room? ${squareCabin.hasRoom()}")

    }

    // abstract class and function to check if there are free rooms
    abstract class Dwelling(private var residents: Int) {
        abstract val buildingMaterial: String
        abstract val capacity: Int

        fun hasRoom(): Boolean {
           return residents < capacity
       }
    }

    // class square cabin (extending from dwelling class) 
    //rem to place the number of parameters also inside from parent class
    //you can change the value from being fxed by reusing the declared var
    class SquareCabin(residents : Int) : Dwelling(residents){
        override val buildingMaterial = "wood"
        override val capacity = 60
    }

// out put 
Square Cabin
============
Capacity: 60
Material: wood
Has room? true



    // WITH (reduce repetitive code)

	// Switching to using "With"

    fun main() {
        // create instance of square cabin
        val squareCabin = SquareCabin(4)
        with(squareCabin){
            println("\nSquare Cabin\n============")
        	println("Capacity: ${capacity}")
        	println("Material: ${buildingMaterial}")
        	println("Has room? ${hasRoom()}")
            
        }
    }

    // abstract class and function to check if there are free rooms
    abstract class Dwelling(private var residents: Int) {
        abstract val buildingMaterial: String
        abstract val capacity: Int

        fun hasRoom(): Boolean {
           return residents < capacity
       }
    }

    // class square cabin (extending from dwelling class) 
    //rem to place the number of parameters also inside from parent class
    //you can change the value from being fxed by reusing the declared var
    class SquareCabin(residents : Int) : Dwelling(residents){
        override val buildingMaterial = "wood"
        override val capacity = 6
    }



    
	// Switching to using "With"

    fun main() {
        // create instance of square cabin
        val squareCabin = SquareCabin(4)
        val roundHat = RoundHut(3)
        with(squareCabin){
            println("\nSquare Cabin\n============")
        	println("Capacity: ${capacity}")
        	println("Material: ${buildingMaterial}")
        	println("Has room? ${hasRoom()}")
        with(roundHat){
             println("\nRound Hut\n=========")
   			 println("Material: ${buildingMaterial}")
  		     println("Capacity: ${capacity}")
  		     println("Has room? ${hasRoom()}")
        }
            
        }
    }

    // abstract class and function to check if there are free rooms
    abstract class Dwelling(private var residents: Int) {
        abstract val buildingMaterial: String
        abstract val capacity: Int

        fun hasRoom(): Boolean {
           return residents < capacity
       }
    }

    // class square cabin (extending from dwelling class) 
    //rem to place the number of parameters also inside from parent class
    //you can change the value from being fxed by reusing the declared var
    class SquareCabin(residents : Int) : Dwelling(residents){
        override val buildingMaterial = "wood"
        override val capacity = 6
    }
    
    class RoundHut(residents : Int) : Dwelling(residents){
        override val buildingMaterial = "straw"
        override val capacity = 6
    }

// output
Square Cabin
============
Capacity: 6
Material: wood
Has room? true

Round Hut
=========
Material: straw
Capacity: 6
Has room? true



// SUBCLASSING  (used Open as kotlin classes are always final)


	// Switching to using "With"

    fun main() {
        // create instance of square cabin
        val squareCabin = SquareCabin(4)
        val roundHat = RoundHut(3)
        val roundTower = RoundTower(2)
        
        with(squareCabin){
            println("\nSquare Cabin\n============")
        	println("Capacity: ${capacity}")
        	println("Material: ${buildingMaterial}")
        	println("Has room? ${hasRoom()}")
        with(roundHat){
             println("\nRound Hut\n=========")
   			 println("Material: ${buildingMaterial}")
  		     println("Capacity: ${capacity}")
  		     println("Has room? ${hasRoom()}")
        }
        with(roundTower) {
    		println("\nRound Tower\n==========")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")
    		println("Has room? ${hasRoom()}")
}
            
        }
    }

    // abstract class and function to check if there are free rooms
    abstract class Dwelling(private var residents: Int) {
        abstract val buildingMaterial: String
        abstract val capacity: Int

        fun hasRoom(): Boolean {
           return residents < capacity
       }
    }

    // class square cabin (extending from dwelling class) 
    //rem to place the number of parameters also inside from parent class
    //you can change the value from being fxed by reusing the declared var
    class SquareCabin(residents : Int) : Dwelling(residents){
        override val buildingMaterial = "wood"
        override val capacity = 10
    }
    
    open class RoundHut(residents : Int) : Dwelling(residents){
        override val buildingMaterial = "straw"
        override val capacity = 6
    }
    class RoundTower(residents : Int) : RoundHut(residents){
        override val buildingMaterial = "Stone"
        override val capacity = 4
    }



    // MULTIPLE PARAETER ON SUBLCASSING
    
	// Switching to using "With"

    fun main() {
        // create instance of square cabin
        val squareCabin = SquareCabin(4)
        val roundHat = RoundHut(3)
        val roundTower = RoundTower(2, 8)
        
        with(squareCabin){
            println("\nSquare Cabin\n============")
        	println("Capacity: ${capacity}")
        	println("Material: ${buildingMaterial}")
        	println("Has room? ${hasRoom()}")
        with(roundHat){
             println("\nRound Hut\n=========")
   			 println("Material: ${buildingMaterial}")
  		     println("Capacity: ${capacity}")
  		     println("Has room? ${hasRoom()}")
        }
        with(roundTower) {
    		println("\nRound Tower\n==========")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")
    		println("Has room? ${hasRoom()}")
}
            
        }
    }

    // abstract class and function to check if there are free rooms
    abstract class Dwelling(private var residents: Int) {
        abstract val buildingMaterial: String
        abstract val capacity: Int

        fun hasRoom(): Boolean {
           return residents < capacity
       }
    }

    // class square cabin (extending from dwelling class) 
    //rem to place the number of parameters also inside from parent class
    //you can change the value from being fxed by reusing the declared var
    class SquareCabin(residents : Int) : Dwelling(residents){
        override val buildingMaterial = "wood"
        override val capacity = 10
    }
    
    open class RoundHut(residents : Int) : Dwelling(residents){
        override val buildingMaterial = "straw"
        override val capacity = 6
    }
    // int = 2 , added as default incase no passed paramter on main fun
    class RoundTower(residents : Int, val floor : Int = 5) : RoundHut(residents){
        override val buildingMaterial = "Stone"
        override val capacity = 4
    }

