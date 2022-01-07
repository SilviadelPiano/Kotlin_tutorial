package Aquarium

fun String.hasSpaces(): Boolean {
    val found: Char? = this.find { it == ' '}
    return found != null
}

// You can also write it like this
// fun String.hasSpaces() = find { it == ' ' } != null

fun extensionsExample() {
    "Does it have space?".hasSpaces() // true
}

open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int): AquariumPlant("Green", size)

fun AquariumPlant.isRed() = color == "Red"

//fun AquariumPlant.isBig() = size > 50 // gives an error because size is private

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun staticExample() {
    val plant = GreenLeafyPlant(size = 50)
    plant.print() // GreenLeafyPlant

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print() // AquariumPlant
}

fun AquariumPlant?.pull() {
    this?.apply { println("removing $this") }
}

fun nullableExample() {
    val plant: AquariumPlant? = null
    plant.pull() // ok
}