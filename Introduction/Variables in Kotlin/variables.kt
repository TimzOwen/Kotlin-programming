
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
}