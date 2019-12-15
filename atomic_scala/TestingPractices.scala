import com.atomicscala.AtomicTest._

val myValue1 = 20
val myValue2 = 10
val myValue3 = 10
val myValue4 = 10
val myValue5 = "10"

myValue1 is myValue2
myValue3 is myValue4
myValue2 is myValue3
myValue5 is myValue2
