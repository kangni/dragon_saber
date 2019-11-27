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