package oop_00000113468_MuhammadNabilFirdiansyah.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Pembayaran Kartu Kredit sebesar $amount sukses.")
        } else {
            println("[$accountName] Transaksi ditolak: Melebihi limit.")
        }
    }
}