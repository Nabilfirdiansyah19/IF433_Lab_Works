package oop_00000113468_MuhammadNabilFirdiansyah.week05

class Dosen(nama: String,val nidn: Int) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang bekerja menyiapkan materi perkuliahan")
    }

    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas")
    }
}