class Solution {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val results = mutableListOf<List<Int>>()
        candidates.sort()
        backtrack(results, mutableListOf(), candidates, target, 0)
        return results
    }

    private fun backtrack(
        results: MutableList<List<Int>>,
        tempList: MutableList<Int>,
        candidates: IntArray,
        remain: Int,
        start: Int
    ) {
        if (remain < 0) return // if remaining sum is negative, stop
        if (remain == 0) {
            results.add(ArrayList(tempList)) // found a valid combination
        } else {
            for (i in start until candidates.size) {
                if (i > start && candidates[i] == candidates[i - 1]) continue // skip duplicates
                tempList.add(candidates[i])
                backtrack(results, tempList, candidates, remain - candidates[i], i + 1)
                tempList.removeAt(tempList.size - 1) // backtrack
            }
        }
    }
}

fun main() {
    val solution = Solution()
    
    val candidates1 = intArrayOf(10, 1, 2, 7, 6, 1, 5)
    val target1 = 8
    println(solution.combinationSum2(candidates1, target1))
    // Expected Output: [[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]
    
    val candidates2 = intArrayOf(2, 5, 2, 1, 2)
    val target2 = 5
    println(solution.combinationSum2(candidates2, target2))
    // Expected Output: [[1, 2, 2], [5]]
}
