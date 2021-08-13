// Collection and Lambdas in Kotlin programming

// Collection are group of ordered or unordered related items 


//List review
fun main() {
    val numbers = listOf(1,2,3,4,5,5,6)
    println("The list of numbers: $numbers")
}

//List review (sorted lists)

fun main() {
    val numbers = listOf(0,10,4,8,2,6,8,4,6)
    println("The list of numbers: ${numbers}")
    println("Sorted: ${numbers.sorted()}")	// sorted list 
}



//Sets in Kotlin
// sets is a list but no duplicate and orders does not matter

fun main() {
    val numbers = listOf(0,1,10,710,4,8,2,6,6,8,4,6)
    println("No set: ${numbers}")
    println("With set: ${numbers.toSet()}") // no duplicates
    
}




//Sets comparison
fun main() {
    val set1 = setOf(1,2,3)
    val set2 = mutableSetOf(3,2,1)
    
    println("$set1 == $set2 : ${set1 == set2}")
   
}
[1, 2, 3] == [3, 2, 1] : true



//Sets check if it contains elements
fun main() {
    val listOfNumber = listOf(2,4,6,8,10,1,3,5,7,9)
    val setOfNumbers = listOfNumber.toSet()
    
    println("contains 7: ${setOfNumbers.contains(7)}")
   
}
