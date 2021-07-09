// Higher order Function 022
// this are function that are returned from other functions or taken in as parameters

fun printFilteredStrings(list: List<String>, predicate: (String) -> Boolean){

    list.forEach {
        if (predicate(it)){
            println(it)
        }
    }
}
fun main() {
    val list = listOf("Java","Python","Javascript","C++","Golang")
    printFilteredStrings(list) {
        it.startsWith("J")
    }
}




// Higher order Function 023
// invoke a null function

fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?){

    list.forEach {
        if (predicate?.invoke(it)==true){
            println(it)
        }
    }
}
fun main() {
    val list = listOf("Java","Python","Javascript","C++","Golang")
    printFilteredStrings(list) {
        it.startsWith("J")
    }
    // now you can pass in an empty/null value
    printFilteredStrings(list,null)
}




// Higher order Function 024
// Storing Function as variables

fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?){

    list.forEach {
        if (predicate?.invoke(it)==true){
            println(it)
        }
    }
}

val predicate : (String)->Boolean = {
    it.startsWith("J")
}

fun main() {
    val list = listOf("Java","Python","Javascript","C++","Golang")
    printFilteredStrings(list,predicate)
}



// Higher order Function 025
// Functions as return types

fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?){

    list.forEach {
        if (predicate?.invoke(it)==true){
            println(it)
        }
    }
}

val predicate : (String)->Boolean = {
    it.startsWith("J")
}

fun getPrintPredicate(): (String) -> Boolean{
    return {it.startsWith("C")}
}

fun main() {
    val list = listOf("Java","Python","Javascript","C++","Golang","C#")
    printFilteredStrings(list,getPrintPredicate())
}




// Higher order Function 025
// Function methods
fun main() {
    val list = listOf("Java","JavaScript","Python","Ruby","Kotlin", null)
    // print number of elements and teh elements
    list
        .filterNotNull()
        .associate { it to it.length }
        .forEach {
            println("${it.value}, ${it.key}")
        }
}

