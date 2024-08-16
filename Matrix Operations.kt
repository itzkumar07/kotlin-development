fun addMatrices(matrix1: Array<IntArray>, matrix2: Array<IntArray>): Array<IntArray>? {
    if (matrix1.size != matrix2.size || matrix1[0].size != matrix2[0].size) {
        println("Matrices dimensions do not match!")
        return null
    }

    val result = Array(matrix1.size) { IntArray(matrix1[0].size) }

    for (i in matrix1.indices) {
        for (j in matrix1[i].indices) {
            result[i][j] = matrix1[i][j] + matrix2[i][j]
        }
    }

    return result
}

fun main() {
    val matrix1 = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4)
    )

    val matrix2 = arrayOf(
        intArrayOf(5, 6),
        intArrayOf(7, 8)
    )

    val sumMatrix = addMatrices(matrix1, matrix2)
    if (sumMatrix != null) {
        println("Sum of Matrix 1 and Matrix 2:")
        printMatrix(sumMatrix)
    }
}
