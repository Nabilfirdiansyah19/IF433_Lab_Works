package oop_00000113468_MuhammadNabilFirdiansyah.week07

import javax.xml.crypto.Data

enum class AppState {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse{
    data class Success(val data: Data) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}