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



 // function arguements 
 fun main() {
    val border = "*"
    printBorder(border)
    println("Happy Birthday, Jhansi!")
    printBorder(border)
}

fun printBorder(border : String ){
   repeat(37){
       print(border)
   }
   println()
}


// function arguements 
fun main() {
    val border = "*-_._-*"
    printBorder(border)
    println("Happy Birthday, Jhansi!")
    printBorder(border)
}
​
fun printBorder(border : String ){
   repeat(7){
       print(border)
   }
   println()
}
// output
*-_._-**-_._-**-_._-**-_._-**-_._-**-_._-**-_._-*
Happy Birthday, Jhansi!
*-_._-**-_._-**-_._-**-_._-**-_._-**-_._-**-_._-*




 // function arguements 
 fun main() {
    val border = "*-_._-*"
    val numRepeat = 4
    printBorder(border, numRepeat)
    println(" Happy Birthday, Owen ")
    printBorder(border,numRepeat)
}
​
fun printBorder(border : String, numRepeat : Int){
   repeat(numRepeat){
       print(border)
   }
   println()
}
// output

*-_._-**-_._-**-_._-**-_._-*
 Happy Birthday, Owen 
*-_._-**-_._-**-_._-**-_._-*



 // function arguements with more than two parameter 
 
 
 fun main() {
    val border = "*-_._-*"
    val numRepeat = 4
    val type = "BMW"
    val cost = 300000
    printBorder(border, numRepeat)
    println(" Happy Birthday, Owen ")
    printBorder(border,numRepeat)
    messageBMI(numRepeat,type, cost)
}

fun printBorder(border : String, numRepeat : Int){
   repeat(numRepeat){
       print(border)
   }
   println()
}

// three parameters
fun messageBMI(numRepeat : Int, type : String , cost : Int){
    repeat(numRepeat){
        print(type)
        println(cost)
    }
    println()
}
// output
*-_._-**-_._-**-_._-**-_._-*
 Happy Birthday, Owen 
*-_._-**-_._-**-_._-**-_._-*
BMW300000
BMW300000
BMW300000
BMW300000




// print hbd cake
// Nesting methods and Multiple functions

// main function
fun main(){
    val age = 24
    val layers = 5
    
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age,layers)
    
}

//function to print cake top
fun printCakeTop(age : Int){
    repeat(age + 2){
        print("=")
    }
    println()
}

// function to print cake candles
fun printCakeCandles(age : Int){
    repeat(age){
        print(",")
    }    
    println("")
    repeat(age){
        print("|")
    }
    println()
}

// function for printing Bottom
fun	printCakeBottom(age : Int, layers : Int){
    repeat(layers){
        repeat(age + 2){
        print("@")
   	 }
        println()
    }
}
// output
,,,,,,,,,,,,,,,,,,,,,,,,
||||||||||||||||||||||||
==========================
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
@@@@@@@@@@@@@@@@@@@@@@@@@@
