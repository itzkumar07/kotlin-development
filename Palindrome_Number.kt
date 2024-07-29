fun main() {
    println(isPalindrome(121)) 
    println(isPalindrome(-121)) 
    println(isPalindrome(10))
  
    println(isPalindrome(411))
}

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    val str = x.toString()
    return str == str.reversed()
}

