package oop_00000113468_MuhammadNabilFirdiansyah.week04

open class Vehicle(val brand:String) {
    var speed : Int =0
    open fun accelerate(){
        speed+=10
        println("$brand melaju. kecepatan : $speed km/jam")
    }

    open fun honk(){
        println("Beep beep!")
    }
}