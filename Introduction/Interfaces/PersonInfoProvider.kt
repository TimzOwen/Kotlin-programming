// interface(001)

//abstract class--> It doesn't need to implement all the methods of a class

interface PersonInfoProvider{
    fun printInfo(person : Person)
}

// " : " ---> used to show implementation

class BasicProviderInfo : PersonInfoProvider{
    override fun printInfo(person: Person) {
       
    }    
}

fun main() {
    val provider = BasicProviderInfo()
}

// interface(002)

//abstract class--> It doesn't need to implement all the methods of a class

interface PersonInfoProvider{
    fun printInfo(person : Person)
}

// " : " ---> used to show implementation
class BasicProviderInfo : PersonInfoProvider{
    override fun printInfo(person: Person) {
        println("print info")
        person.printUserInfo()
    }
}

fun main() {
    val provider = BasicProviderInfo()

    provider.printInfo(Person())
}


