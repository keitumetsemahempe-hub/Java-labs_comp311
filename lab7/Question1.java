import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        // Try to open the story.txt file
        try {
            File file = new File("story.txt");

            // Scanner will read the file
            Scanner scanner = new Scanner(file);

            // Read and print every line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            // Close the scanner when finished
            scanner.close();

        } catch (FileNotFoundException e) {

            // This message appears if story.txt cannot be found
            System.out.println("Could not find story.txt");
        }
    }
}
