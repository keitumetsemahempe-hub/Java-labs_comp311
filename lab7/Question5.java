import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        // Variable to store the total number of words
        int wordCount = 0;

        // Try to open story.txt
        try {
            File file = new File("story.txt");

            // Scanner reads the file
            Scanner scanner = new Scanner(file);

            // Read the file line by line
            while (scanner.hasNextLine()) {

                // Get the current line
                String line = scanner.nextLine();

                // Create a Scanner for the current line
                Scanner lineScanner = new Scanner(line);

                // Count each word on this line
                while (lineScanner.hasNext()) {
                    lineScanner.next();
                    wordCount++;
                }

                // Close the line scanner
                lineScanner.close();
            }

            // Close the file scanner
            scanner.close();

            // Print the total number of words
            System.out.println("Number of words: " + wordCount);

        } catch (FileNotFoundException e) {

            // Message if story.txt cannot be found
            System.out.println("Could not find story.txt");
        }
    }
}
