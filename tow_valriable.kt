// Two variables using the program looping
fun main(){
 loop_2()
}

fun loop_2() {
    val x = 10000
    val y = 10002

    if (x < y) {
        println("Is a Big Number")
    } else if (x > y) {
        println("Is a Small Number")
    } else if (x <= y) {
        println("Is a Biger Equals To..")
    } else if (x >= y) {
        println("Smaller Equal To..")
    } else if (x != y) {
        println("Not X & y")
    } else if (x == y) {
        println(" Two Numbers Equally")
    } else {
        println("This Two Numbers Not Extend")
    }
}