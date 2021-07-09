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


// interface(003)

//abstract class--> It doesn't need to implement all the methods of a class

interface PersonInfoProvider{
    val providerInfo : String
    fun printInfo(person : Person) {
        println(providerInfo)
        person.printUserInfo()
    }
}

// " : " ---> used to show implementation
class BasicProviderInfo : PersonInfoProvider{
    override val providerInfo: String
        get() = "BasicInfoProvider"
}

fun main() {
    val provider = BasicProviderInfo()

    provider.printInfo(Person())
}






// Type checking (006)

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

    // call the checker
    typeCheck(provider)
}

// type checking
fun typeCheck(infoProvider: PersonInfoProvider){
    if (infoProvider is sessionInfoProvider){
        println("It is a session provider info")
    }else{
        println("Not a session provider info")
    }
}



// Type casting (007)

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

    // call the checker
    typeCheck(provider)
}

// type checking
// as -> Keyword used for casting types

fun typeCheck(infoProvider: PersonInfoProvider){
    if (infoProvider is sessionInfoProvider){
        println("It is a session provider info")
        (infoProvider as sessionInfoProvider).getSessionid()    // Explicit casting
        // or allow the compiler to use smart cast and just call methods
        // infoProvider.getSessionid()
    }else{
        println("Not a session provider info")
    }
}




// Inheritance 008

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
open class BasicProviderInfo : PersonInfoProvider, sessionInfoProvider{
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
    val provider = FancyInfoProvider()

    provider.printInfo(Person())
    provider.getSessionid()

    // call the checker
    typeCheck(provider)
}

// type checking
// as -> Keyword used for casting types

fun typeCheck(infoProvider: PersonInfoProvider){
    if (infoProvider is sessionInfoProvider){
        println("It is a session provider info")
        (infoProvider as sessionInfoProvider).getSessionid()    // Explicit casting
        // or allow the compiler to use smart cast and just call methods
        // infoProvider.getSessionid()
    }else{
        println("Not a session provider info")
    }
}





// Inheritance override print info 009

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
open class BasicProviderInfo : PersonInfoProvider, sessionInfoProvider{
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
    val provider = FancyInfoProvider()

    provider.printInfo(Person())
    provider.getSessionid()

    // call the checker
    typeCheck(provider)
}

// type checking
// as -> Keyword used for casting types

fun typeCheck(infoProvider: PersonInfoProvider){
    if (infoProvider is sessionInfoProvider){
        println("It is a session provider info")
        (infoProvider as sessionInfoProvider).getSessionid()    // Explicit casting
        // or allow the compiler to use smart cast and just call methods
        // infoProvider.getSessionid()
    }else{
        println("Not a session provider info")
    }
}




// Inheritance override print info 010

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
open class BasicProviderInfo : PersonInfoProvider, sessionInfoProvider{

    protected open val sessionIdPrefix = "SessionId" // we protect it to prevent access from outside
    
    override val providerInfo: String
        get() = "Basic info provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionid(): String {
        return sessionIdPrefix
    }
}

fun main() {
    val provider = FancyInfoProvider()

    provider.printInfo(Person())
    provider.getSessionid()

    // call the checker
    typeCheck(provider)
}

// type checking
// as -> Keyword used for casting types

fun typeCheck(infoProvider: PersonInfoProvider){
    if (infoProvider is sessionInfoProvider){
        println("It is a session provider info")
        (infoProvider as sessionInfoProvider).getSessionid()    // Explicit casting
        // or allow the compiler to use smart cast and just call methods
        // infoProvider.getSessionid()
    }else{
        println("Not a session provider info")
    }
}





// Object Expression  011
// allows creating anonymous object class

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
open class BasicProviderInfo : PersonInfoProvider, sessionInfoProvider{

    protected open val sessionIdPrefix = "SessionId" // we protect it to prevent access from outside

    override val providerInfo: String
        get() = "Basic info provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionid(): String {
        return sessionIdPrefix
    }
}

fun main() {
    val provider = object : PersonInfoProvider{
        override val providerInfo: String
            get() = "new info provider"

        fun getSessionid() = "id"
    }


    provider.printInfo(Person())
    provider.getSessionid()

    // call the checker
    typeCheck(provider)
}

// type checking
// as -> Keyword used for casting types

fun typeCheck(infoProvider: PersonInfoProvider){
    if (infoProvider is sessionInfoProvider){
        println("It is a session provider info")
        (infoProvider as sessionInfoProvider).getSessionid()    // Explicit casting
        // or allow the compiler to use smart cast and just call methods
        // infoProvider.getSessionid()
    }else{
        println("Not a session provider info")
    }
}



//








