
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




// USING MAP FUNCTION 
fun main() {
    val people = mutableMapOf<String, Int>(
    "Timz" to 30,
    "Chelsea" to 60)
    people.put("Gildred" , 70) 
    people["Doe"] = 45	
    people["Timz"] = 100	
    
    //iterate through the map
    println(people.map{"${it.key} is ${it.value}"}.joinToString(","))
}




//FILTERED MAPS objects

fun main() {
    val people = mutableMapOf<String, Int>(
    "Timz" to 30,
    "Chelsea" to 60)
    people.put("Gildred" , 70) 
    people["Doe"] = 45	
    people.put("Tim",10)
    people["Timz"] = 100	
    
    val filteredNames = people.filter{it.key.length < 4}
    println(filteredNames)
}


// LAMBDAS Functions & simplification using it (high order function)
fun main() {
    val triple : (Int) -> Int = {a : Int -> a * 3}
    println(triple(3))
 
    // simplification using it expression
    val double : (Int) -> Int = {it * 2}
    println(double(3))
 }


// HIGH ORDER FUNCTIONS

fun main() {
    
    val names = listOf("Fred","Tim","Alex","Sandra","Osodo","Brenda","Aleky")
    println(names.sorted())
    
    // print sorted but with order interms of lenght
    println(names.sortedWith{str1 : String, str2 : String -> str1.length - str2.length})
    
}



// LIST OF WORDS

fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    
    // Print words that start with letter b. ignore case
    val filteredWords = words.filter{ it.startsWith("b", ignoreCase = true)}
    println(filteredWords)
    
    val randomShufle = words.filter {it.startsWith("b", ignoreCase = true)}.shuffled()
    println(randomShufle)
}

