public class Question3 {

    public static void main(String[] args) {

        // Create two Book objects
        Book book1 = new Book("Stepping towards success", "TTM", 18.50);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 20.50);

        // Print Book 1
        System.out.println("Book 1");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: " + book1.getPrice());

        System.out.println();

        // Print Book 2
        System.out.println("Book 2");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Price: " + book2.getPrice());
    }
}
