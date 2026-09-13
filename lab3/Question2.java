import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user for a positive whole number
        System.out.print("Enter a positive whole number: ");
        int number = input.nextInt();

        // Start counting at 1
        int count = 1;

        // Start the sum at 0
        int sum = 0;

        // Keep looping while count is less than or equal to number
        while (count <= number) {

            // Add count to the sum
            sum = sum + count;

            // Increase count by 1
            count++;
        }

        // Display the final sum
        System.out.println("Sum = " + sum);

        // Close the Scanner
        input.close();
    }
}
