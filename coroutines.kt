import kotlinx.coroutines.*

fun main() = runBlocking {
    // Start a new coroutine
    launch {
        delay(1000L) // Non-blocking delay for 1 second
        println("World!")
    }
    
    println("Hello,")
}
