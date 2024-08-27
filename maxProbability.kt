import java.util.PriorityQueue

class Solution {
    fun maxProbability(n: Int, edges: Array<IntArray>, succProb: DoubleArray, start_node: Int, end_node: Int): Double {
        // Build the graph
        val graph = Array(n) { mutableListOf<Pair<Int, Double>>() }
        for (i in edges.indices) {
            val u = edges[i][0]
            val v = edges[i][1]
            val prob = succProb[i]
            graph[u].add(Pair(v, prob))
            graph[v].add(Pair(u, prob))
        }
        
        // Max heap priority queue where the max probability paths are explored first
        val pq = PriorityQueue<Pair<Int, Double>>(compareByDescending { it.second })
        pq.add(Pair(start_node, 1.0))
        
        // Array to keep track of the best probabilities found to each node
        val probabilities = DoubleArray(n) { 0.0 }
        probabilities[start_node] = 1.0
        
        while (pq.isNotEmpty()) {
            val (node, prob) = pq.poll()
            
            if (node == end_node) {
                return prob
            }
            
            for ((neighbor, edgeProb) in graph[node]) {
                val newProb = prob * edgeProb
                if (newProb > probabilities[neighbor]) {
                    probabilities[neighbor] = newProb
                    pq.add(Pair(neighbor, newProb))
                }
            }
        }
        
        return 0.0
    }
}

fun main() {
    val solution = Solution()
    val n = 3
    val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2))
    val succProb = doubleArrayOf(0.5, 0.5, 0.2)
    val start = 0
    val end = 2
    val result = solution.maxProbability(n, edges, succProb, start, end)
    println("The maximum probability is: $result")
}
