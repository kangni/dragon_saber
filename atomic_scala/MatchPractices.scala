import com.atomicscala.AtomicTest._

def matchColor(color:String):String = {
    var COLOR = ""
    if (color == "red") {
        COLOR = "RED"
    }
    else if (color == "blue") {
        COLOR = "BLUE"
    }
    else if (color == "green") {
        COLOR = "GREEN"
    }
    else {
        COLOR = s"UNKNOWN COLOR: $color"
    }
    COLOR
}

matchColor("white") is "UNKNOWN COLOR: white"
matchColor("blue") is "BLUE"

//
def oneOrTheOther(exp:Boolean):String = {
    exp match {
        case true => "True"
        case _ => "It's false"
    }
}

val v = Vector(1)
val v2 = Vector(1, 2)
oneOrTheOther(v == v.reverse) is "True"
oneOrTheOther(v2 == v2.reverse) is "It's false"

//
def checkTruth(exp1:Boolean, exp2:Boolean):String = {
    (exp1, exp2) match{
        case (true, true) => "Both are true"
        case (true, false) => "First: true, second: false"
        case (false, true) => "First: false, second: true"
        case _ => "Both are false"
    }
}

checkTruth(true || false, true) is "Both are true"
checkTruth(1 > 0 && -1 < 0, 1 == 2) is "First: true, second: false"
checkTruth(1 >= 2, 1 >= 1) is "First: false, second: true"
checkTruth(true && false, false && true) is "Both are false"

//
def forecase(n:Int):String = {
    n match {
        case 100 => "Sunny"
        case  80 => "Mostly Sunny"
        case  50 => "Partly Sunny"
        case  20 => "Mostly Cloudy"
        case   0 => "Cloudy"
        case   _ => "Unknown"
    }
}

forecase(100) is "Sunny"
forecase(80) is "Mostly Sunny"
forecase(50) is "Partly Sunny"
forecase(20) is "Mostly Cloudy"
forecase(0) is "Cloudy"
forecase(15) is "Unknown"

//
val sunnyData = Vector(100, 80, 50, 20, 0, 15)
for (i <- sunnyData) {
    println(s"forecast($i) is " + forecase(i))
}