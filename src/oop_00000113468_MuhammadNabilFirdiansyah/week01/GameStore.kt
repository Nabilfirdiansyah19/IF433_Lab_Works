package oop_00000113468_MuhammadNabilFirdiansyah.week01

fun main(){
    val gameTitle ="PUBG"
    val price =700000
    val discount =calculateDiscount(price)
    val finalPrice= price - discount
    printReceipt(title = gameTitle, originalPrice = price,finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        (price * 0.2).toInt()
    }
    else {
        (price * 0.1).toInt()
    }

fun printReceipt(title: String, originalPrice: Int ,finalPrice: Int) {
    println("Judul Game = $title")
    println("Harga Asli = $originalPrice ")
    println("Harga Akhir  = $finalPrice")
}