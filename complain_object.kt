class MyClass {
    companion object {
        val name = "Companion Example"
        fun display() {
            println("This is a companion object")
        }
    }
}

fun main() {
    println(MyClass.name)
    MyClass.display()
}
