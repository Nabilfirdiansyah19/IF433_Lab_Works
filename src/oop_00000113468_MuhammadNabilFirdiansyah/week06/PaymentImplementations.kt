package oop_00000113468_MuhammadNabilFirdiansyah.week06

class Gopay: PaymentMethod {
    override fun pay(amount: Double){
        println("processing Rp$amount via gopay")
    }
}

class CreditCard: PaymentMethod {
    override fun pay(amount: Double){
        println("connecting bank for Rp$amount")
    }
}