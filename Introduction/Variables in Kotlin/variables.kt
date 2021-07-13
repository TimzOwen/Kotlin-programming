
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


    // IMMUTABLE LISTS & MAPS

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



    
    // List of Strings and methods in it (Immutable)

fun main() {
    val students = listOf("Timz","Owen","Stacy","Shem","Chelsea","Alex","Omondi")

    println(students.sorted())  // sort a list alphabetically
    println(students[0])    // access specific student
    println(students.last()) // prints last element in a list
    println(students.first()) // prints first element in the list
    println(students.contains("Owen"))  // returns boolean true if the element is contained inside


}


    // Mutable Lsit of Elements
    // List of Strings and methods in it (Mutable)

fun main() {
    val students = arrayListOf("Timz","Owen","Stacy","Shem","Chelsea","Alex","Omondi")

    println(students.size)  //returns the number of elements in a list
    students.add("Kibet")   // adds the element to the last part
    println(students)
    students.add(0,"Kevin" ) // adds to specific index an element
    println(students)
    
}



    
    //.. MUTABLE LISTS AND MAPS

    // Mutable lists
    val developers = mutableListOf("Timz","Owen","Shem","Pappi")
    developers.add("Salma")


    // mutable maps -> unorder key value pair list of elements 
    val devs = mutableMapOf(1 to "Timz", 2 to "Owen",3 to "Shem")
    devs[4] = "salma"
    
}

// Maps of Strings and methods in it (immutable)
// are of type key value pair

fun main() {
    val students = mapOf("Timz" to 2,"Owen" to 4,"Stacy" to 6,"Shem" to 8,"Chelsea" to 10)
    println(students)
    println(students["Owen"])   // get the value of the key provided
    println(students.getOrDefault("Kiptoo","No such Key"))  //returns default value if none exist
    println(student.values) // print values 
    println(student.key)    // returns all key in the map

}


// Mutable maps (use HashMap)
// hasMaps of Strings and methods in it (Mutable)
// are of type key value pair

fun main() {
    val students = hashMapOf("Timz" to 2,"Owen" to 4,"Stacy" to 6,"Shem" to 8,"Chelsea" to 10)

    students["Timz"] = 20   // changing value of a key
    println(students)
    students["Alex"] = 30   // inserting a new element into the hash map
    println(students)
    students.remove("Timz") //removes an element from the map
    students.isEmpty() // return a boolean based on if elements are empty or not
    students.clear()    // removes all elements in the list

}




// COLLECTION TYPES AND FUNCTIONS
// EXTERNAL FUNCTION

// modifiying lists and multiple parameter
fun sayHallo(greeting : String, itemsToGreet : List<String>){
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}
//MAIN FUNCITON
fun main() {

    val intrestingThings = listOf("Kotlin", "Java","Python","Gaming")
    sayHallo("Hello",intrestingThings)

    }



// Example 2

fun brandType(brand : String, computers : List<String>){
    computers.forEach {  comp ->
        println(" $brand $comp")
    }
}

fun main() {

    val electronics = listOf("Python", "Java", "Machine Learning","phones")
    brandType("HP",electronics)

}



// VARARGS, NAMED, ARGUEMENTS, DEFAULT PARAMETER VALUES.

// vararg->variable number of keyword arguements


fun brandType(brand : String,  vararg computers : String){
    computers.forEach {  comp ->
        println(" $brand $comp")
    }
}

fun main() {

    brandType("HP","Ram","Pixel","Keyboard","phone","Usb","LAN")

}

//example 2 varargs

fun standUp(name : String, vararg tasks : String){
    tasks.forEach { task ->
        println("$name $task")
    }
}

fun main() {
    standUp("Timz","android","backend php","Programming","springboot")

}


// spread operator to accept varargs as string
fun standUp(name : String, vararg tasks : String){
    tasks.forEach { task ->
        println("$name $task")
    }
}

fun main() {
    val networks = arrayOf("Retrofit","firebase","json","backbase")
    standUp("Timz",*networks)

}

// Function - NAMED PARAMETER (Pass in parameter with not particular order)

fun sayHello(greeting : String, name : String) = "$greeting $name"

fun main(// named array as parameter
fun branding(company : String, vararg products : String){
    products.forEach { product ->
        println("$company $product")
    }
}

fun main() {
    val companies = arrayOf("Samsung","Google","Safaricom","Huawei","Facebook")
    branding(products = companies, company = "Kenya")
}
    println(sayHello(greeting = "Hello",name = "Owen"))
    println(sayHello(name = "Timz",greeting = "Hi"))

}


// Default argument values

fun sayHello(greeting : String = "Hey", name : String="developer") = "$greeting $name"

fun main() {
    println(sayHello(greeting = "Hello",name = "Owen"))
    println(sayHello("Hi"))
    println(sayHello())

}


// named array as parameter
fun branding(company : String, vararg products : String){
    products.forEach { product ->
        println("$company $product")
    }
}

fun main() {
    val companies = arrayOf("Samsung","Google","Safaricom","Huawei","Facebook")
    branding(products = companies, company = "Kenya")
}
