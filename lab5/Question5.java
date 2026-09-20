public class Question5 {

    public static void main(String[] args) {

        // Create a Book object
        Book book = new Book("The Hobbit", "J.R.R. Tolkien", 20.50);

        // Display the original details
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());

        // Change the details using setters
        book.setTitle("Grace");
        book.setAuthor("G.Orbert");
        book.setPrice(15.99);

        // Display the changed details
        System.out.println();
        System.out.println("After changing the values:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());
    }
}
