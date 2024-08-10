class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            if (digits[i] < 9) {
                digits[i] += 1
                return digits
            }
            digits[i] = 0
        }
        // If we finished the loop, it means we had a carry all the way through.
        val result = IntArray(digits.size + 1)
        result[0] = 1
        return result
    }
}

fun main() {
    val solution = Solution()
    
    val digits1 = intArrayOf(1, 2, 3)
    val digits2 = intArrayOf(4, 3, 2, 1)
    val digits3 = intArrayOf(9)
    
    println(solution.plusOne(digits1).joinToString())  // Output: [1, 2, 4]
    println(solution.plusOne(digits2).joinToString())  // Output: [4, 3, 2, 2]
    println(solution.plusOne(digits3).joinToString())  // Output: [1, 0]
}
