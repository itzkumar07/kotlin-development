 
fun main(args: Array<String>) {
    var t = readLine()!!.toInt()
    repeat(t) {
        var N = readLine()!!.toInt()
        val A = IntArray(N)
        
        // Read input values for the array
        for (i in 0 until N) {
            A[i] = readLine()!!.toInt()
        }

        // Print array elements in original order
        for (x in A) {
            print("$x ")
        }
        println()

        // Print array elements in reverse order
        for (i in (N - 1) downTo 0) {
            print("${A[i]} ")
        }
        println()
    }
}
