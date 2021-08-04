
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
