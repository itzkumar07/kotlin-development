fun main() {
 loop_if()
}

fun loop_if() {
    val age = 10
    val Voter= if(age> 17){ 
        "Voter Allowed"
        }else if(age < 17){ 
            "Voter Not allow"
        }else if(age>= 17){
            "Voter Allow But 1 yr Left"
        }else if(age <=17){
            "Voter Not allow 1 yr Left "
        }
    println (Voter)
}
