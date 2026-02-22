package oop_00000113468_MuhammadNabilFirdiansyah.week03

fun main(){
    val e = Employee("budi")

    e.salary=-1000
    e.salary=5000000
    println("Gaji : ${e.salary}")
    e.increasePerformanceRating()

    println("pajak yang harus diabayar : ${e.tax}")

    println("\n--- Test Tugas 1: Weapon ---")
    val sword = Weapon("Excalibur")
    sword.damage = -50
    sword.damage = 9999
    println("Final Damage: ${sword.damage}")
    println("Tier: ${sword.tier}")

    println("\n--- Test Tugas 2: Player ---")
    val player = Player("Gamer99")
//    player.xp = 500
//    println(player.xp) error
    player.addXp(50)
    println("Current Level: ${player.level}")

    player.addXp(60)
}