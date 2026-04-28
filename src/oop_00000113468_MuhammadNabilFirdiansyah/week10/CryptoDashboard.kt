package oop_00000113468_MuhammadNabilFirdiansyah.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.01))
    txRepo.add(Transaction("TX002", 50.0))

    // 1. Simulasi Response Jaringan untuk Transaksi (Generic Wrapper)
    val txResponse = ApiResponse("200 OK", txRepo.getAll())
    println("\n=== TRANSACTION HISTORY ===")
    println("Status: ${txResponse.status}")
    txResponse.data.forEach { tx ->
        println("ID: ${tx.id}, Amount: ${tx.amount}")
    }

    // 2. Pengujian Fitur Pencarian (Constraints Test)
    println("\n=== SEARCH TEST ===")
    val searchBtc = coinRepo.findItem { it.name == "BTC" }
    println("Hasil pencarian BTC: ${searchBtc ?: "Tidak ditemukan"}")

    val searchLargeTx = txRepo.findItem { it.amount > 10.0 }
    println("Transaksi > 10.0: ${searchLargeTx?.id ?: "Tidak ada"}")

    println("\nSystem exit")
}