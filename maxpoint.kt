class Solution {
    fun maxPoints(points: Array<IntArray>): Long {
        val m = points.size
        val n = points[0].size

        var dp = LongArray(n) { points[0][it].toLong() }

        for (r in 1 until m) {
            val newDp = LongArray(n) { 0L }

            // Max points from left to right
            val leftMax = LongArray(n) { 0L }
            leftMax[0] = dp[0]
            for (c in 1 until n) {
                leftMax[c] = maxOf(leftMax[c - 1] - 1, dp[c])
            }

            // Max points from right to left
            val rightMax = LongArray(n) { 0L }
            rightMax[n - 1] = dp[n - 1]
            for (c in n - 2 downTo 0) {
                rightMax[c] = maxOf(rightMax[c + 1] - 1, dp[c])
            }

            for (c in 0 until n) {
                newDp[c] = maxOf(leftMax[c], rightMax[c]) + points[r][c]
            }

            dp = newDp
        }

        return dp.maxOrNull() ?: 0L
    }
}

fun main() {
    val solution = Solution()

    val points1 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(1, 5, 1),
        intArrayOf(3, 1, 1)
    )
    println(solution.maxPoints(points1)) // Output: 9

    val points2 = arrayOf(
        intArrayOf(1, 5),
        intArrayOf(2, 3),
        intArrayOf(4, 2)
    )
    println(solution.maxPoints(points2)) // Output: 11
}
