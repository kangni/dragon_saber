// values: set once and can not change
// variable: allowed to change

/* Scala style recommends that you leave
a space between the name: and the type.
*/

var name: String = "akka"

println(name)

name = "tornado"

println(name)

//

var v1:Int = 5

v1 = 10

println(v1)

val constantv1 = v1

println(v1, constantv1)

v1 = 15

println(v1, constantv1)

var v2:Int = v1

v1 = 20

println(v1, v2)
