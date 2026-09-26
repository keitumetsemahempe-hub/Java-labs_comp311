import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        try {
            // Open results.txt for reading
            File file = new File("results.txt");
            Scanner scanner = new Scanner(file);

            // Create passed.txt for writing
            PrintWriter writer = new PrintWriter("passed.txt");

            // Read every line in results.txt
            while (scanner.hasNextLine()) {

                // Get one line, for example: John,75
                String line = scanner.nextLine();

                // Split the line at the comma
                String[] parts = line.split(",");

                // Get the student's name
                String name = parts[0];

                // Get the student's score
                int score = Integer.parseInt(parts[1]);

                // Check if the score is 50 or above
                if (score >= 50) {

                    // Write the student to passed.txt
                    writer.println(name + "," + score);
                }
            }

            // Close the files
            scanner.close();
            writer.close();

            System.out.println("Passed students saved successfully.");

        } catch (FileNotFoundException e) {

            // Message if results.txt cannot be found
            System.out.println("Could not find results.txt.");
        }
    }
}
