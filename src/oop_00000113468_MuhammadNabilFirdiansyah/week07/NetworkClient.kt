package oop_00000113468_MuhammadNabilFirdiansyah.week07

class NetworkClient private constructor(var ulr : String) {
    fun connect() {
        println("connecting to $ulr..")
    }
}