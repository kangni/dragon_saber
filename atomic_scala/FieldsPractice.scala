import com.atomicscala.AtomicTest._

class Cup4 {
    var percentFull = 0

    def set(param:Int):Int = {
        percentFull = param
        percentFull
    }

    def get():Int = { percentFull }
}

val cup4 = new Cup4
cup4.set(56)
cup4.get() is 56