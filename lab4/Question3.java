import java.io.FileWriter;
import java.io.IOException;

public class Question3 {

    public static void main(String[] args) throws IOException {

        // Create an integer array
        int[] numbers = {12,16,89,2,75,55,23};

        // Start the sum at 0
        int sum = 0;

        // Start smallest and largest with the first number
        int smallest = numbers[0];
        int largest = numbers[0];

        // Go through every number in the array
        for (int i = 0; i < numbers.length; i++) {

            // Add the number to the sum
            sum = sum + numbers[i];

            // Check if this number is smaller
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            // Check if this number is larger
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Create a new file
        FileWriter output = new FileWriter("results.txt");

        // Write the results to the file
        output.write("Sum: " + sum + "\n");
        output.write("Smallest: " + smallest + "\n");
        output.write("Largest: " + largest + "\n");

        // Close the file
        output.close();
    }
}
