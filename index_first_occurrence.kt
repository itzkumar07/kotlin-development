class Solution {
    fun strStr(haystack: String, needle: String): Int {
        return haystack.indexOf(needle)
    }
}

fun main() {
    val solution = Solution()
    
    val testCases = listOf(
        Pair("sadbutsad", "sad"),
        Pair("leetcode", "leeto"),
        Pair("hello", "ll"),
        Pair("aaaaa", "bba"),
        Pair("", "a"),
        Pair("a", "a")
    )
    
    for ((haystack, needle) in testCases) {
        println("haystack: \"$haystack\", needle: \"$needle\" -> ${solution.strStr(haystack, needle)}")
    }
}
