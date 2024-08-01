//Kotlin Compiler version 1.3.11
//do not place package here, no need
class Box
{
  var length: Int = 10
  var width: Int =20
  var height: Int =5
 
  fun Box_filled_content()
  {
    println ("Box is filled.......")
  }
  
  fun Box_open()
  {
    println ("Box is Open.......")
  }
}

fun main(args: Array<String>)
 {
   val box1 = Box()
   val box2 = Box()
   val box3 = Box()
   
   box1.height=22
   box1.length=33
   box1.width=44
  
   println("Height Value:- ${box1.height}")
   println("Length Value:- ${box1.length}")   
   println("Width Value:- ${box1.width} \n")
   
   box2.Box_filled_content()
   box3.Box_open()
}
