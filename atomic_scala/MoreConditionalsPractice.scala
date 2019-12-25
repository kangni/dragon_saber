import com.atomicscala.AtomicTest._

def isPalindrome(s:String):Boolean = {
    val new_s = s.toLowerCase()
    if (new_s == new_s.reverse) {
        return true
    }
    false
}

isPalindrome("mom") is true
isPalindrome("dad") is true
isPalindrome("street") is false

isPalindrome("Mom") is true
isPalindrome("DAD") is true

//
def isPalIgnoreSpecial(s:String):Boolean = {
    var createdStr = ""

    val numA = 65
    val num_z = 122
    val num_0 = 48
    val num_9 = 57

    for (c <- s) {
        val theValue = c.toInt
        if (theValue > numA - 1 && theValue < num_z + 1) {
            createdStr += c
        } else if (theValue > num_0 - 1 && theValue < num_9 + 1) {
            createdStr += c
        }
    }

    if (createdStr.toUpperCase == createdStr.reverse.toUpperCase) {
        return true
    }
    false
}

isPalIgnoreSpecial("Madam I'm adam") is true
isPalIgnoreSpecial("trees") is false