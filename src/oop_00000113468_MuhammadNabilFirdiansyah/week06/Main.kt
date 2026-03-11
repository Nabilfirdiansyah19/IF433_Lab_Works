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

    println("=====Tugas Mandiri=====")
    val lamp = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")

    val myHub = SmartHomeHub()
    myHub.addDevice(lamp)
    myHub.addDevice(speaker)
    myHub.addDevice(cctv)

    myHub.activateSecurityMode()
    myHub.turnOffAllSwitches()
}