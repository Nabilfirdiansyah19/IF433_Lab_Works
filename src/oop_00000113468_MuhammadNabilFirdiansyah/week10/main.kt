package oop_00000113468_MuhammadNabilFirdiansyah.week10

fun main (){
    println("=== TEST GENERIC CLASS ===")
    val intBox=Box(100)
    val stringBox=Box("Generics in kotlin")

    println("isi intbox: ${intBox.value}")
    println("isi stringbox: ${stringBox.value}")
}