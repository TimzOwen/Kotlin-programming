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


//Interface 003

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



// Multiple interface(005)

//Double Interface implementation

interface PersonInfoProvider{
    val providerInfo : String
    fun printInfo(person : Person) {
        println(providerInfo)
        person.printUserInfo()
    }
}

//interface 2
interface sessionInfoProvider{
    fun getSessionid() : String
}

// " : " ---> used to show implementation
class BasicProviderInfo : PersonInfoProvider, sessionInfoProvider{
    override val providerInfo: String
        get() = "Basic info provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionid(): String {
        return "SessionId"
    }
}

fun main() {
    val provider = BasicProviderInfo()

    provider.printInfo(Person())
    provider.getSessionid()
}



// Multiple Interfaces 005

//Double interface implementation

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



// Sealed Classes  016
// helps define restricted class hierarchy

import java.util.*

enum class EntityType{
    HELP,EASY,MEDIUM,HARD;

    //to allow control over, add ,ethod
    fun getFormattedEnum() = name.toLowerCase().capitalize()
}

object EntityFactory{

    fun create(type : EntityType) : Entity{
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedEnum()
            EntityType.HARD -> "Hard"
            EntityType.HELP -> type.getFormattedEnum()
        }
        return when(type){
            EntityType.EASY -> Entity.Easy(id,name)
            EntityType.MEDIUM -> Entity.Medium(id,name)
            EntityType.HARD -> Entity.Hard(id,name,2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

sealed class Entity (){
    object Help : Entity(){
        val name = "Help"
    }
    // add data class
    data class Easy(val id : String, val name : String) : Entity()
    data class Medium(val id : String, val name : String) : Entity()
    data class Hard(val id : String, val name : String, val multiplier : Float) : Entity()

}

fun main() {

    val entityFactory = EntityFactory.create(EntityType.HELP)
    val msg = when(entityFactory){
        Entity.Help -> "Help class"
        is Entity.Easy -> "Easy class"
        is Entity.Medium -> "Medium class"
        is Entity.Hard -> "Hard class"
    }
    println(msg)

}



// Data Classes  017
// helps provide concise immutable data types
// allows to perform quality comparison between classes or instances

import java.util.*

enum class EntityType{
    HELP,EASY,MEDIUM,HARD;

    //to allow control over, add ,method
    fun getFormattedEnum() = name.toLowerCase().capitalize()
}

object EntityFactory{

    fun create(type : EntityType) : Entity{
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedEnum()
            EntityType.HARD -> "Hard"
            EntityType.HELP -> type.getFormattedEnum()
        }
        return when(type){
            EntityType.EASY -> Entity.Easy(id,name)
            EntityType.MEDIUM -> Entity.Medium(id,name)
            EntityType.HARD -> Entity.Hard(id,name,2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

sealed class Entity (){
    object Help : Entity(){
        val name = "Help"
    }
    // add data class
    data class Easy(val id : String, val name : String) : Entity()
    data class Medium(val id : String, val name : String) : Entity()
    data class Hard(val id : String, val name : String, val multiplier : Float) : Entity()

}

fun main() {

    val entity1 = EntityFactory.create(EntityType.EASY)
    val entity2 = EntityFactory.create(EntityType.EASY)

    if (entity1 == entity2){
        println("They are Equal")
    }else{
        print("They are not equal") // they are not same because each time a new value is generated 
    }


}


// Data Classes  017 ( change entity to Id and name in main function)
// helps provide concise immutable data types
// allows to perform quality comparison between classes or instances

import java.util.*

enum class EntityType{
    HELP,EASY,MEDIUM,HARD;

    //to allow control over, add ,method
    fun getFormattedEnum() = name.toLowerCase().capitalize()
}

object EntityFactory{

    fun create(type : EntityType) : Entity{
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedEnum()
            EntityType.HARD -> "Hard"
            EntityType.HELP -> type.getFormattedEnum()
        }
        return when(type){
            EntityType.EASY -> Entity.Easy(id,name)
            EntityType.MEDIUM -> Entity.Medium(id,name)
            EntityType.HARD -> Entity.Hard(id,name,2f)
            EntityType.HELP -> Entity.Help
        }
    }
}

sealed class Entity (){
    object Help : Entity(){
        val name = "Help"
    }
    // add data class
    data class Easy(val id : String, val name : String) : Entity()
    data class Medium(val id : String, val name : String) : Entity()
    data class Hard(val id : String, val name : String, val multiplier : Float) : Entity()

}

fun main() {

    val entity1 = Entity.Easy(id, name)
    val entity2 = Entity.Easy(id,name)


    if (entity1 == entity2){
        println("They are Equal")   // Returns they are same
    }else{
        print("They are not equal")
    }


}




