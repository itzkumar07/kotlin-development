// One variables using the program Looping
fun main() {
 loop_1()
}

fun loop_1() {
    val time = 40

    if (time < 10) {
        println("Good morning....")
    } else if (time < 16) {
        println("good afternoon...")
    } else if (17 > time) {
        println("good evening.....")
    } else if (20 > time) {
        println("good night...")
    } else {
        println("no any statement")
    }
}
