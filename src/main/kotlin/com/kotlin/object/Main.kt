package com.kotlin.`object`

//// declaration of a single object.
//object Numeric{
//    // Object members
//    var a: Int = 0
//    var b:Int = 1
//    // Object Method/ Function
//    fun makeme20():Int{
//        a = 20
//        return a
//    }
//}
//
//fun main(){
//    var res:Int
//    res = Numeric.makeme20()
//
//    println("b = ${Numeric.b}")
//    println("result = $res")
//}

//class Myclass(){
//    protected var i:Int = 0
//}

//object Counter{
//    var count: Int = 0
//    fun currentCount() = count
//    fun increment(){
//      ++count
//    }
//
//    init{
//        println("Game is about to start. Get ready for it to play.")
//    }
//}
//
//fun main(){
//    // Declaration of Object Expression
//    var counter = object {
//        var count: Int =0
//        fun currentCount() = count
//        fun increment() = ++count
//    }
//
//    counter.increment()
//    println(counter.currentCount())
//
//    counter.increment()
//    println(counter.currentCount())
//
////    println(Counter.count)
//}


class SomeClass{
    companion object{
        var count: Int = 0
        fun count(){
            count++
        }
    }
}

class AnotherClass{
    companion object Counter {
        var count: Int = 0
        fun count() {
            count++
        }
    }
}

fun main()
{
    // Without Name
    SomeClass.count()
    println(SomeClass.count)

    // With Name
    AnotherClass.count()
    println(AnotherClass.count)

}

