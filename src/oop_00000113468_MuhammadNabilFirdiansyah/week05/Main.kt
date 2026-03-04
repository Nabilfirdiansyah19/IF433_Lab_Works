package oop_00000113468_MuhammadNabilFirdiansyah.week05

fun main(){
    val dosen1= Dosen("Pak alex",123456)
    val admin1= Admin("Bu siti")
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)
    println("===Aktivitas Pegawai===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when(pegawai){
            is Dosen -> {
                println("=> terdeteksi sebagai dosen (NIDN : ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> terdeteksi sebagai admin")
                pegawai.doAdminWork()
            }
        }
    }

    println("\n=== TUGAS MANDIRI 1: MATH HELPER ===")
    val math = MathHelper()

    println("Luas Persegi (sisi 5): ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang (5x10): ${math.hitungLuas(5, 10)}")
    println("Luas Lingkaran (r 7.0): ${math.hitungLuas(7.0)}")
}