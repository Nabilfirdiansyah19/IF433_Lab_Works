package oop_00000113468_MuhammadNabilFirdiansyah.week06

fun processCheckout(method: PaymentMethod,amount: Double){
    println("-> .. memulai checkout")
    method.pay(amount)
}

fun main(){
    val myWatch= Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1= Gopay()
    val pay2= CreditCard()

    println("===testing checkout===")
    processCheckout(pay1,50000.0)
    processCheckout(pay2,150000.0)
}