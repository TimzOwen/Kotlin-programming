
// Hello world Kotlin first program

fun printHello(){
    print("Hello world Kotlin")
}
// call the function here
printHello()


// Operators (+-/)

1 + 1 = 2   // addition
5 - 2 = 3   //subtraction
50 / 10 = 5 // whole number division
1 / 2 = 0   // division of whole numbers
1.0 / 2.5 = 0.5 //division of fractions
6 * 5 = 30  // multiplication

val fish3 = 4
val fish4 = 5

fish4 + fish3


// operation methods
// call methods on values
 val fish = 5
 fish.minus(2)   //subtraction
 fish.plus(4)    // addition
 fish.times(2)   // multiplication
 fish.div(3) // divison
res0: kotlin.Int = 1


//Variables

// val name: type = value 
val myName : String = "Timz Owen"

val fish1 = 20   // unchangable / Immutable / cannot be updated
var fish2 = 10   // changeable  / mutable   / can be updated


// implicit $ explicit casting

//wrong casting approach
val b: Byte = 1
val i: int = b  // ERROR!!!!!!

//Right casting approach
val int i: Int = b.toInt()      


// LONG VARIBALE NUMBER UNDERSCORE
val oneMillion = 1_000_000
val socialNum = 234_456_345_764


// NULL VALUES KOTLIN
//values cannot be null in kotlin. use question marks

// ERROR!!! ---> Cannot be null error
var rocks: Int = null 

//use question marks 
var marbles: Int? = null
var numOfFish: List<Strings?> = listof(null, null)  // null list
var moreFish : List<String>? = null // elements
var moreMoreFish List<String?>?  = null // both List and elements are null


//NULL POINT EXCEPTION




// CONTROL FLOW 

// IF STATEMENT 

var userName : String? = "Timz Owen"

fun main() {
   //if else statement
    userName = null // update the value and try again with null 
    if(userName != null){
        println(userName)
    }else{
        print("No name , Null")
    }
}



//  WHEN STATEMENT --> (Java switch case)

var userName : String? = "Timz Owen"

fun main() {
   // when statement
    userName = null
    when(userName){
        null -> println("No name")
        else -> println(userName)
    }
}


// USING IF ELSE TO REASSIGN VALUES

var userName : String? = null

fun main() {
    userName = "Android developer"
  // If else statement to assign variables
    val newUser = if (userName != null) userName else "Welcome to Kotlin"
    println(newUser)


}


// USING WHEN
var userName : String? = null

fun main() {
    userName = "Android developer"
  // when else statement to assign variables
    val newUser = when(userName){
        null -> "Hello Android developer"
        else -> userName
    }
    println(newUser)


}


// FUNCTION IN KOTLIN

//fun - keyword to be used
//name - function name
//() - Function parameters
//: - before defining a return type
//dataType - data type to be return in the function

fun greetingFunction() : String{
     return "Welcome to Functions android developer"
}


fun main() {
    // invoke the function here
    print(greetingFunction())
}


// UNIT RETURN TYPE

//fun - keyword to be used
//name - function name
//() - Function parameters
//: - before defining a return type
//dataType - data type to be return in the function

fun greetingFunction() : String{
     return "Welcome to Functions android developer"
}

// unit return type---> fun greeting() : Unit {}  --> omitted because its enabled by default

fun printGreeting() {
    println(greetingFunction())
}

fun main() {
    // invoke the function here
    println(greetingFunction())
    printGreeting()
}



// RETURN NULL
// RETURN NULL

fun greetingFunction() : String ? {
     return null
}

// unit return type---> fun greeting() : Unit {}  --> omitted because its enabled by default

fun printGreeting() {
    println(greetingFunction())
}

fun main() {
    // invoke the function here
    println(greetingFunction())
    printGreeting()
}




// SINGLE EXPRESSION FUNCTION RETURN

fun greetingFunction() : String = "Hello single expression function"

// unit return type---> fun greeting() : Unit {}  --> omitted because its enabled by default

fun printGreeting() {
    println(greetingFunction())
}

fun main() {
    // invoke the function here
    println(greetingFunction())
    printGreeting()
}


// SIMPLER SINGLE EXPRESSION FUNCTION RETURN (remove String casting)

fun greetingFunction() : String = "Hello single expression function"

fun greetingTwo() = "simpler expression as kotlin knows what to return "

fun printGreeting() {
    println(greetingFunction())
    println(greetingTwo())
}

fun main() {
    // invoke the function here
    printGreeting()
    greetingTwo()
}


// FUNCTION PARAMETER

fun printGreeting(userName : String) {
    // instead of using + concatenation use kotlin's $ template
    val message = "Hello $userName"
    println(message)
}


fun main() {
    // invoke the function here
    printGreeting("Timz Owen")
}



// SIMPLIFYING FUNCTION PARAMETERS

fun printGreeting(userName : String) {
    // instead of using + concatenation use kotlin's $ template
    val message = "Hello $userName"
    println(message)
}

fun printGreeting2(userName2 : String){
    println("Hello senior $userName2")
}

fun printGreeting3(userName3 : String) = "hello Engineer $userName3"

fun greeting4(name: String, role : String )  = "$name $role"

// Main Function
fun main() {
    // invoke the function here respectively
    printGreeting("Timz Owen")
    printGreeting2("Owen")
    println(printGreeting3("Timz"))
    println(greeting4("Timz Owen","Android developer"))

}




