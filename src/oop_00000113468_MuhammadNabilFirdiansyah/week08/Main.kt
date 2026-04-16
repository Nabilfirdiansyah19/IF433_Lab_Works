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
        UserProfile("Andi",null),
        "Laptop",
        4500000.0
    )

    for (item in mixedData) {
        val text= item as? String
        text?.let {
            println("ditemukan text : ${it.uppercase()}")
        }
    }

    val someObject : Any = 100
    val safeString= someObject as? String?:"unknown string"
    println("hasil cast + fallback : $safeString")

    println("=== TEST THE RED BUTTON (!!) ===")
    val toxicData : String? = null
    try{
        val length = toxicData!!.length
    }
    catch (e: NullPointerException){
        println(" crash NPE ! jangan gunakan sembarangan")
    }

    val apiResponse: Map<String, String?> = mapOf("status" to "200" , "token" to null)
    try{
        val token =  requireNotNull(apiResponse["token"]){
            "Critical Exception: token otentikasi tidak ditemukan di server"
        }
    } catch (e: IllegalArgumentException){
        println(e.message)
    }

    println("\n=== TEST JAVA INTEROP ===")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()
    val statusLength = javaResponse!!.length
    println("status dari java : $javaResponse(length : $statusLength)")

    runMockUntiTest()
}