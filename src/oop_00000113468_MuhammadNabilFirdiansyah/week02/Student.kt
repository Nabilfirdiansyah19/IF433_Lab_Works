package oop_00000113468_MuhammadNabilFirdiansyah.week02

class Student (
    val name: String,
    val nim : String,
    var major : String,
    var gpa : Double = 0.0,
){
    init{
        if(nim.length !=5 ) {
            println("WARNING : objek tercipta dengan nim ($nim) yang tidak valid")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        }
        else {
            println("LOG: Objek student $name berhasil dialokasikan di memori")
        }
    }
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}