import com.atomicscala.AtomicTest._

class Sentence {
    var s = ""
    var v1 = Vector(
        "The", "dog", "visited", "the", "firehouse")

    def theString():String = {
        for (i <- v1) {
            println(i.reverse)
            s += s"$i "
        }
        s.replace("firehouse ", "firehouse!")
    }

    def theReverseString():String = {
        var reversed_v1 = v1.reverse
        for (i <- reversed_v1) {
            s += s"\n$i"
        }
        s
    }
}

//val sentence = new Sentence
//sentence.theString() is "The dog visited the firehouse!"

val sentence1 = new Sentence
println(sentence1.theReverseString())

//
var v1 = Vector(1, 2, 3)
v1.sum is 6
v1.min is 1
v1.max is 3

//
var v2 = Vector(1.1, 2.2, 3.3)
v2.sum is 6.6
v2.min is 1.1
v2.max is 3.3

//
var v3 = Range(0, 10, 2)
v3.sum is 20

//
var l = List("mutable", "immutable")
var s = Set("mutable", "mutable")
println(l.reverse)
println(l.sorted)

// hashCode are equal
var a = Vector(1, 2, 3, 4)
var b = Vector(1, 2, 3, 4)
a is b