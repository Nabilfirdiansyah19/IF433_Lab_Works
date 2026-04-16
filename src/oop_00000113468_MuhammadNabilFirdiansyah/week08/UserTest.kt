package oop_00000113468_MuhammadNabilFirdiansyah.week08

object Databasemock{
    fun findUser(id: Int): UserProfile?{
        return  if (id==1) UserProfile("TestUser","test@tets.com")else null

    }
}

fun runMockUntiTest(){
    println("\n=== RUNNING UNIT TEST ===")
    val testUser=Databasemock.findUser(1)
    val inital = testUser!!.name.substring(0,1)
    check(inital == "T"){"test failed , initial is wrong"}
    println("test passed, inital is T")
}

