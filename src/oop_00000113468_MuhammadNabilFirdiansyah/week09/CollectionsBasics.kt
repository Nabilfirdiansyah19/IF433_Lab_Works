package oop_00000113468_MuhammadNabilFirdiansyah.week09

fun main(){
    println("\n===TEST LIST===")
    val frameworks: List<String> =listOf("kotlin","java","C++")
    println("Immutable List : $frameworks"  )

    val scores: MutableList<Int> = mutableListOf(85,90)
    scores.add(95)
    scores[0]=88
    println("Mutable List : $scores")

    println("\n===TEST LIST===")
    val uniqueNumbers=setOf(1,2,2,3,3,4)
    println("unique number (set) : $uniqueNumbers")

    val activeUsers=mutableSetOf("user A","user B")
    activeUsers.add("user c")
    activeUsers.add("user a")
    println("active users: $activeUsers")

    println("\n===TEST MAP===")
    val studentGrades=mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A"
    )
    println("nilai bob:${studentGrades["Bob"]}")
    val inventory = mutableMapOf("Apples" to 50,"Bananas" to 30)
    inventory["Oranges"]=20
    inventory["Apples"]=45
    println("Inventory : $inventory")
}