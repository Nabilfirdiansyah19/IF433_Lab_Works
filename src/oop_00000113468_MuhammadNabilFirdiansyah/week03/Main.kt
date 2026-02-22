package oop_00000113468_MuhammadNabilFirdiansyah.week03

fun main(){
    val e = Employee("budi")

    e.salary=-1000
    e.salary=5000000
    println("Gaji : ${e.salary}")
    e.increasePerformanceRating()

    println("pajak yang harus diabayar : ${e.tax}")
}