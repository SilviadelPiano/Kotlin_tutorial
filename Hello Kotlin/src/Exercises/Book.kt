package Exercises

open class Book(val title: String = "", val author: String = "") {

    private val currentPage: Int = 1

    open fun readPage() = currentPage + 1
}

class eBook(val format: String = "text") : Book() {

    val wordCount = 0
    override fun readPage() = wordCount + 250
}