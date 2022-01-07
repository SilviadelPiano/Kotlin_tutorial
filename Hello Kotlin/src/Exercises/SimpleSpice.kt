package Exercises

class SimpleSpice {

    val name: String = "curry"
    val spicinessLevel: String = "mild"
    val heat: Int
        get() = when(spicinessLevel) {
            "mild" -> 5
            else -> 6
        }
}