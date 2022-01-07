package Exercises

fun main (args: Array<String>) {
    spice()
}

fun spice() {
    val spice = SimpleSpice()
    println("Name: ${spice.name}, " +
            "Heat: ${spice.heat}")
}

fun spicesList() {
    val spiceList = listOf<Spice>(Spice("curry", "mild"), Spice("curcuma", "low"), Spice("chili", "high"))
}