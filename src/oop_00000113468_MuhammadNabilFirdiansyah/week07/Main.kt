package oop_00000113468_MuhammadNabilFirdiansyah.week07

fun main(){
    println("=== TES SINGLETON ===")
    println("status : ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1= RegularUser("alice",22)
    val reg2= RegularUser("alice",22)
    println(reg1)
    println("sama? ${reg1==reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1= DataUser("alice",22)
    val data2= DataUser("alice",22)
    println(data1)
    println("sama? ${data1==data2}")

    val data3=data1.copy(age=23)
    println("hasil copy = $data3")
    val(userName,userAge) = data1
    println("Destructured : $userName berumur $userAge")
}