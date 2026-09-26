import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {

        // Variable to store the total
        int total = 0;

        // Try to open numbers.txt
        try {
            File file = new File("numbers.txt");

            // Scanner reads the numbers
            Scanner scanner = new Scanner(file);

            // Read each number
            while (scanner.hasNextInt()) {

                // Get the number
                int number = scanner.nextInt();

                // Add the number to the total
                total = total + number;
            }

            // Close the scanner
            scanner.close();

            // Print the total
            System.out.println("Total: " + total);

        } catch (FileNotFoundException e) {

            // Friendly message if the file is missing
            System.out.println("Could not find numbers.txt.");
        }
    }
}
