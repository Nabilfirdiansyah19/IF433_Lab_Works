package oop_00000113468_MuhammadNabilFirdiansyah.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Smart Speaker $name menyala, siap menerima perintah suara.")
    }

    override fun turnOff() {
        println("Smart Speaker $name memasuki mode standby.")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify.")
    }
}