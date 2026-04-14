package oop_00000113468_MuhammadNabilFirdiansyah.week08

class NotificationService {
    fun sendEmail(emailAddress:String){
        println("mengirim email ke : $emailAddress")
    }

    fun processUser(user : UserProfile){
        if (user.email!=null){
            sendEmail(user.email)
        }
        else{
            println("user ${user.name} tidak memiliki email")
        }
    }

}