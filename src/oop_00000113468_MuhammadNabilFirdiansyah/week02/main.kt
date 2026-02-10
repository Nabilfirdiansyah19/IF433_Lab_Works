package oop_00000113468_MuhammadNabilFirdiansyah.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("-----Aplikasi PMB UMN-----")
    print("masukkan nama = ")
    val name = scanner.nextLine()
    print("masukkan nim (wajib 5 karakter) = ")
    val nim = scanner.next()
    scanner.nextLine()

    if (nim.length!=5){
        println("Error : pendaftaran dibatalkan, nim harus 5 karakter")

    }else {
        print("masukkan jurusan= ")
        val major = scanner.nextLine()
        val s1 = Student(name,nim,major)
        println("Status : pendaftaran selesai")
    }
}