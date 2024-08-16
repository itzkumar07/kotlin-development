fun main() {
    // Define a 2x2 matrix
    val matrix1 = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4)
    )

    // Define another 2x2 matrix
    val matrix2 = arrayOf(
        intArrayOf(5, 6),
        intArrayOf(7, 8)
    )

    // Define a 3x3 matrix
    val matrix3 = arrayOf(
        intArrayOf(9, 10, 11),
        intArrayOf(12, 13, 14),
        intArrayOf(15, 16, 17)
    )

    // Print matrices
    println("Matrix 1:")
    printMatrix(matrix1)

    println("Matrix 2:")
    printMatrix(matrix2)

    println("Matrix 3:")
    printMatrix(matrix3)
}

// Function to print a matrix
fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        for (element in row) {
            print("$element\t")
        }
        println()
    }
}
