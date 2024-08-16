fun main() {
    // Define two matrices
    val matrix1 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val matrix2 = arrayOf(
        intArrayOf(7, 8),
        intArrayOf(9, 10),
        intArrayOf(11, 12)
    )

    // Perform matrix multiplication
    val result = multiplyMatrices(matrix1, matrix2)

    // Print the result
    if (result != null) {
        println("Product of Matrix 1 and Matrix 2:")
        printMatrix(result)
    } else {
        println("Matrix multiplication is not possible with the given matrices.")
    }
}

// Function to multiply two matrices
fun multiplyMatrices(matrix1: Array<IntArray>, matrix2: Array<IntArray>): Array<IntArray>? {
    // Check if the number of columns in matrix1 equals the number of rows in matrix2
    if (matrix1[0].size != matrix2.size) {
        println("Matrix dimensions do not match for multiplication!")
        return null
    }

    // Initialize the result matrix with appropriate dimensions
    val resultRows = matrix1.size
    val resultCols = matrix2[0].size
    val result = Array(resultRows) { IntArray(resultCols) }

    // Perform the matrix multiplication
    for (i in matrix1.indices) {
        for (j in matrix2[0].indices) {
            var sum = 0
            for (k in matrix2.indices) {
                sum += matrix1[i][k] * matrix2[k][j]
            }
            result[i][j] = sum
        }
    }

    return result
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
