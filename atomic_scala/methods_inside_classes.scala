class Cat {
    def meow():String = { "mew!" }
}

val cat = new Cat
val m1 = cat.meow()
println(m1)
assert(m1 == "mew!", "Expected mew!, Got " + m1)

//
class Hamster {
    def speak():String = { "squeak!" }

    def exercise():String = {
        speak() + " Running on wheel"
    }
}

val hamster = new Hamster
val e1 = hamster.exercise()
println(e1)
assert(
    "squeak! Running on wheel" == e1,
    "Expected squeak! Running on wheel" +
    ", Got" + e1
)


//
class Sailboat {
    def raise():String = { "Sails raised." }

    def lower():String = { "Sails lowered." }
}

val sailboat = new Sailboat

val r1 = sailboat.raise()
println(r1)
assert(r1 == "Sails raised.",
"Expected Sails raised, Got " + r1)

val r2 = sailboat.lower()
println(r2)
assert(r2 == "Sails lowered.",
"Expected Sails lowered, Got " + r2)


//
class Motorboat {
    def on():String = { "Motor on." }

    def off():String = { "Motor off." }
}

val motorboat = new Motorboat

val s1 = motorboat.on()
println(s1)
assert(s1 == "Motor on.",
"Expected Motor on, Got " + s1)

val s2 = motorboat.off()
println(s2)
assert(s2 == "Motor off.",
"Expected Motor off, Got " + s2)

//
class Flare {
    def light():String = { "Flare used." }
}

val flare = new Flare
val f1 = flare.light
println(f1)
assert(f1 == "Flare used.",
"Expected Flare used! Got" + f1)

//
class Sailboat2 {
    def signal():String = {
        val f = new Flare
        f.light()
    }
}

val sailboat2 = new Sailboat2
val signal = sailboat2.signal()
println(signal)
assert(signal == "Flare used.",
"Expected Flare used! Got" + signal)