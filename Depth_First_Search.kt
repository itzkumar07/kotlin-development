class Graph(val vertices: Int) {
    private val adjacencyList = Array(vertices) { mutableListOf<Int>() }

    fun addEdge(v: Int, w: Int) {
        adjacencyList[v].add(w)
    }

    fun dfs(v: Int, visited: BooleanArray) {
        visited[v] = true
        print("$v ")

        for (n in adjacencyList[v]) {
            if (!visited[n]) {
                dfs(n, visited)
            }
        }
    }

    fun dfsStart(v: Int) {
        val visited = BooleanArray(vertices)
        dfs(v, visited)
    }
}

fun main() {
    val g = Graph(4)

    g.addEdge(0, 1)
    g.addEdge(0, 2)
    g.addEdge(1, 2)
    g.addEdge(2, 0)
    g.addEdge(2, 3)
    g.addEdge(3, 3)

    println("Depth First Traversal starting from vertex 2:")
    g.dfsStart(2)
}
