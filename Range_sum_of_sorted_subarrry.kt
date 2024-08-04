 
/**
 * Example:
 * val solution = Solution()
 * println(solution.rangeSum(intArrayOf(1, 2, 3, 4), 4, 1, 5))  // Output: 13
 * println(solution.rangeSum(intArrayOf(1, 2, 3, 4), 4, 3, 4))  // Output: 6
 * println(solution.rangeSum(intArrayOf(1, 2, 3, 4), 4, 1, 10)) // Output: 50
 */

class Solution {
    fun rangeSum(nums: IntArray, n: Int, left: Int, right: Int): Int {
        val mod = 1_000_000_007
        val subarraySums = mutableListOf<Int>()

        // Generate all subarray sums
        for (i in nums.indices) {
            var sum = 0
            for (j in i until nums.size) {
                sum += nums[j]
                subarraySums.add(sum)
            }
        }

        // Sort the subarray sums
        subarraySums.sort()

        // Calculate the sum of elements from index `left` to `right`
        var result = 0
        for (k in (left - 1) until right) {
            result = (result + subarraySums[k]) % mod
        }

        return result
    }
}

// Example usage
fun main() {
    val solution = Solution()

    // Example 1
    val nums1 = intArrayOf(1, 2, 3, 4)
    println(solution.rangeSum(nums1, 4, 1, 5))  // Output: 13

    // Example 2
    val nums2 = intArrayOf(1, 2, 3, 4)
    println(solution.rangeSum(nums2, 4, 3, 4))  // Output: 6

    // Example 3
    val nums3 = intArrayOf(1, 2, 3, 4)
    println(solution.rangeSum(nums3, 4, 1, 10))  // Output: 50
}
