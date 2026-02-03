package oop_00000113468_MuhammadNabilFirdiansyah.week01

fun main(){
    val name : String = "John Thor"
    val score : Int = 80

    val grade = when(score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }

    println("Nama : $name , Nilai : $score")
    println("Grade Kamu : $grade")
    println("Status : ${calculateStatus(score)}")

    val studentId : String? = null
    val idLength = studentId?.length?:0
    println("Panjang ID : $idLength")
}

fun calculateStatus(score: Int) = if (score >75) "Lulus" else "Tidak Lulus"