fun main(args: Array<String>){
    val birthday = getBirthday()
    println("Your fortune is ${getFortuneCookie(birthday)})")
}

fun getFortuneCookie(birthday : Int) : String {
    val birthday = birthday
    val fortunes = listOf("You will have a great day",
                          "Things will go well for you today",
                          "Enjoy a wonderful day of success",
                          "Be humble and all will turn out well",
                          "Today is a good day for exercising restraint",
                          "Take it easy and enjoy life!",
                          "Treasure your friends because they are your greatest fortune")

    return when(birthday) {
        28, 31 -> fortunes[3]
        in 1..7 -> fortunes[1]
        else -> fortunes[birthday/fortunes.size]
    }
}

fun getBirthday() : Int {
    print("Insert your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}