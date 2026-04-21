package oop_00000113468_MuhammadNabilFirdiansyah.week09

fun main(){
    val numbers = listOf(1,2,3,4,5,6,7,8)
    println("original data : ${numbers}")
    println("\n=== HOF: FILTER ===")
    val evens=numbers.filter { it % 2 == 0 }
    println("evens only : $evens")
}