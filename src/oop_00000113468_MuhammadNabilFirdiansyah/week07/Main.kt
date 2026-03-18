package oop_00000113468_MuhammadNabilFirdiansyah.week07

fun main(){
    println("=== TES SINGLETON ===")
    println("status : ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()
}