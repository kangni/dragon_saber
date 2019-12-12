import com.atomicscala.pythagorean.{RightTriangle, EquilateralTriangle}

val rt = new RightTriangle
val et = new EquilateralTriangle
val hypotenuse = rt.hypotenuse(3, 4)
val rt_area = rt.area(3, 4)
val et_area = et.area(5)
println(hypotenuse)
println(rt_area)
println(et_area)

assert(hypotenuse == 5, "wrong")
assert(rt_area == 6, "wrong")

assert(et_area == 10.825317547305481, "wrong")
