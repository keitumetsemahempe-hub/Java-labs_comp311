import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Variable to store the user's number
        int number;

        // Start the total at 0
        int total = 0;

        // The loop runs at least once
        do {

            // Ask the user for a number
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextInt();

            // Add the number to the running total
            total = total + number;

        // Keep looping until the user enters 0
        } while (number != 0);

        // Display the final total
        System.out.println("Final total = " + total);

        // Close Scanner
        input.close();
    }
}

