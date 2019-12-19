import com.atomicscala.AtomicTest._

var r1 = ""
for (i <- Range(0, 10)) {
    r1 += s"$i "
}
r1 is "0 1 2 3 4 5 6 7 8 9 "

//
var r2 = ""
for (i <- Range(0, 9).inclusive) {
    r2 += s"$i "
}
r2 is "0 1 2 3 4 5 6 7 8 9 "

//
var total = 0
for (i <- Range(0, 11)) {
    total += i
}
total is 55

//
var totalEvens = 0
for (i <- Range(0, 11, 2)) {
    println(i)
    totalEvens += i
}
totalEvens is 30

//
var totalEvens1 = 0
for (i <- Range(0, 11)) {
    if (i % 2 == 0) {
        totalEvens1 += i
    }
}
totalEvens1 is 30

//
var evens = 0
var odds = 0
// for (i <- Range(0, 11)) {
// for (i <- 0 to 10) {
for (i <- 0 until 11) {
    if (i % 2 == 0) {
        evens += i
    } else {
        odds += i
    }
}

evens is 30
odds is 25
(evens + odds) is 55