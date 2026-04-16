package oop_00000113468_MuhammadNabilFirdiansyah.week08

fun main(){
    println("=== TEST SAFE CALLS& ELVIS ===")
    val emptyOrder = Order(null,null)
    val destination =emptyOrder.deliveryDetails?.address?.city?.name ?:"Kota tidak diketahui"
    println("tujuan pengiriman $destination")

    println("=== TEST LET BLOCK ===")
    val validOrder= Order(null,250000)
    val receipt=validOrder.totalPrice?.let{price->
        val tax = price * 0.11
        " Transaksi valid : harga Rp.$price, pajak Rp.$tax "
    }?:"Transaksi invalid : harga belum di set"

    println(receipt)

    println("=== TEST SAFE CASTING ===")
    val mixedData : List<Any> = listOf(
        "samrtphone",
        1500000,
        UserProfile("Andi",null)
        "Laptop",
        4500000.0
    )
}