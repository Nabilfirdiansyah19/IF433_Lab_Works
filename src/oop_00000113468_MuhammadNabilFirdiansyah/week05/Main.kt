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

    println("\n=== TUGAS MANDIRI 2: SISTEM PEMBAYARAN ===")
    val myWallet = EWallet("John Doe", 50000.0)
    val myCard = CreditCard("John Doe", 100000.0)

    val listPayment: List<PaymentMethod> = listOf(myWallet, myCard)

    for (payment in listPayment) {
        if (payment is EWallet) {
            payment.topUp(50000.0)
        }
        payment.processPayment(75000.0)
    }
}