class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        
        while (left <= right) {
            val mid = left + (right - left) / 2
            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> left = mid + 1
                else -> right = mid - 1
            }
        }
        
        return left
    }
}

fun main() {
    val solution = Solution()
    val nums1 = intArrayOf(1, 3, 5, 6)
    val target1 = 5
    val nums2 = intArrayOf(1, 3, 5, 6)
    val target2 = 2
    val nums3 = intArrayOf(1, 3, 5, 6)
    val target3 = 7
    
    println(solution.searchInsert(nums1, target1))  // Output: 2
    println(solution.searchInsert(nums2, target2))  // Output: 1
    println(solution.searchInsert(nums3, target3))  // Output: 4
}
