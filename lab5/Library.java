// Library class
import java.util.ArrayList;

public class Library {

    // List that stores Book objects
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book b) {
        books.add(b);
    }

    // Print all books
    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book.getSummary());
        }
    }
}
