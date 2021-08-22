
//collections in Kotlin

// collection are list of items of the same types

fun main() {
    val numbers = listOf(2,2,4,4,6,8,10,0,3,4)
    println("list: ${numbers}")
    println("sorted: ${numbers.sorted()}")
    println("Set: No repeat: ${numbers.toSet()}") // elements don't repeat
}





// Maps --> key value pair data storage.

// values can be --> objects, numbers or strings.

fun main() {
    val people = mutableMapOf<String, Int>(
    "Timz" to 30,
    "Chelsea" to 60)
    people.put("Gildred" , 70) // add new member to a map
    people["Doe"] = 45			// Add new members 
    people["Timz"] = 100	// modifying values if existing (not added)
    println(people)
}


// LOOPING THROUGH MAPS

fun main() {
    val people = mutableMapOf<String, Int>(
    "Timz" to 30,
    "Chelsea" to 60)
    people.put("Gildred" , 70) 
    people["Doe"] = 45	
    people["Timz"] = 100	
    
    //iterate through the map
    people.forEach{println("${it.key} is ${it.value}")}
}

