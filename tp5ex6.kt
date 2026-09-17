import java.awt.print.Book
class Library(val libraryName : String) {
    inner class Book(val title: String, val authors: String){
        fun AfficherDetails() {
            println("library $libraryName")
            println("title $title")
            println("authors $authors ")
        }
    }
}
fun main() {
    val library = Library("harefred")
    val book = library.Book("antygone","yakopuybi")
    book.AfficherDetails()

}
