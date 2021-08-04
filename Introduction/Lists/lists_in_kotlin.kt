
// Lists in Kotlin (NOTE: Lists in kotlin are immutable)

fun main() {
    val numbers = listOf(2,4,6,8,10)
    println("The list is ${numbers}")	
    println("has ${numbers.size} elements")	// find the size of the elements
    println("access element number one ${numbers[0]}")
    
    // access the elements using first and last
    println("element one ${numbers.first()}")
    println("Last element is ${numbers.last()}")
    
    //search if there are existing elements in a list
    println("Is 4 present? ${numbers.contains(4)}") // returns a boolean
    
}


// modifying the elements in a list by order
fun main(){
    val fruits = listOf("Mango","Orange","banana","coconuts")
    
    // print the elements in the list
    println("The fruits are ${fruits}")
    
    // Print list in reversed and ordered manner
    println("reversed list in ${fruits.reversed()}")
    println("ordered elements ${fruits.sorted()}")
}




// Genericc types in kotlin

// introduction to mutalble list(specify the Generic type)
fun main(){
    val names : MutableList<String> = mutableListOf()
    
    println("added Timz here as ${names.add("Timz Owen")}")
    println(names)	// displays a new name here
    
    // adding more than one element (addAll())
    val otherNames = listOf("Shem","Salma","Timothy","Chelsea")
    println("added and its ${names.addAll(otherNames)} to $names")
    
    // Remove elements from the list
    println("${names.remove("Salma")} and becomes ${names}")
    
    // Remove at specific index
    println("removed index 1 ${names.removeAt(0)} and becomes $names")
    
    // clear all elements from the list
    println("And there are no elements ${names.clear()}") // no element in kotloin unit
    
}


