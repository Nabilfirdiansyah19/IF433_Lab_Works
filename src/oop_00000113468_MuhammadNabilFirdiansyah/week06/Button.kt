package oop_00000113468_MuhammadNabilFirdiansyah.week06

class Button(override val name: String): Clickable {
    override fun click() {
        println("tombol $name di klik!")
    }
}