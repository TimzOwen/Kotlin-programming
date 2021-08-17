
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
