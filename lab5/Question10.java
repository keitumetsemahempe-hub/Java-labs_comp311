public class Question10 {

    public static void main(String[] args) {

        // Create a Library object
        Library library = new Library();

        // Add four books to the library
        library.addBook(new Book("Stepping towards success", "TTM", 18.50));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien", 20.50));
        library.addBook(new Book("Grace", "G.Orbert", 15.99));
        library.addBook(new Book("1984", "George Orwell", 12.99));

        // Print all books in the library
        library.printAllBooks();
    }
}
