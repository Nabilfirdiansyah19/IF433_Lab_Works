package oop_00000113468_MuhammadNabilFirdiansyah.week03

class Employee (val name: String){
    var salary:Int = 0
    set (value){
        if(value<0){
            println("gaji tidak boleh minus! di set ke 0 ")
            field=0
        }
        else{
            field=value
        }

    }
}