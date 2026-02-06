package oop_00000113468_MuhammadNabilFirdiansyah.week01

fun main(){
    val gameTitle ="PUBG"
    val price =700000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000) {
        (price * 0.2).toInt()
    }
    else {
        (price * 0.1).toInt()
    }
