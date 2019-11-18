// BMI

val kg = 55
val heightM = 1.72

val bmi = kg/(heightM * heightM)

if (bmi < 18.5) println("Under weight")
else if (bmi < 25) println("Normal weight")
else println("Over weight")


//
val sunny = true
val hoursSleep = 6
val exercise = false
val temp = 55

val happy1 = sunny && temp > 50 ||
exercise && hoursSleep > 7
println(happy1)

// when you're not sure what evaluation order that scala will
// choose, use parentheses to force your intention.
val sameHappy1 = (sunny && temp > 50) ||
(exercise && hoursSleep > 7)
println(sameHappy1)

val notSame =
  (sunny && temp > 50 || exercise) &&
hoursSleep > 7
println(notSame)

//

// convert fahrenheit to celsius
val temp1 = 80
val temp2 = (temp1 - 32) * (5 / 9.0)
println(temp2)

// convert celsius to fahrenheit
val temp3 = temp2 * (9 / 5.0) + 32
println(temp3)
