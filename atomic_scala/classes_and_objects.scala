val r = Range(0, 10)
println(r.step)

val s = Range(0, 10, 2)
println(s.step)

val t = "This is an experiment"
println(t.split(" "))

var s1 = "Sally"
var s2 = "Sally"

s2 = "Sam"

if (s1.equals(s2)) {
    println("s1 and s2 are equal.")
} else {
    println("s1 and s2 are not equal.")
}

if (s1 == "Sally") {
    println("s1 still is Sally.")
}

var s3 = s1.toUpperCase
println(s3)

if (s1.contentEquals(s3)) {
    println("s1 and s3 are equal.")
} else {
    println("s1 and s3 are not equal.")
}