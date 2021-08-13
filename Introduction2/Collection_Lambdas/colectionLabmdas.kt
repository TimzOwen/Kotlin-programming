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





// Maps in kotlin
// This are set of Key value pair (Keys are unique)


//Maps in Kotlin
fun main() {
    val agesOfPeople = mutableMapOf(
        "owen" to 25,
        "Timz" to 40,
        "James" to 80
        )
    agesOfPeople.put("Ochieng", 30)	// add using .put() method
    agesOfPeople["Shem"] = 70		// add using shortHand notation
    println(agesOfPeople)
      
}



// COLLECTIONS
// Have similarities if they are mutabe or immutable with different methods


//collections
fun main() {
    val agesOfPeople = mutableMapOf(
        "owen" to 25,
        "Timz" to 40,
        "James" to 80
        )
   
    
    // iterate through elements 
    agesOfPeople.forEach{println("${it.key} is ${it.value},")}
      
   }




// using maps to perform collection

fun main() {
    val agesOfPeople = mutableMapOf(
        "owen" to 25,
        "Timz" to 40,
        "James" to 80
        )
   
    // iterate through elements using map 
    println(agesOfPeople.map{"${it.key} is ${it.value}"}.joinToString(", "))
      
}


//Filter elements ina collection

fun main() {
    val agesOfPeople = mutableMapOf(
        "owen" to 25,
        "Timz" to 40,
        "James" to 80
        )
    val filterNames = agesOfPeople.filter{it.key.length < 5}
    println(filterNames)
      
   }




// Lambdas and HIGH ORDER FUNCTIONS 

// It's like you wrote a small function in the curly braces, but there's no function name. This idea—a function with no name that can
// immediately be used as an expression—is a really useful concept called a lambda expression, or just lambda, for short.


// Function Types

// Example Function Type: (Int) -> Int

{a : Int -> a * 3} // triples a number and returns an Interger


// return type functions
fun main(){
    val tripple : (Int) -> Int = {a : Int -> a * 3 }
    println(tripple(5))
}


// Simplification using Lambda
fun main(){
    val tripple : (Int) -> Int = {a : Int -> a * 3 }
    println(tripple(5))
    
    // simplified
    val tripple2 : (Int) -> Int = {it * 3}
    println(tripple2(3))
}


// HIGH ORDER FUNCTIONS

//Comparison with high  order Functions 

fun main(){
    val names = listOf("Tim","Abel","Timz","Captain","James")
    println(names.sorted())
    [Abel, Captain, James, Tim, Timz]
}



//Comparison with high  order Functions  (sortedWith)

fun main(){
    val names = listOf("Tim","Abel","Timz","Captain","James")
    println(names.sorted())
    println(names.sortedWith{str1 : String, str2 : String -> str1.length - str2.length})
    Abel, Captain, James, Tim, Timz]
    [Tim, Abel, Timz, James, Captain] // according to length
}


