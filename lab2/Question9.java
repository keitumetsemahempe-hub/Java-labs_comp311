import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {

        try {
            // Open numbers.txt for reading
            File file = new File("numbers.txt");
            Scanner input = new Scanner(file);

            // Variables for positive numbers
            long positiveTotal = 0;
            int positiveCount = 0;

            // Variables for negative numbers
            long negativeTotal = 0;
            int negativeCount = 0;

            // Read every number in the file
            while (input.hasNextInt()) {

                int number = input.nextInt();

                // Check if the number is positive
                if (number > 0) {
                    positiveTotal = positiveTotal + number;
                    positiveCount++;
                }

                // Check if the number is negative
                else if (number < 0) {
                    negativeTotal = negativeTotal + number;
                    negativeCount++;
                }
            }

            // Close the input file
            input.close();

            // Create signs.txt
            FileWriter writer = new FileWriter("signs.txt");

            // Write the positive results
            writer.write("Positive total: " + positiveTotal + "\n");
            writer.write("Positive count: " + positiveCount + "\n");

            // Write the negative results
            writer.write("Negative total: " + negativeTotal + "\n");
            writer.write("Negative count: " + negativeCount + "\n");

            // Close the output file
            writer.close();

            System.out.println("Positive and negative results saved to signs.txt.");

        } catch (IOException e) {

            // Handle file errors
            System.out.println("Error reading or writing the file.");
        }
    }
}
