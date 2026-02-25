package oop_00000113468_MuhammadNabilFirdiansyah.week04

open class Employee(val name: String, val baseSalary: Int) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (0.1 * baseSalary).toInt()
    }
}