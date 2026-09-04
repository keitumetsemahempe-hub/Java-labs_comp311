import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        try {
            // Open numbers.txt for reading
            File file = new File("numbers.txt");
            Scanner input = new Scanner(file);

            // Start with the first number
            int firstNumber = input.nextInt();

            int smallest = firstNumber;
            int largest = firstNumber;

            // Store the total of all numbers
            long sum = firstNumber;

            // Count how many numbers we have read
            int count = 1;

            // Read the rest of the numbers
            while (input.hasNextInt()) {

                int number = input.nextInt();

                // Add the number to the total
                sum = sum + number;

                // Check if this is the smallest number
                if (number < smallest) {
                    smallest = number;
                }

                // Check if this is the largest number
                if (number > largest) {
                    largest = number;
                }

                // Increase the count
                count++;
            }

            // Calculate the average
            double average = (double) sum / count;

            // Close the input file
            input.close();

            // Create stats.txt
            FileWriter writer = new FileWriter("stats.txt");

            // Write the results to the file
            writer.write("Smallest: " + smallest + "\n");
            writer.write("Largest: " + largest + "\n");
            writer.write("Average: " + average + "\n");

            // Close the output file
            writer.close();

            System.out.println("Statistics saved to stats.txt.");

        } catch (IOException e) {

            // Handle file errors
            System.out.println("Error reading or writing the file.");
        }
    }
}
