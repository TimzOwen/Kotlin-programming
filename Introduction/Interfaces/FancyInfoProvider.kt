// Inheritance 008

// add open to the class you want to inherit from since classes are always closed in kotlin

class FancyInfoProvider : BasicProviderInfo() {
    override val providerInfo: String
        get() = "inherited and override class info"

}



// Inheritance  print info 009

// override print info

// add open to the class you want to inherit from since classes are always closed in kotlin

class FancyInfoProvider : BasicProviderInfo() {

    override val providerInfo: String
        get() = "inherited and override class info"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy info")
    }
}




// Inheritance  print info 010

// override print info

// add open to the class you want to inherit from since classes are always closed in kotlin

class FancyInfoProvider : BasicProviderInfo() {

    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override val providerInfo: String
        get() = "inherited and override class info"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy info")
    }

}



// Object Expression  011

// override print info

// add open to the class you want to inherit from since classes are always closed in kotlin

class FancyInfoProvider : BasicProviderInfo() {

    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override val providerInfo: String
        get() = "inherited and override class info"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy info")
    }

}





 