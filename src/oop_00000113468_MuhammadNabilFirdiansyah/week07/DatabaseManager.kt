package oop_00000113468_MuhammadNabilFirdiansyah.week07

object DatabaseManager {
    var connectionStatus : String = "Disconnected"
    fun connect (){
        connectionStatus = "Connected to Server"
        println("database is ready")
    }
}