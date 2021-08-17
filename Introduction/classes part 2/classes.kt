
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


