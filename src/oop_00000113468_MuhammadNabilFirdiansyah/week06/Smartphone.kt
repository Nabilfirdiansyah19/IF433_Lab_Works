package oop_00000113468_MuhammadNabilFirdiansyah.week06

class Smartphone: Camera, Phone {
    override fun turnOn() {
        super<Phone>.turnOn()
        super<Phone>.turnOn()
        println("sistem operasi smartphone berhasil booting")
    }
}