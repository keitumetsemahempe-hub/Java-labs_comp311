import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        // Try to open the file
        try {
            File file = new File("missing.txt");

            // Try to read the file
            Scanner scanner = new Scanner(file);

            // Read and print each line
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            // Close the scanner
            scanner.close();

        } catch (FileNotFoundException e) {

            // Friendly message instead of crashing
            System.out.println("Sorry, the file could not be found.");
        }
    }
}
