package oop_00000113468_MuhammadNabilFirdiansyah.week04

fun main(){
    println("----testing vehicle----")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("----testing car----")
    val myCar = Car("Toyota",4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n----testing electric car----")
    val myEV = ElectricCar("Tesla", 2, 85)
    myEV.openTrunk()
    myEV.honk()
    myEV.accelerate()
}