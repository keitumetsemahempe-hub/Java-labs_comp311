import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        // Variable to keep track of the number of lines
        int lineCount = 0;

        // Try to open story.txt
        try {
            File file = new File("story.txt");

            // Scanner reads the file
            Scanner scanner = new Scanner(file);

            // Go through every line in the file
            while (scanner.hasNextLine()) {

                // Read the line
                scanner.nextLine();

                // Add 1 to the line count
                lineCount++;
            }

            // Close the scanner
            scanner.close();

            // Print the total number of lines
            System.out.println("Number of lines: " + lineCount);

        } catch (FileNotFoundException e) {

            // Message if story.txt cannot be found
            System.out.println("Could not find story.txt");
        }
    }
}
