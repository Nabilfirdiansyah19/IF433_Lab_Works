package oop_00000113468_MuhammadNabilFirdiansyah.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> {
            println("Waspada! Muncul monster: ${event.monsterName}")
        }
        is LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Yeay! Mendapat item: $name (DMG: $damage, Rarity: $rarity)")
        }
        is GameOver -> {
            println("Permainan Berakhir karena: ${event.reason}")
        }
        SafeZone -> {
            println("Anda berada di zona aman.")
        }
    }
}