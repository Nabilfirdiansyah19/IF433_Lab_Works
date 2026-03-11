package oop_00000113468_MuhammadNabilFirdiansyah.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu $name ($id) dinyalakan: Cahaya hangat memenuhi ruangan.")
    }

    override fun turnOff() {
        println("Lampu $name ($id) dimatikan.")
    }
}