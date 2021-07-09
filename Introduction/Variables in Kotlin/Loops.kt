// Loops
// iterating through some elements

fun main() {
    val students = hashMapOf("Timz" to 2,"Owen" to 4,"Stacy" to 6,"Shem" to 8,"Chelsea" to 10)
    val teachers = arrayListOf("Mr Omondi","Mr Alex","Mr Shem","Mrs Komen","Mr Kirui")

    // iterate through the element of teachers
    for (teacher in teachers){
        println("Name: $teacher")
    }

    // iterate through list of student key value pair
    for((key,value) in students){
        println("Mr $key has id number $value")
    }


}


// Loops
// iterating through some elements( decreament operator)

fun main() {
    // While loop
    var x = 5
    while (x >= 0){
        println(x)
        x--
    }
}

// Loops
// iterating through some elements (increament Operator)

fun main() {
    // While loop
    var x = 0
    while (x <= 10){
        println(x)
        x++
    }
}





