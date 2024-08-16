// Definition for singly-linked list.
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummyHead = ListNode(0)  // Dummy node to help with result list construction
        var current = dummyHead
        var carry = 0
        var p = l1
        var q = l2
        
        while (p != null || q != null || carry != 0) {
            val x = p?.`val` ?: 0
            val y = q?.`val` ?: 0
            val sum = x + y + carry
            
            carry = sum / 10
            current.next = ListNode(sum % 10)
            current = current.next
            
            p = p?.next
            q = q?.next
        }
        
        return dummyHead.next
    }
}

fun main() {
    // Helper function to create a linked list from a list of integers
    fun createList(nums: IntArray): ListNode? {
        val dummyHead = ListNode(0)
        var current = dummyHead
        for (num in nums) {
            current.next = ListNode(num)
            current = current.next!!
        }
        return dummyHead.next
    }
    
    // Helper function to print the linked list
    fun printList(head: ListNode?) {
        var current = head
        val result = StringBuilder()
        while (current != null) {
            result.append(current.`val`).append(" ")
            current = current.next
        }
        println(result.toString().trim())
    }
    
    val solution = Solution()
    
    // Example 1
    val l1 = createList(intArrayOf(2, 4, 3))
    val l2 = createList(intArrayOf(5, 6, 4))
    val result1 = solution.addTwoNumbers(l1, l2)
    println("Output (Example 1):")
    printList(result1)  // Should print: 7 0 8
    
    // Example 2
    val l1_2 = createList(intArrayOf(0))
    val l2_2 = createList(intArrayOf(0))
    val result2 = solution.addTwoNumbers(l1_2, l2_2)
    println("Output (Example 2):")
    printList(result2)  // Should print: 0
    
    // Example 3
    val l1_3 = createList(intArrayOf(9, 9, 9, 9, 9, 9, 9))
    val l2_3 = createList(intArrayOf(9, 9, 9, 9))
    val result3 = solution.addTwoNumbers(l1_3, l2_3)
    println("Output (Example 3):")
    printList(result3)  // Should print: 8 9 9 9 0 0 0 1
}
