package Aquarium5

data class Fish(var name: String)

fun main (args: Array<String>) {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish("splashy")

    with (fish.name) { // here we are referring to the object
        capitalize()
    }
    println(run { fish.name })
    println(fish.apply {})

    val fish2 = Fish(name = "splashy").apply { name = "Sharky" }
    println(fish2.name)

    println(fish.let { it.name.capitalize() }
        .let { it + "fish" }
        .let { it.length }
        .let { it + 31 })
}

// the second argument is a function, after ':' we write the class we want to extend (also called the
// receiver object), in this case String
fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}