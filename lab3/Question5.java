import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Variable to store the user's number
        int number;

        // Ask the user at least once
        do {

            // Ask the user for a number
            System.out.print("Enter a number between 1 and 10: ");
            number = input.nextInt();

        // Repeat if the number is outside 1 to 10
        } while (number < 1 || number > 10);

        // The number is valid
        System.out.println("Valid number: " + number);

        // Close Scanner
        input.close();
    }
}
