public class Question8 {

    // Method that returns the cheaper book
    public static Book cheaperBook(Book a, Book b) {

        // Compare the prices
        if (a.getPrice() < b.getPrice()) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        // Create two Book objects
        Book book1 = new Book("Stepping towards success", "TTM", 18.50);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 20.50);

        // Find the cheaper book
        Book cheaper = cheaperBook(book1, book2);

        // Print the cheaper book
        System.out.println("Cheaper book:");
        System.out.println(cheaper.getSummary());
    }
}
