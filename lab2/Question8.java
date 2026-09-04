import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {

        try {
            // Open numbers.txt for reading
            File file = new File("numbers.txt");
            Scanner input = new Scanner(file);

            // Variables to count even and odd numbers
            int evenCount = 0;
            int oddCount = 0;

            // Read every number in the file
            while (input.hasNextInt()) {

                int number = input.nextInt();

                // Check if the number is even
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    // If it is not even, it is odd
                    oddCount++;
                }
            }

            // Close the input file
            input.close();

            // Create evenodd.txt
            FileWriter writer = new FileWriter("evenodd.txt");

            // Write the counts to the file
            writer.write("Even numbers: " + evenCount + "\n");
            writer.write("Odd numbers: " + oddCount + "\n");

            // Close the output file
            writer.close();

            System.out.println("Even and odd counts saved to evenodd.txt.");

        } catch (IOException e) {

            // Handle file errors
            System.out.println("Error reading or writing the file.");
        }
    }
}
