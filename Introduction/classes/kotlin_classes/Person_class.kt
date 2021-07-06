
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
            field = value
            println("new name is $nickName")
        }
        //getter
        get() {
            println("returned value is $field")
            return field
        }
}






























}