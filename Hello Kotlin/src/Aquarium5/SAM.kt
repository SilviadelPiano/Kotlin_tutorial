package Aquarium5

interface Runnable {
    fun run()
}

interface Callable<T> {
    fun call(): T
}

fun example() {
    val runnable = object: Runnable {
        override fun run() {
            println("I'm a runnable")
        }
    }
    //JavaRun.runNow(runnable) Gives error for some reason
}

fun example1() {
    JavaRun.runNow {
        println("Passing a lambda as a runnable")
    }
}