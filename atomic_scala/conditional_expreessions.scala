if (1 > 0) {
  println("It's True")
}

//
val x: Boolean = {1 > 0}

if (x) {
  println("It's True")
}

//
val y: Boolean = {0 > 1}

if (!y) {
  println("It's false")
}

//
val z: Boolean = false

if (z) {
  println("It's true")
} else {
  println("It's false")
}

//
val result = {
  if (0 > 1) {1}
  else {42}
}

println(result)



// practice

val a: Int = 1

val b: Int = 5

if (b > a) {
  println("a is less than b")
} else {
  println("b is less than a")
}
