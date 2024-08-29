class Solution {
    fun mySqrt(x: Int): Int {
        if (x < 2) return x
        
        var left = 1
        var right = x / 2
        
        while (left <= right) {
            val mid = left + (right - left) / 2
            val midSquared = mid.toLong() * mid.toLong()
            
            when {
                midSquared == x.toLong() -> return mid
                midSquared < x -> left = mid + 1
                else -> right = mid - 1
            }
        }
        
        return right
    }
}

fun main() {
    val solution = Solution()
    
    // Test cases
    println(solution.mySqrt(4))  // Output: 2
    println(solution.mySqrt(8))  // Output: 2
    println(solution.mySqrt(0))  // Output: 0
    println(solution.mySqrt(1))  // Output: 1
    println(solution.mySqrt(16)) // Output: 4
    println(solution.mySqrt(25)) // Output: 5
    println(solution.mySqrt(26)) // Output: 5
}
