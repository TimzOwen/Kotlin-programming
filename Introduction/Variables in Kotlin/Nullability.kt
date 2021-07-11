// Nullability

fun main() {

    // Var that is not null --> you cannot reassign the value to null
    var myName : String = "Owen"
    //myName = null  // Error . Null cannot be a value of null

    // use the ? to tell the compile that the value can be null
    var myNullCheck : String? = "I can be Null"
    myNullCheck = null

    //Null check
    var length = 0
    if (myNullCheck != null){
        length = myNullCheck.length
    }else{
        length = -1
    }
    println(length)



    // null check simplified:

     // use the ? to tell the compile that the value can be null
    var myNullCheck : String? = "I can be Null"
    myNullCheck = null

    // null check simplified:

    val lengthCheck = if(myNullCheck != null) myNullCheck.length else -1
    println(lengthCheck)
 



    //NULL CHECK WITH SAFETY OPERATOR 

    // use the ? to tell the compile that the value can be null
    var myNullCheck : String? = "I can be Null"
    myNullCheck = null      // comment this and try out 


    // Null check with safe call operator ?:
    println(myNullCheck?.length)



    // NULL CHECK WITH ELVIS OPERATOR

    var myNullCheck : String? = "I can be Null"
    myNullCheck = null      // comment this and try out

    val len = myNullCheck?.length ?: -1
    val len2 = myNullCheck?.length ?: "No name here"

    println(len)
    println(len2)


    // 


}

