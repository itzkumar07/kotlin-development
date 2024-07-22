// One veriable usnig the User input program

fun main(){
 loop_3()
}

fun loop_3() {
    val Number = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val Name_list = listOf("Kumar", "Dushant", "Himanshu", "Dhiraj", "Ajit")

    for (x in Number) {
        for (name_list in Name_list) {
            println(Name_list)
        }
        println("$x")
    }
    for(i in 1..100) {
        println(i)
    }
}
