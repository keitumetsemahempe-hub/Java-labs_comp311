import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user for a whole number
        System.out.print("Enter a whole number: ");
        int number = input.nextInt();

        // Start the factorial at 1
        int factorial = 1;

        // Loop from 1 up to the number
        for (int i = 1; i <= number; i++) {

            // Multiply factorial by the current number
            factorial = factorial * i;
        }

        // Display the final factorial
        System.out.println("Factorial = " + factorial);

        // Close Scanner
        input.close();
    }
}

