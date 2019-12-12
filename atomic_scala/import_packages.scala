/*
Every duplication is a place to make another mistake.
*/

import util.Random, util.Properties

val r = new Random
println(r.nextInt(10))
println(r.nextInt(10))
println(r.nextInt(10))


//
val p = Properties
println(p.isMac)

//
import util.{ Random => Bob,
Properties => Jill}

val r1 = new Bob
val p1 = Jill
println(r1.nextInt(10))
println(p1.isMac)

//
import util._

val r2 = new Random
val p2 = Properties
println(r2.nextInt(10))
println(p2.isMac)

//
//only use in one place
val r3 = new util.Random
val p3 = util.Properties
println(r3.nextInt(10))
println(p3.isMac)



