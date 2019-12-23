import com.atomicscala.AtomicTest._

val v1 = Vector(1, 3, 5, 7, 9)
v1 is Vector(1, 3, 5, 7, 9)

v1(4) is 9

// breath of fresh air - it seems to be saying, "How can I serve you?"
// instead of cracking a whip and forcing you to jump through hoops.
// 2333
var result = ""
for (i <- v1) {
    result += s"$i "
}
result is "1 3 5 7 9 "

//
val v2 = Vector(1.1, 2.2, 3.3, 4.4)
v2.reverse is Vector(4.4, 3.3, 2.2, 1.1)

var v3 = Vector("D", "C", "B", "A")
v3 is Vector("D", "C", "B", "A")

// sorted in place
v3.sorted is Vector("A", "B", "C", "D")

println(v2)
println(v3)

v3.head is "D"
v3.tail is Vector("C", "B", "A")
println(v3)