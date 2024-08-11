// Base class
open class Animal {
    open fun sound() {
        println("Animal makes a sound")
    }
}

// Derived class 1
class Dog : Animal() {
    override fun sound() {
        println("Dog barks")
    }
}

// Derived class 2
class Cat : Animal() {
    override fun sound() {
        println("Cat meows")
    }
}

// Function to demonstrate polymorphism
fun makeSound(animal: Animal) {
    animal.sound()
}

fun main() {
    val dog: Animal = Dog() // Upcasting
    val cat: Animal = Cat() // Upcasting

    makeSound(dog) // Dog barks
    makeSound(cat) // Cat meows
}
