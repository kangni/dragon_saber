import com.atomicscala.AtomicTest._

class Family(args:String*) {
    def familySize():Int = {
        var cnt = 0
        for (i <- args) {
            cnt += 1
        }
        cnt
    }
}

val family1 = new Family("Mom", "Dad", "Sally", "Dick")
family1.familySize() is 4

val family2 = new Family("Dad", "Mom", "Harry")
family2.familySize() is 3

//
class FlexibleFamily(p1:String, p2:String, childs:String*) {
    def familySize():Int = {
        var cnt = 0
        if (p1.isEmpty == false) {
            cnt += 1
        }
        if (p2.isEmpty == false) {
            cnt += 1
        }
        for (i <- childs) {
            cnt += 1
        }
        cnt
    }
}

val family3 = new FlexibleFamily("Mom", "Dad", "Sally", "Dick")
family3.familySize() is 4

val family4 = new FlexibleFamily("Dad", "Mom", "Harry")
family4.familySize() is 3

val familyNoKids = new FlexibleFamily("Mom", "Dad")
familyNoKids.familySize() is 2

// exercise (4 and 5)'s solution is not true

//
class Cup(var percentFull:Int) {
    val max = 100
    def add(increase:Int):Int = {
        percentFull += increase
        if (percentFull > max) {
            percentFull = max
        }
        percentFull
    }
}

val cup = new Cup(0)
cup.add(50) is 50
cup.add(-50) is 0
cup.add(101) is 100

//
class Cup1(var percentFull:Int)
val cup1 = new Cup1(10)
cup1.percentFull is 10

//
class Cup2(var percentFull:Int) {
    val max = 100
    def increase(otherNums:Int*):Int = {
        for (i <- otherNums) {
            percentFull += i
            if (percentFull > max) {
                percentFull = max
            }
        }
        percentFull
    }
}

val cup2 = new Cup2(0)
cup2.increase(20, 30, 50, 20, 10, -10, -40, 10, 50) is 100
cup2.increase(10, 10, -10, 10, 90, 70, -70) is 30

//
def squareThem(nums:Int*):Int = {
    var result = 0
    for (i <- nums) {
        result += i * i
    }
    result
}

squareThem(2) is 4
squareThem(2, 4) is 20
squareThem(1, 2, 4) is 21