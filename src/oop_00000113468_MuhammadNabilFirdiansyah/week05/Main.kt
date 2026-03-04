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
}