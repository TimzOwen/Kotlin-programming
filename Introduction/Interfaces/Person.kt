//Interface (001)
//class modifiers

// direct initialisation from constructor
class Person(val fName:String="Code" , val sName : String="Ninja"){

    // protected --> only available within the class or sub class not outside the file

    var nickName : String? = null
        //setter
        set(value) {
            field = value
            println("new name is $nickName")
        }
        //getter
        get() {
            println("returned value is $field")
            return field
        }

    // private / protected method will only be accessed here within the file

    fun printUserInfo(){
        //create a var to check for null value (use office operator)
        var nickNameToPrint = nickName ?: "No nickName"
        println("Hello $fName ($nickNameToPrint) $sName")
    }
}


//Interface 002

//class modifiers

// direct initialisation from constructor
class Person(val fName:String="Code" , val sName : String="Ninja"){

    // protected --> only available within the class or sub class not outside the file

    var nickName : String? = null
        //setter
        set(value) {
            field = value
            println("new name is $nickName")
        }
        //getter
        get() {
            println("returned value is $field")
            return field
        }

    // private / protected method will only be accessed here within the file

    fun printUserInfo(){
        //create a var to check for null value (use office operator)
        var nickNameToPrint = nickName ?: "No nickName"
        println("Hello $fName ($nickNameToPrint) $sName")
    }
}