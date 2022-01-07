package Aquarium

interface AquariumActino {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("swim")
    }
}

interface FishAction2 {
    fun eat()
}

abstract class AquariumFish2: FishAction2 {
    abstract val color: String
    override fun eat() = println("yum")
}

// Composition
fun main(args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

// Start with breaking AcquariumFish into FishAction and FishColor
interface FishAction3 {
    fun eat()
}

interface FishColor {
    val color: String
}

// Update Plecostomous to implement both FishAction and FishColor, and you can remove the inheritance
// from AcquariumFish, without changing anything in Plecostomous class

// You can declare a class, but with the word object, Kotlin will make exactly 1 instance of it
object GoldColor: FishColor {
    override val color = "Gold"
} // It doesn't make sense to have more than 1 instances of GoldColor, as it only provides the color gold
// Now you can update Plecosotmous
class Plecostomous2: FishAction3, FishColor by GoldColor {
    override fun eat() { //everytime you ask for it's color, a call to GoldColor instance is issued
        println("eat algae")
    }
}

// This is how you implement the Singleton pattern in Kotlin