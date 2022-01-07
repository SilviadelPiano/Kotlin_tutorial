import java.util.*

fun main(args: Array<String>) {
    println("Hello, world")
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day it is today?")
    var dayNumber = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var day = ""
    when(dayNumber) {
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
    }

    println("Today is $day")
}