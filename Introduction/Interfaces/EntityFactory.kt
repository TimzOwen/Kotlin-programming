// Companion objects 011

class EntityFactory private constructor(val id : String){
    companion object{
        fun create() = EntityFactory("id")
    }

    // Rename your companion. No casting its implicit
//    companion object Factory{
//        fun create() = EntityFactory("id")
//    }
}

fun main() {
    // create an instance of EntityFactory
    //companion objects have access to private properties

    val entityFactory = EntityFactory.Companion.create()
    //val entityFactory = EntityFactory.create()  .Companion --> Internal referenced and no need to include
}




// Companion objects storing values 012

class EntityFactory private constructor(val id : String){
    
    companion object{
        
        const val id = "id"
        fun create() = EntityFactory(id)
    }

}

fun main() {

    val entityFactory = EntityFactory.Companion.create()
    EntityFactory.id
}



// Companion objects inheritance 013

interface IdProvider{
    fun getId() : String
}

class EntityFactory private constructor(val id : String){

    companion object : IdProvider{

        const val id = "id"

        override fun getId(): String {
            return "12345"
        }
        fun create() = EntityFactory(getId())
    }

}

fun main() {

    val entityFactory = EntityFactory.Companion.create()
    EntityFactory.id
}




// Objects declaration 014
// useful in creating thread safe execution

object EntityFactory{

    fun create() = Entity("id","name")
}

class Entity constructor(val id : String, val name : String){
    override fun toString(): String {
        return "id: $id name: $name"
    }

}

fun main() {

    val entityFactory = EntityFactory.create()
    println(entityFactory)

}


//
// Enum classes  015
// helps generate unique identifiers

import java.util.*

enum class EntityType{
    EASY,MEDIUM,HARD
}

object EntityFactory{

    fun create(type : EntityType) : Entity{
        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> "Easy"
            EntityType.MEDIUM -> "Medium"
            EntityType.HARD -> "Hard"
        }
        return Entity(id,name)
    }
}

class Entity constructor(val id : String, val name : String){
    override fun toString(): String {
        return "id: $id name: $name"
    }

}

fun main() {

    val entityFactory = EntityFactory.create(EntityType.EASY)
    println(entityFactory)

    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)

}




// Enum classes  015 (simplified)
// control over formatting in Enums.
// helps generate unique identifiers

import java.util.*

enum class EntityType{
    EASY,MEDIUM,HARD;

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
        }
        return Entity(id,name)
    }
}

class Entity constructor(val id : String, val name : String){
    override fun toString(): String {
        return "id: $id name: $name"
    }

}

fun main() {

    val entityFactory = EntityFactory.create(EntityType.EASY)
    println(entityFactory)

    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)

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
        print("They are not equal")
    }


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

    val entity1 = Entity.Easy(id,name)
    val entity2 = Entity.Easy(id, name)

    if (entity1 == entity2){
        println("They are Equal")
    }else{
        print("They are not equal")
    }


}



// Data Classes  017
// cop from main funtion
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

    val entity1 = Entity.Easy("id","name")
    val entity2 = entity1.copy()

    if (entity1 == entity2){
        println("They are Equal") // true
    }else{
        print("They are not equal")
    }

}




// Data Classes  017
// cop from main funtion (change an entity)
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

    val entity1 = Entity.Easy("id","name")
    val entity2 = entity1.copy(name = "new name")

    if (entity1 == entity2){
        println("They are Equal") 
    }else{
        print("They are not equal") /// True
    }

}


// Data Classes  017
// referential equallity sign

import Entity.Help.name
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

    val entity1 = Entity.Easy("id","name")
    val entity2 = Entity.Easy("id,""name")

    if (entity1 === entity2){
        println("They are Equal")
    }else{
        print("They are not equal") // True
    }


}



// Extension Function / properties 020

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

fun Entity.Medium.printInfo(){
    println("Medium class $id")
}

fun main() {

    val entity1 = Entity.Easy("id","name")
    val entity2 = entity1.copy(name="new name")

    //reference of medium class function
    Entity.Medium("id","name").printInfo()

    if (entity1 == entity2){
        println("They are Equal")
    }else{
        print("They are not equal")
    }


}





// Extension Function / properties 021



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

fun Entity.Medium.printInfo(){
    println("Medium class $id")
}

//add properties
val Entity.Medium.info : String
    get() = "some info"

fun main() {

    val entity1 = Entity.Easy("id","name")
    val entity2 = EntityFactory.create(EntityType.MEDIUM)
    if(entity2 is Entity.Medium){
        entity2.printInfo()
        entity2.info
    }



}

