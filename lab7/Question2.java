import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Question2 {

    public static void main(String[] args) {

        // Try to create and write to output.txt
        try {
            // Create a PrintWriter for output.txt
            PrintWriter writer = new PrintWriter("output.txt");

            // Write five lines to the file
            writer.println("My name is Theophillus.");
            writer.println("I am learning Java.");
            writer.println("Java can work with files.");
            writer.println("Writing to files is useful.");
            writer.println("This is my fifth line.");

            // Close the writer when finished
            writer.close();

            System.out.println("The file was created successfully.");

        } catch (FileNotFoundException e) {

            // Display a friendly message if there is a problem
            System.out.println("Could not create the file.");
        }
    }
}
