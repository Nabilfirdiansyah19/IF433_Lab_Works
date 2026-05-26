package oop_00000113468_MuhammadNabilFirdiansyah.week14


import java.io.File

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")

    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        file.bufferedWriter().use {
            file.appendText("$itemName, $finalPrice, $customerType\n")
        }
    }
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, strategy: PricingStrategy, customerType: String) {
        val finalPrice = strategy.calculate(basePrice)

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}

fun main() {
    val csvRepo = CsvOrderRepository()
    val emailService = EmailNotifier()
    val orderProcessor = SafeOrderProcessor(csvRepo, emailService)

    println("--- SIMULASI TRANSAKSI E-COMMERCE ---")

    orderProcessor.processOrder(
        itemName = "Laptop ASUS Rog",
        basePrice = 15000000.0,
        strategy = RegularPricing(),
        customerType = "REGULAR"
    )

    println()

    orderProcessor.processOrder(
        itemName = "iPhone 15 Pro",
        basePrice = 20000000.0,
        strategy = VipPricing(),
        customerType = "VIP"
    )
}