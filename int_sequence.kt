class Solution {
    fun getLucky(s: String, k: Int): Int {
        // Step 1: Convert the string into its corresponding integer sequence
        var numString = s.map { (it - 'a' + 1).toString() }.joinToString("")

        // Step 2: Transform the number k times
        repeat(k) {
            numString = numString.sumOf { it.toString().toInt() }.toString()
        }

        return numString.toInt()
    }
}

fun main() {
    val solution = Solution()

    val s1 = "iiii"
    val k1 = 1
    println("Result for s = $s1, k = $k1: ${solution.getLucky(s1, k1)}") // Expected: 36

    val s2 = "leetcode"
    val k2 = 2
    println("Result for s = $s2, k = $k2: ${solution.getLucky(s2, k2)}") // Expected: 6

    val s3 = "zbax"
    val k3 = 2
    println("Result for s = $s3, k = $k3: ${solution.getLucky(s3, k3)}") // Expected: 8
}
