public class Question6 {

    public static void main(String[] args) {

        // Create an array for 3 books
        Book[] books = new Book[3];

        // Add three books
        books[0] = new Book("Stepping towards success", "TTM", 18.50);
        books[1] = new Book("The Hobbit", "J.R.R. Tolkien", 20.50);
        books[2] = new Book("Grace", "G.Orbert", 15.99);

        // Print every book using a loop
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getSummary());
        }
    }
}
