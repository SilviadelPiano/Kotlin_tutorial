import java.util.*

fun main(args: Array<String>) {
    feedTheFish()
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20) : Boolean {

    /*return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }*/
    /*You can also write it like this
    val isTooHot = temperature > 30
    val isTooDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot -> true
        isTooDirty -> true
        isSunday -> true
        else -> false
    }*/

    //Or like this
    return when {
        isTooHot(temperature) -> true
        isTooDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

//You can also do it like this [Using one line functions you will simplify your helper functions]
fun isTooHot(temperature: Int) = temperature > 30 //Here the return type is not needed since it's inferred
fun isTooDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater2(
    temperature: Int = 22,
    dirty: Int = 20,
    day: String
) {}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    //shouldChangeWater(day, 20, 50)    These are the ways in which I can call this function
    //shouldChangeWater(day)
    //shouldChangeWater(day, dirty=50)
    //shouldChangeWater2(day = "Monday")
    if (shouldChangeWater(day)) {
        println("Change the water today")
    }
    swim(50, speed = "slow")
}

fun swim(time: Int, speed: String = "fast") {
    println("swimming $speed")
}

fun randomDay() : String {
    val week = listOf("Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String {
    var food = "fasting"

    return when(day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}