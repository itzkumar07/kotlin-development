fun main(args: Array<String>) {
    var N = 10
    var M = 10
    
    if (N <= M) {
        println("We need to buy $N shoes")
    } else {
        println("We need to buy ${2 * N - M} shoes")
    }

    N = 15
    M = 10
    
    if (N <= M) {
        println("We need to buy $N shoes")
    } else {
        println("We need to buy ${2 * N - M} shoes")
    }
}
