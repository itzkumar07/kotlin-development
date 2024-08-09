class Solution {
    fun numMagicSquaresInside(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        var count = 0

        // Function to check if a 3x3 grid is a magic square
        fun isMagicSquare(r: Int, c: Int): Boolean {
            // Check the center value first (must be 5 for a valid magic square)
            if (grid[r + 1][c + 1] != 5) return false

            // List all the values in the 3x3 subgrid
            val values = intArrayOf(
                grid[r][c], grid[r][c + 1], grid[r][c + 2],
                grid[r + 1][c], grid[r + 1][c + 1], grid[r + 1][c + 2],
                grid[r + 2][c], grid[r + 2][c + 1], grid[r + 2][c + 2]
            )

            // Check if all numbers are distinct and in the range [1, 9]
            if (values.toSet().size != 9 || values.any { it !in 1..9 }) return false

            // Check sums of rows, columns, and diagonals
            val sum1 = grid[r][c] + grid[r][c + 1] + grid[r][c + 2]
            val sum2 = grid[r + 1][c] + grid[r + 1][c + 1] + grid[r + 1][c + 2]
            val sum3 = grid[r + 2][c] + grid[r + 2][c + 1] + grid[r + 2][c + 2]
            val sum4 = grid[r][c] + grid[r + 1][c] + grid[r + 2][c]
            val sum5 = grid[r][c + 1] + grid[r + 1][c + 1] + grid[r + 2][c + 1]
            val sum6 = grid[r][c + 2] + grid[r + 1][c + 2] + grid[r + 2][c + 2]
            val sumDiag1 = grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2]
            val sumDiag2 = grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c]

            return sum1 == 15 && sum2 == 15 && sum3 == 15 && sum4 == 15 && sum5 == 15 && sum6 == 15 &&
                    sumDiag1 == 15 && sumDiag2 == 15
        }

        // Slide over every possible 3x3 subgrid
        for (i in 0 until rows - 2) {
            for (j in 0 until cols - 2) {
                if (isMagicSquare(i, j)) count++
            }
        }

        return count
    }
}

fun main() {
    val solution = Solution()
    val grid = arrayOf(
        intArrayOf(4, 3, 8, 4),
        intArrayOf(9, 5, 1, 9),
        intArrayOf(2, 7, 6, 2)
    )
    println(solution.numMagicSquaresInside(grid))  // Output: 1
}
