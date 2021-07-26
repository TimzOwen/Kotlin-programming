// 001



// classes in Kotlin programming 
class Person(val userName : String, var weight : Double ){

}

// the main function that calls the constructor and parameters passed inside
fun main() {

    val person = Person("Timz",500.50)
    val name = person.userName
    val weights = person.weight
    println(name)
    println(weights)

}


// printing shapes and objects & Hello world
fun main(){
    println("Hello world Timz Owen")
    println("Happy borthday Timz Owen ")
}


// birthday cake shape
fun main(){
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println("")
}

// using variable names to print 
fun main(){
    var name = "Timz Owen"
    var age = 5 *3
    println("hello ${name} you are ${age} years old")
}

// print lines 
fun main() {
    println("=======================")
    println("Happy Birthday, Jhansi!")
    println("=======================")
}


// 
fun main(){
    var name = "Timz Owen"
    var age = 5 *3
    printBoarder()
    println("hello ${name} you are ${age} years old")
    printBoarder()
}
fun printBoarder(){
    println("=====================================")
}

//use repeat method to print statements repeatedly 
fun main(){
    var name = "Timz Owen"
    var age = 5 *3
    printBoarder()
    println("hello ${name} you are ${age} years old")
    printBoarder()
}
fun printBoarder(){
   repeat(37){
       print("=")
   }
   println()
}
