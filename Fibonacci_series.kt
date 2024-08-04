 
fun main() {
    val n = 10 // Specify the number of terms in the Fibonacci series
    var firstTerm = 0
    var secondTerm = 1

    println("Fibonacci Series up to $n terms:")

    for (i in 1..n) {
        print("$firstTerm ")

        // Compute the next term
        val nextTerm = firstTerm + secondTerm
        firstTerm = secondTerm
        secondTerm = nextTerm
    }
}
