class Book(val title: String, val author: String, val isbn: String) {
    fun displayDetails() {
        println("Title: $title, Author: $author, ISBN: $isbn")
    }
}

class Library {
    private val books: MutableList<Book> = mutableListOf()

    fun addBook(book: Book) {
        books.add(book)
        println("Book added: ${book.title}")
    }

    fun removeBook(isbn: String) {
        val book = books.find { it.isbn == isbn }
        if (book != null) {
            books.remove(book)
            println("Book removed: ${book.title}")
        } else {
            println("Book not found")
        }
    }

    fun listBooks() {
        if (books.isEmpty()) {
            println("No books available")
        } else {
            println("Listing all books:")
            books.forEach { it.displayDetails() }
        }
    }
}

fun main() {
    val library = Library()

    // Create some books
    val book1 = Book("The Catcher in the Rye", "J.D. Salinger", "1234567890")
    val book2 = Book("To Kill a Mockingbird", "Harper Lee", "2345678901")
    val book3 = Book("1984", "George Orwell", "3456789012")

    // Add books to the library
    library.addBook(book1)
    library.addBook(book2)
    library.addBook(book3)

    // List all books
    library.listBooks()

    // Remove a book
    library.removeBook("2345678901")

    // List all books after removal
    library.listBooks()
}

