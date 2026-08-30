import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read a whole number
        System.out.print("Enter a whole number: ");
        int number = input.nextInt();

        // Read a decimal number
        System.out.print("Enter a decimal number: ");
        double decimal = input.nextDouble();

        // Read one word
        System.out.print("Enter a single word: ");
        String word = input.next();

        // Print all values
        System.out.println("You entered " + number + ", " + decimal
                + ", and the word " + word + "\".");
    }
}
