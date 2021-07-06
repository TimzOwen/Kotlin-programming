
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