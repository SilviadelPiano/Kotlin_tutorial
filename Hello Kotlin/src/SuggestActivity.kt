fun main(args: Array<String>) {
    //println(whatShouldIDoToday("sad"))
    print("What is your mood today?")
    val mood = readLine()
}

fun whatShouldIDoToday(mood: String,
                       weather: String = "sunny",
                       temperature: Int = 24): String {
    /*return when {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        mood == "sad" && weather =="rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read"
    }*/

    return when {
        shouldWalk(mood, weather, temperature) -> "go for a walk"
        shouldStayInBed(mood, weather, temperature) -> "stay in bed"
        shouldSwim(mood, weather, temperature) -> "go swimming"
        else -> "Stay home and read"
    }
}

fun shouldWalk(mood: String, weather: String, temperature: Int) = mood == "happy" && weather == "sunny"
fun shouldStayInBed(mood: String, weather: String, temperature: Int) = mood == "sad" && weather =="rainy" && temperature == 0
fun shouldSwim(mood: String, weather: String, temperature: Int) = temperature > 35