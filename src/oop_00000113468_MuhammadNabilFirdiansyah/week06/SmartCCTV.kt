package oop_00000113468_MuhammadNabilFirdiansyah.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name aktif.")
        startRecord()
    }

    override fun turnOff() {
        println("CCTV $name non-aktif.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV $name: Sensor gerak aktif, mulai merekam ke storage...")
    }
}