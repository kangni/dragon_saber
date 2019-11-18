val activity = "swimming"
val hour = 10

val isOpen = {
  if (activity == "swimming" || activity == "ice skating") {
    val opens = 9
    val closes = 20
    println("Operating hours: " + opens + " - " + closes)
    if (hour >= opens && hour <= closes) {
      true
    } else {
      false
    }
  } else {
    true
  }
}

println(isOpen)

//

val a = 1
val b = 6
val c = 5

if (a <= c && b <= c) {
  println("both are")
} else {
  println("one is and one isn't")
}
