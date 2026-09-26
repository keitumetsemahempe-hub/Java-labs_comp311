import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        // Try to read story.txt and create story_copy.txt
        try {

            // Open story.txt for reading
            File inputFile = new File("story.txt");
            Scanner scanner = new Scanner(inputFile);

            // Create story_copy.txt for writing
            PrintWriter writer = new PrintWriter("story_copy.txt");

            // Read every line from story.txt
            while (scanner.hasNextLine()) {

                // Store the current line
                String line = scanner.nextLine();

                // Write the same line to story_copy.txt
                writer.println(line);
            }

            // Close both files
            scanner.close();
            writer.close();

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {

            // Friendly message if story.txt cannot be found
            System.out.println("Could not find story.txt.");
        }
    }
}
