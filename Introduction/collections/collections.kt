
//collections in Kotlin

// collection are list of items of the same types

fun main() {
    val numbers = listOf(2,2,4,4,6,8,10,0,3,4)
    println("list: ${numbers}")
    println("sorted: ${numbers.sorted()}")
    println("Set: No repeat: ${numbers.toSet()}") // elements don't repeat
}

