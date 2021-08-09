
// Lists in Kotlin (NOTE: Lists in kotlin are immutable)

fun main() {
    val numbers = listOf(2,4,6,8,10)
    println("The list is ${numbers}")	
    println("has ${numbers.size} elements")	// find the size of the elements
    println("access element number one ${numbers[0]}")
    
    // access the elements using first and last
    println("element one ${numbers.first()}")
    println("Last element is ${numbers.last()}")
    
    //search if there are existing elements in a list
    println("Is 4 present? ${numbers.contains(4)}") // returns a boolean
    
}


// modifying the elements in a list by order
fun main(){ 
    val fruits = listOf("Mango","Orange","banana","coconuts")
    
    // print the elements in the list
    println("The fruits are ${fruits}")
    
    // Print list in reversed and ordered manner
    println("reversed list in ${fruits.reversed()}")
    println("ordered elements ${fruits.sorted()}")
}



// Genericc types in kotlin

// introduction to mutalble list(specify the Generic type)
fun main(){
    val names : MutableList<String> = mutableListOf()
    
    println("added Timz here as ${names.add("Timz Owen")}")
    println(names)	// displays a new name here
    
    // adding more than one element (addAll())
    val otherNames = listOf("Shem","Salma","Timothy","Chelsea")
    println("added and its ${names.addAll(otherNames)} to $names")
    
    // Remove elements from the list
    println("${names.remove("Salma")} and becomes ${names}")
    
    // Remove at specific index
    println("removed index 1 ${names.removeAt(0)} and becomes $names")
    
    // clear all elements from the list
    println("And there are no elements ${names.clear()}") // no element in kotloin unit
    
}




// Genericc types in kotlin

// introduction to mutalble list(specify the Generic type)
fun main(){
    val names : MutableList<String> = mutableListOf()
    
    println("added Timz here as ${names.add("Timz Owen")}")
    println(names)	// displays a new name here
    
    // adding more than one element (addAll())
    val otherNames = listOf("Shem","Salma","Timothy","Chelsea")
    println("added and its ${names.addAll(otherNames)} to $names")
    
    // Remove elements from the list
    println("${names.remove("Salma")} and becomes ${names}")
    
    // Remove at specific index
    println("removed index 1 ${names.removeAt(0)} and becomes $names")
    
    // clear all elements from the list
    println("And there are no elements ${names.clear()}") // no element in kotloin unit
    
}


// Looping through a list.

fun main (){
    // using (while) expression 
    // while(expression){
    // Do something here
    // }
    
    val guestFamily = listOf(2,4,6,8)
    var totalGuest = 0
    var index = 0
    
    while(index < guestFamily.size){
        totalGuest += guestFamily[index] // same as totalGuest = TotalGuest + 
        index ++
    }
    println("Total guest $totalGuest")
    
} 

// Looping through a list. (FOR LOOP)

fun main(){
    // create a list of elements and use ("in")
    val name = listOf("Timz","Mercy","Ken","Alfred","Simon")
    for(names in name){
        println(names)
    }
}


// Finding the number of characters in a length 
fun main(){
    // create a list of elements and use ("in")
    val name = listOf("Timz","Mercy","Ken","Alfred","Simon")
    for(names in name){
        // calc the lenght of elements
        println("the name $names has ${names.length} characters")
    }
}


// Lists operations 

for (item in list) print(item) // Iterate over items in a list

for (item in 'b'..'g') print(item) // Range of characters in an alphabet

for (item in 1..5) print(item) // Range of numbers

for (item in 5 downTo 1) print(item) // Going backward

for (item in 3..6 step 2) print(item) // Prints: 35




// odering Hotel challenge

open class Item(val name: String, val price: Int)

class Noodles : Item("Noodles", 10){
    override fun toString() : String {
        return name
    }
}

class Vegetables(vararg val toppings : List<String> ) : Item("Vegetables", 5) {
    override fun toString(): String{
        if(toppings.isEmpty()){
            return "$name chef's choice"
        }else{
        return name + " " + toppings.joinToString()
        }
    }
}

fun main() {
    val noodles = Noodles()
    val vegetables = Vegetables(listOf("Cabbage","Sprout","onions","spices"))
    val vegetables2 = Vegetables()
   
    println(noodles)
    println(vegetables)
    println(vegetables2)
}






// Create an order now

open class Item(val name: String, val price: Int)

class Noodles : Item("Noodles", 10){
    override fun toString() : String {
        return name
    }
}

class Vegetables(vararg val toppings : List<String> ) : Item("Vegetables", 5) {
    override fun toString(): String{
        if(toppings.isEmpty()){
            return "$name chef's choice"
        }else{
        return name + " " + toppings.joinToString()
        }
    }
}

// create class order with integer 
class Order(val orderNumber : Int){
    
    // declare a list to hold the items 
    private val itemList = mutableListOf<Item>()

   fun addItem(newItem: Item) {
       itemList.add(newItem)
   }

   fun addAll(newItems: List<Item>) {
       itemList.addAll(newItems)
   }

   fun print() {
        println("Order #${orderNumber}")
    	var total = 0
    	for (item in itemList) {
        	println("${item}: $${item.price}")
        	total += item.price
    }
    println("Total: $${total}")
   }
}


fun main() {
    
    // test the code with this main sample now
   
  val order1 = Order(1)
    order1.addItem(Noodles())
    order1.print()

    println()

    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    order2.print()

    println()

    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    order3.print()
}





// complete code 

open class Item(val name: String, val price: Int)

class Noodles : Item("Noodles", 10) {
    override fun toString(): String {
        return name
    }
}

class Vegetables(vararg val toppings: String) : Item("Vegetables", 5) {
    override fun toString(): String {
        if (toppings.isEmpty()) {
            return "$name Chef's Choice"
        } else {
            return name + " " + toppings.joinToString()
        }
    }
}

class Order(val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Order {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order {
        itemList.addAll(newItems)
        return this
    }

    fun print() {
        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }
}

fun main() {
    val ordersList = mutableListOf<Order>()

    // Add an item to an order
    val order1 = Order(1)
    order1.addItem(Noodles())
    ordersList.add(order1)

    // Add multiple items individually
    val order2 = Order(2)
    order2.addItem(Noodles())
    order2.addItem(Vegetables())
    ordersList.add(order2)

    // Add a list of items at one time
    val order3 = Order(3)
    val items = listOf(Noodles(), Vegetables("Carrots", "Beans", "Celery"))
    order3.addAll(items)
    ordersList.add(order3)

    // Use builder pattern
    val order4 = Order(4)
        .addItem(Noodles())
        .addItem(Vegetables("Cabbage", "Onion"))
    ordersList.add(order4)

    // Create and add order directly
    ordersList.add(
        Order(5)
            .addItem(Noodles())
            .addItem(Noodles())
            .addItem(Vegetables("Spinach"))
    )

    // Print out each order
    for (order in ordersList) {
        order.print()
        println()
    }
}
