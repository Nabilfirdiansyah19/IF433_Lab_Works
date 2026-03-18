package oop_00000113468_MuhammadNabilFirdiansyah.week07

class NetworkClient private constructor(var ulr : String) {
    companion object {
        const val BASE_URL = "https://api.umn.ac.id"
        fun createClient(): NetworkClient {
            println("membangun network client dengan base url $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }
    fun connect() {
        println("connecting to $ulr..")
    }
}