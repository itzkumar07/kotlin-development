fun main(args : Array<String>) {
    var t = readLine()!!.toInt()
    repeat(t){
        var N = readLine()!!.toInt()
        val A = IntArray(N)
        for(i in 0..(N-1))
        {
            A[i] = i+1
        }
//1st for loop
        for(x in A)
        {
            print("$x ")
        }
        println()
        
//2nd for loop 
        for(i in (N-1) downTo 0)
        {
            print("${A[i]} ")
        }
        println()
    }
}
