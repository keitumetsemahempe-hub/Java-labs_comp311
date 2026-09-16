import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        // Create a Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a whole number
        System.out.print("Enter a whole number: ");
        int number = input.nextInt();

        // Convert the number to binary
        String binary = Integer.toBinaryString(number);

        // Print the binary representation
        System.out.println("Binary: " + binary);

        // Close the Scanner
        input.close();
    }
}
