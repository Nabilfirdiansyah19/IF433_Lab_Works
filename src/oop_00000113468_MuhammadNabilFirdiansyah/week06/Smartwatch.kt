package oop_00000113468_MuhammadNabilFirdiansyah.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala : 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("mencari perangkat hp di sekitar")
    }

    override fun chargeBattery() {
        println("mengisi daya menggunakan charger")
    }

}