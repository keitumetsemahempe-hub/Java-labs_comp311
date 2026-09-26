import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question7 {

    public static void main(String[] args) {

        // Try to open output.txt in append mode
        try {
            FileWriter fileWriter = new FileWriter("output.txt", true);

            // Use PrintWriter to write to the file
            PrintWriter writer = new PrintWriter(fileWriter);

            // Add two new lines to the end of the file
            writer.println("This is an extra line.");
            writer.println("This is another extra line.");

            // Close the writer
            writer.close();

            System.out.println("Two lines were added successfully.");

        } catch (IOException e) {

            // Friendly message if there is a problem
            System.out.println("Could not write to output.txt.");
        }
    }
}

