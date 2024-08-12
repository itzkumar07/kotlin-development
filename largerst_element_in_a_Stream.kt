import java.util.PriorityQueue

class KthLargest(val k: Int, nums: IntArray) {

    private val heap: PriorityQueue<Int> = PriorityQueue(k)

    init {
        // Initialize the heap with elements from the nums array
        for (num in nums) {
            add(num)
        }
    }

    fun add(`val`: Int): Int {
        // Add the new value to the heap if the heap has less than k elements
        if (heap.size < k) {
            heap.add(`val`)
        } else if (`val` > heap.peek()) {
            // If the heap has k elements and the new value is larger than the smallest,
            // remove the smallest and add the new value
            heap.poll()
            heap.add(`val`)
        }
        return heap.peek()
    }
}

fun main() {
    // Example usage:
    val kthLargest = KthLargest(3, intArrayOf(4, 5, 8, 2))

    println(kthLargest.add(3))  // Output: 4
    println(kthLargest.add(5))  // Output: 5
    println(kthLargest.add(10)) // Output: 5
    println(kthLargest.add(9))  // Output: 8
    println(kthLargest.add(4))  // Output: 8
}
