package oop_00000113468_MuhammadNabilFirdiansyah.week02

import java.util.Scanner

fun main(){

// sistem pendaftaran mahasiswa
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
        print("pilih jalur (1.reguler , 2.umum) :")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1){
            print("masukkan jurusan= ")
            val major = scanner.nextLine()
            val s1 = Student(name,nim,major)
            println(" Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        } else if (type == 2){
            val s2= Student(name,nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        } else{
            println("pilihan salah, pendaftaran batal")
        }

    }

//  tugas 1
    println("\nSISTEM PEMINJAMAN BUKU")
    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()
    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()
    print("Masukkan Lama Pinjam (Hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine()

    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(bookTitle, borrower, duration)
    println("Detail Pinjaman: ${loan.borrower} \n meminjam ${loan.bookTitle} \n selama ${loan.loanDuration} hari.")
    println("Total Denda: Rp ${loan.calculateFine()}")
}