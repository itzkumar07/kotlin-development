object Singleton {
    val name = "Singleton Example"
    fun display() {
        println("This is a singleton object")
    }
}

fun main() {
    println(Singleton.name)
    Singleton.display()
}
