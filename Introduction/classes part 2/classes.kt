
// Classes and inheritance

// classes and inheritance 

abstract class Dwelling(private var residents : Int){
    abstract val buildingMaterial : String
    abstract val capacity : Int
    
    fun hasRoom() : Boolean {
        return residents < capacity
    }   
}

class SquareCabine(residents : Int) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6
}

fun main(){
    val squareCab = SquareCabine(4)
    println("Sqaure cabin")
    println("has room is: ${squareCab.hasRoom()}")
    println("Capacity is: ${squareCab.capacity}")
    println("Material made is : ${squareCab.buildingMaterial}")
    
}





// USE WITH TO REMOVE REPETITIVE CODE
// classes and inheritance 

abstract class Dwelling(private var residents : Int){
    abstract val buildingMaterial : String
    abstract val capacity : Int
    
    fun hasRoom() : Boolean {
        return residents < capacity
    }   
}

class SquareCabine(residents : Int) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6
}

fun main(){
    val squareCab = SquareCabine(8)
    with(squareCab){
        println("Sqaure cabin")
        println("has room is: ${hasRoom()}")
        println("Capacity is: ${capacity}")
        println("Material made is : ${buildingMaterial}")
    }
    
}







// ADDING CLASS SECOND CLASS

// classes and inheritance 

abstract class Dwelling(private var residents : Int){
    abstract val buildingMaterial : String
    abstract val capacity : Int
    
    fun hasRoom() : Boolean {
        return residents < capacity
    }   
}

class SquareCabine(residents : Int) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6
}
class RoundHat(residents : Int) : Dwelling(residents){
    override val buildingMaterial = "Straw"
    override val capacity = 10
}

fun main(){
    val squareCab = SquareCabine(8)
    with(squareCab){
        println("Sqaure cabin")
        println("has room is: ${hasRoom()}")
        println("Capacity is: ${capacity}")
        println("Material made is : ${buildingMaterial}")
    }
    val roundHat = RoundHat(8)
    with(roundHat){
        println("\nRoundHat==")
        println("HasRoom : ${hasRoom()}")
        println("Capacity is: ${capacity}")
        println("Material is: ${buildingMaterial}")
    }
    
}







// EDITABLE CAPACITY


// classes and inheritance 

abstract class Dwelling(private var residents : Int){
    abstract val buildingMaterial : String
    abstract val capacity : Int
    
    fun hasRoom() : Boolean {
        return residents < capacity
    }   
}

class SquareCabine(residents : Int) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6
}
open class RoundHat(residents : Int) : Dwelling(residents){
    override val buildingMaterial = "Straw"
    override val capacity = 10
}

class RoundTower(residents : Int,
                val floors : Int = 3) : RoundHat(residents){
    override val buildingMaterial = "stone"
    override val capacity = 10 * floors
}

fun main(){
    val squareCab = SquareCabine(8)
    with(squareCab){
        println("Sqaure cabin")
        println("has room is: ${hasRoom()}")
        println("Capacity is: ${capacity}")
        println("Material made is : ${buildingMaterial}")
    }
    val roundHat = RoundHat(8)
    with(roundHat){
        println("\nRoundHat==")
        println("HasRoom : ${hasRoom()}")
        println("Capacity is: ${capacity}")
        println("Material is: ${buildingMaterial}")
    }
    
    val roundTower = RoundTower(5,4)
    with(roundTower){
        println("\nRoundTower==")
        println("HasRoom : ${hasRoom()}")
        println("Capacity is: ${capacity}")
        println("Material is: ${buildingMaterial}")        
    }
    
}





// FLOOR AREA INCLUDED

// classes and inheritance 
import kotlin.math.PI

abstract class Dwelling(private var residents : Int){
    abstract val buildingMaterial : String
    abstract val capacity : Int
    
    fun hasRoom() : Boolean {
        return residents < capacity
    }   
    abstract fun floorArea() : Double 
}

class SquareCabine(residents : Int, val length : Double) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6
    
    override fun floorArea() : Double{
        return length * length
    }
}
open class RoundHat(residents : Int, val radius : Double) : Dwelling(residents){
    override val buildingMaterial = "Straw"
    override val capacity = 10
    
    override fun floorArea() : Double{
        return PI * radius * radius 
    }
}

class RoundTower(residents : Int,
                 radius : Double,
                val floors : Int = 3) : RoundHat(residents, radius){
    override val buildingMaterial = "stone"
    override val capacity = 10 * floors
}

fun main(){
    val squareCab = SquareCabine(8, 10.5)
    with(squareCab){
        println("Sqaure cabin")
        println("has room is: ${hasRoom()}")
        println("Capacity is: ${capacity}")
        println("Material made is : ${buildingMaterial}")
        println("Floor area is ${floorArea()}")
    }
    val roundHat = RoundHat(8, 21.7)
    with(roundHat){
        println("\nRoundHat==")
        println("HasRoom : ${hasRoom()}")
        println("Capacity is: ${capacity}")
        println("Material is: ${buildingMaterial}")
        println("Floor area is: ${floorArea()}")
    }
    
    val roundTower = RoundTower(5,4.5)
    with(roundTower){
        println("\nRoundTower==")
        println("HasRoom : ${hasRoom()}")
        println("Capacity is: ${capacity}")
        println("Material is: ${buildingMaterial}")  
        println("Floor area: ${floorArea()}")
    }
    
}







//  SUPER CLASS IMPLEMENTATION
// classes and inheritance 
import kotlin.math.PI

abstract class Dwelling(private var residents : Int){
    abstract val buildingMaterial : String
    abstract val capacity : Int
    
    fun hasRoom() : Boolean {
        return residents < capacity
    }   
    abstract fun floorArea() : Double 
}

class SquareCabine(residents : Int, val length : Double) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6
    
    override fun floorArea() : Double{
        return length * length
    }
}
open class RoundHat(residents : Int, val radius : Double) : Dwelling(residents){
    override val buildingMaterial = "Straw"
    override val capacity = 10
    
    override fun floorArea() : Double{
        return PI * radius * radius 
    }
}

class RoundTower(residents : Int,
                 radius : Double,
                val floors : Int = 3) : RoundHat(residents, radius){
    override val buildingMaterial = "stone"
    override val capacity = 10 * floors
    
    override fun floorArea() : Double{
        return super.floorArea() * floors
    }
}

fun main(){
    val squareCab = SquareCabine(8, 10.5)
    with(squareCab){
        println("Sqaure cabin")
        println("has room is: ${hasRoom()}")
        println("Capacity is: ${capacity}")
        println("Material made is : ${buildingMaterial}")
        println("Floor area is ${floorArea()}")
    }
    val roundHat = RoundHat(8, 21.7)
    with(roundHat){
        println("\nRoundHat==")
        println("HasRoom : ${hasRoom()}")
        println("Capacity is: ${capacity}")
        println("Material is: ${buildingMaterial}")
        println("Floor area is: ${floorArea()}")
    }
    
    val roundTower = RoundTower(5,4.5)
    with(roundTower){
        println("\nRoundTower==")
        println("HasRoom : ${hasRoom()}")
        println("Capacity is: ${capacity}")
        println("Material is: ${buildingMaterial}")  
        println("Floor area: ${floorArea()}")
    }
    
}
