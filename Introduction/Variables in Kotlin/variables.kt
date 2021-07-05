
// COLLECTION & ITERATIONS

//Arrays , Lists & Types


// ARRAY IN KOTLIN

// Main Function
fun main() {
    //decalre arrays
    val developers = arrayOf("Timz","Owen","Pappi","Juma")

    //call methods on the array
    println(developers.size) // returns the number of elements in the array
    println(developers[0]) // accessing elements (1 - first element) OR .get(index)

    // Iterate through elements of an array
    for(devs in developers){
        println(devs)
    }

    // using it to iterate
    developers.forEach {
        println(it)
    }

    // rename your iterator
    developers.forEach { dev ->
        println(dev)
    }
    // printing elements with index using forEachIndexed
    developers.forEachIndexed { index, dev ->
        println("$dev is at index number $index")
    }


     //Lists in kotlin
    val fruits = listOf("Tomatoes","oranges","onions","carrots")

    //print the elements
    fruits.forEachIndexed{index, fruit ->
        println("$fruit is at index $index")
    }

    // Maps --> uses key-value pair
    val map = mapOf(1 to "timz", 2 to "owen", 3 to "Ninja")
    map.forEach { key, value ->
        println("$key -> $value")
    }



















}