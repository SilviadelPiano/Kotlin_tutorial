package Exercises

class Spice(val name: String, val spiciness: String = "mild") {

    val heat: Int
        get() = when (spiciness) {
            "low" -> 2
            "mild" -> 5
            "high" -> 8
            else -> 6
        }

    init {
        println("Name: $name, Spiciness: $spiciness, Heat: $heat")
    }
}