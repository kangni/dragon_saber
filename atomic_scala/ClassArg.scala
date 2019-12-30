import com.atomicscala.AtomicTest._

class ClassArg(a:Int) {
    println(f)
    def f():Int = {
        a * 10
    }
}

class ClassArg2(var a:Int)
class ClassArg3(val a:Int)

val ca = new ClassArg(19)
ca.f() is 190

val ca2 = new ClassArg2(20)
val ca3 = new ClassArg3(21)

ca2.a is 20
ca3.a is 21

ca2.a = 24
ca2.a is 24

//ca3.a = 42

//
class Sum3(a:Int, b:Int, c:Int) {
    def result():Int = {
        a + b + c
    }
}

new Sum3(3, 4, 5).result() is 12


//
class Sum(args:Int*) {
    def result():Int = {
        var total = 0
        for (n <- args) {
            total += n
        }
        total
    }
}

new Sum(13, 27, 44).result() is 84
new Sum(3, 4, 5).result() is 12
