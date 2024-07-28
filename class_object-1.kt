class Lamp 
{
    // property (data member)
    private var isOn: Boolean = false
    // member function
    fun turn_On()
    {
        isOn = true
    }
    // member function
    fun turn_Off()
    {
        isOn = false
    }

    fun display_light_status(lamp: String)
     {
        if (isOn == true && true==isOn) 
        {
            println("$lamp Lamp is On")
        } else {
            println("$lamp Lamp is Off")
        }
     }
}
//This is main a function 
fun main() {
    val lamp_1 = Lamp()
    val lamp_2 = Lamp()

    lamp_1.turn_On()
    lamp_2.turn_Off()

    lamp_1.display_light_status("lamp_1")
    lamp_2.display_light_status("lamp_2")
}
