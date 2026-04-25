package oop_00000113468_MuhammadNabilFirdiansyah.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 50, 40.0, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 15, -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, 8.5, "CLOSED"),
        TradeLog("BNBUSDT", "SHORT", 5, -2.5, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
}