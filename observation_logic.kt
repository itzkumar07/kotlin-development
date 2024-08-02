/*
OBSEVATIONS & LOGIC 
input 
10 10
5 10
15 10

OUTPUT 
10
5
20


*/
fun main(){
    val input = readline()!!
    val T = input.toInt()
    
    repeat(T){
        val (N,M) = readline()!!.splilt(" ").map { it.toInt()}
        val extraRightShoes = N
        val totalExtraShoes = extraRightShoes + extraRightShoes
        
        println(totalExtraShoes)
    }
}
    