package oop_00000113468_MuhammadNabilFirdiansyah.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}