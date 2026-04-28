package oop_00000113468_MuhammadNabilFirdiansyah.week10

fun main (){
    println("=== TEST GENERIC CLASS ===")
    val intBox=Box(100)
    val stringBox=Box("Generics in kotlin")

    println("isi intbox: ${intBox.value}")
    println("isi stringbox: ${stringBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice= PairBox("Bitcoin",65000)
    println("Aset: ${itemPrice.key}, harga: ${itemPrice.value}USD")

    println("\n=== TEST GENERIC FUNCTIONS ===")
    println(3.14)
    val result = processData("stable coin")
    println("hasil proses: $result")
}