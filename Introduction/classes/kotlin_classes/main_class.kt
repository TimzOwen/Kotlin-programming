
// Classes
fun main() {
    // create an instance of the main class
    val person = Person("Timz","Owen")
}


// Classes (002)
fun main() {

    // create an instance of the main class
    val person = Person("Timz","Owen")

    // accessing the properties of a class
    println(person.fName)
    println(person.sName)
}


// CLASS (003)

// SECONDARY CONSTRUCTOR

fun main() {
    // create an instance of the main class
    val person = Person("Timz","Owen")

    // accessing the properties of a class
    // n/b -> secondary constructor is never called
    println(person.fName)
    println(person.sName)


    // task 2 - > remove the default parameter and check sec get executed
    val person2 = Person()
    println(person2.fName)
    println(person2.sName)


}


// CLASS (004)
// Default value & default constructor

fun main() {
    // create an instance of the main class
    val person = Person()

    // accessing the properties of a class
    println(person.fName)
    println(person.sName)


}


// CLASS (005)
// class properties

fun main() {
    // create an instance of the main class
    val person = Person()

    // accessing the properties of a class
    println(person.fName)
    println(person.sName)
    person.nickName = "producer"
    person.nickName = "engineer"


}


// CLASS (006)
// class properties & Methods

fun main() {
    // create an instance of the main class
    val person = Person()

    person.printUserInfo()


}


// CLASS (006 - a)
// class properties & Methods ( with nick name not null)

fun main() {
    // create an instance of the main class
    val person = Person()

    person.nickName = "Simba"

    person.printUserInfo()


}


// CLASS (006 - b)
// class properties & Methods ( with nick name null)

fun main() {
    // create an instance of the main class
    val person = Person()

    person.printUserInfo()


}



// CLASS (006 - c)
// class properties & Methods ( with nick name null) - office operator

fun main() {
    // create an instance of the main class
    val person = Person()

    person.printUserInfo()


}