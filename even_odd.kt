 fun main() {
    // Prompt the user for input
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull() ?: return println("Invalid input")

    // Check if the number is even or odd
    if (number % 2 == 0) {
        println("$number is even.")
    } else {
        println("$number is odd.")
    }
}

