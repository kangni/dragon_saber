import com.atomicscala.AtomicTest._

def trueOrFalse(exp:Boolean):String = {
    if(exp) {
        return "It's true!"
    }
    "It's false!"
}

val b = 1
trueOrFalse(b > 0) is "It's true!"
trueOrFalse(b < 0) is "It's false!"