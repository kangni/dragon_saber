// multiply by two

def multiplyByTwo(x:Int):Int = {
	println("Inside multiplyByTwo")
	x * 2
}

var r = multiplyByTwo(5)
println(r)

def addMultiply(x:Int, y:Double, s:String):Double = {
	println(s)
	(x + y) * 2.1
}

val r2:Double = addMultiply(7, 9, "Inside addMultiply.")

println(r2)


// Note that test returns nothing, so we explicitly declare the
// return type as Unit.
def test(x:Int, y:Double, s:String, expected:Double):Unit = {
	val result = addMultiply(x, y, s)
	assert(result == expected,
	"Expected " + expected +
	" Got " + result)
	println("result: " + result)
}

test(7, 9, "Inside addMultiply", 33.6)

//
def getSquare(x:Int):Int = {
	x * x
}

val a = getSquare(3)
assert(a == 9, "wrong")
val b = getSquare(6)
assert(b == 36, "wrong")
val c = getSquare(5)
assert(c == 25, "wrong")

//
def getSquareDouble(x:Double):Double = {
	x * x
}

val sd1 = getSquareDouble(1.2)
assert(1.44 == sd1, "wrong")
val sd2 = getSquareDouble(5.7)
assert(32.49 == sd2, "wrong")

//
def isArg1GreaterThanArg2(x:Double, y:Double):Boolean = {
	if (x > y) {
		true
	} else {
		false
	}
}


val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert(t1 == false, "wrong")
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert(t2 == true, "wrong")

//
def getMe(s:String):String = {
	s.toLowerCase()
}

val g1 = getMe("LaTeX")
assert("latex" == g1, "wrong")
val g2 = getMe("OAuth 2")
assert(g2 == "oauth 2", "wrong")

//
def addString(s1:String, s2:String):String = {
	s1 + s2
}

val s1 = addString("Sca", "la")
assert(s1 == "Scala", "wrong")
val s2 = addString("Hello ", "World")
assert(s2 == "Hello World", "wrong")

//
def manyTimesString(s:String, cnt:Int):String = {
	s * cnt
}

val m = manyTimesString("if err != nil ", 2)
assert(m == "if err != nil if err != nil ", "wrong")

//
def bmiStatus(height:Double, weight:Int):String = {
	val bmi = weight / (height * height)
	if (bmi < 18.5) {
		"Under weight"
	} else if (bmi < 25) {
		"Normal weight"
	} else {
		"Over weight"
	}
}

val normal = bmiStatus(1.60, 60)
assert(normal == "Normal weight", "wrong")
val overweight = bmiStatus(1.80, 180)
assert(overweight == "Over weight", "wrong")
val underweight = bmiStatus(1.70, 50)
assert(underweight == "Under weight", "wrong")
