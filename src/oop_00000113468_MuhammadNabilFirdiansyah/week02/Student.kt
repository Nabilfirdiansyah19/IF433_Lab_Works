package oop_00000113468_MuhammadNabilFirdiansyah.week02

class Student (
    val name: String,
    val nim : String,
    val major : String,
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
}