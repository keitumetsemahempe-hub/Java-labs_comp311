public class Question9 {

    public static void main(String[] args) {

        // Create a Library
        Library library = new Library();

        // Create some books
        Book book1 = new Book("Stepping towards success", "TTM", 18.50);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 20.50);
        Book book3 = new Book("Grace", "G.Orbert", 15.99);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Print all books
        library.printAllBooks();
    }
}
