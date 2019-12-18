import com.atomicscala.AtomicTest._

// to
var result = ""
for (i <- 0 to 5) {
    //result += i + " "
    result += s"$i "
}
result is "0 1 2 3 4 5 "

// until
result = ""
for (i <- 0 until 5) {
    result += s"$i "
}
result is "0 1 2 3 4 "

// Range
result = ""
for (i <- Range(0, 5)) {
    result += s"$i "
}
result is "0 1 2 3 4 "

// Range with step
result = ""
for (i <- Range(0, 10, 2)) {
    result += s"$i "
}
result is "0 2 4 6 8 "

//
var sum = 0
for (i <- Range(0, 10, 2)) {
    println(s"adding $i to $sum")
    sum += i
}
sum is 20