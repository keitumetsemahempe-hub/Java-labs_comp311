import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for the full name
        System.out.print("Enter your full name: ");
        String name = input.nextLine();

        // Display the number of characters
        System.out.println("Characters: " + name.length());

        // Display uppercase and lowercase
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        // Ask for a letter
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();

        // Check if the name starts with the letter
        System.out.println("Starts with letter: " +
                name.toLowerCase().startsWith(letter.toLowerCase()));

        input.close();
    }
}
