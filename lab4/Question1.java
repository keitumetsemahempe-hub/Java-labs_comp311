import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) throws FileNotFoundException {

        // Create a String array with 20 spaces
        String[] names = new String[20];

        // Open the names.txt file
        Scanner input = new Scanner(new File("names.txt"));

        // Start at position 0 in the array
        int i = 0;

        // Read words while there are words and the array is not full
        while (input.hasNext() && i < 20) {

            // Store the word in the array
            names[i] = input.next();

            // Move to the next position
            i++;
        }

        // Close the file
        input.close();

        // Display the names stored in the array
        for (int j = 0; j < i; j++) {
            System.out.println(names[j]);
        }
    }
}
