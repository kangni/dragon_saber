import com.atomicscala.AtomicTest._

def matchColor(color:String):String = {
    color match {
        case "red" => "RED"
        case "blue" => "BLUE"
        case "green" => "GREEN"
        case _ => s"UNKNOWN COLOR: $color"
    }
}

matchColor("green") is "GREEN"
matchColor("pink") is "PINK"