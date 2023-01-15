
fun main() {

    var count: Int = 0 // changing variable
    val number: Int = 2 // cannot change values
    var age = 49 // you can ommit the invertion type IDE atumatically maps it.

    val myInt = 400 // default when not specified . 32 bit
    val myLong: Long = 123_123_123L // long it 62 bit
    val myByte: Byte = 127 // 8bit
    val myshort: Short = 32767 // 16 bits

    val myDouble: Double = 1232.456 // 64 bits
    val myFloat: Float = 123.342F  // must specify for float value . 32bits
    val alsoDouble = 105.2

    val asInt = alsoDouble.toInt()  // type conversion to int
    val asFloat = myLong.toFloat()  // type conversion to float
}