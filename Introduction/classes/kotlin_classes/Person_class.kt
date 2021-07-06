
class Person(_fName:String , _sName : String){
    val firsName : String
    val secondName : String

    // initialize the values
    init {
        firsName = _fName
        secondName = _sName
    }



    // can be simplified to 
    class Person(_fName:String , _sName : String){
    val firsName : String = _fName
    val secondName : String = _sName
    
    }
}



//class (002)

// direct initialisation from primary constructor

class Person(val fName:String , val sName : String){

}

// CLASS (003)
//CLASS (003)
//SECONDARY CONSTRUCTOR

// direct initialisation from constructor
class Person(val fName:String , val sName : String){

    init {
        println(" init one")
    }

    // secondary constructor --> : -> calls primary constructor
    
    constructor() : this("Timz","Owen"){
        println("secondary constructor")
    }

    init {
        println("init two")
    }


//CLASS (004)
//Default constructors

// direct initialisation from constructor
class Person(val fName:String="Code" , val sName : String="Ninja")



//CLASS (005)
//class properties (getter and setter for not default values)

// direct initialisation from constructor
class Person(val fName:String="Code" , val sName : String="Ninja"){

    var nickName : String? = null
        //setter
        set(value) {
            field = value   // field is keyword used to implement the updates  
            println("new name is $nickName")
        }
        //getter
        get() {
            println("returned value is $field")
            return field
        }
}



//CLASS (006)
//class properties & methods

// direct initialisation from constructor
class Person(val fName:String="Code" , val sName : String="Ninja"){

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
    //method to print user names
    fun printUserInfo(){
        println("Hello $fName ($nickName) $sName")
    }
}



//CLASS (006 - a)
//class properties & methods ( with nick name not null)

// direct initialisation from constructor
class Person(val fName:String="Code" , val sName : String="Ninja"){

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
    //method to print user names ( first check if null)
    fun printUserInfo(){
        //create a var to check for null values

        println("Hello $fName ($nickName) $sName")
    }
}




//CLASS (006 - b)
//class properties & methods ( with nick name null)

// direct initialisation from constructor
class Person(val fName:String="Code" , val sName : String="Ninja"){

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
    //method to print user names ( first check if null)
    fun printUserInfo(){
        //create a var to check for null values
        var nickNameToPrint = if(nickName != null) nickName else "No nickName"
        println("Hello $fName ($nickNameToPrint) $sName")
    }
}


//CLASS (006 - c)
//class properties & methods ( with nick name null) - ofice operator

// direct initialisation from constructor
class Person(val fName:String="Code" , val sName : String="Ninja"){

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
    //method to print user names ( first check if null)
    fun printUserInfo(){
        //create a var to check for null value (use office operator)
        var nickNameToPrint = nickName ?: "No nickName"
        println("Hello $fName ($nickNameToPrint) $sName")
    }
}

























}