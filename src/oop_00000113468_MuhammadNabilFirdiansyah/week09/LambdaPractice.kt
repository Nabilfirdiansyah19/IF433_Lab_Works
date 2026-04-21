package oop_00000113468_MuhammadNabilFirdiansyah.week09

fun main(){
    println("=== TEST LAMBDA ===")
    val subLambda = { a:Int,b:Int -> a+b}
    println("hasil sum : ${subLambda(5,10)}")

    val squareIMplicit: (Int)->Int = {it*it}
    println("hasil square : ${squareIMplicit(4)}")
}