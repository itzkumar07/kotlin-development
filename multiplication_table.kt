//Multiplecation table
fun main(){
 loop_4()
}

fun loop_4() {
    val Number = 12
    val Number_1 = 15

    // 1st for loop
    for (Store_Value in 1..5) {
        val new_final_mul = Number * Store_Value - 12
        println("$Number * $Store_Value - 12 = $new_final_mul")
    }
    println()

    // 2nd for loop
    for (Store_Value in 1..10) {
        val final_mul = Number_1 * Store_Value
        println("$Number_1 * $Store_Value = $final_mul")
    }
}
