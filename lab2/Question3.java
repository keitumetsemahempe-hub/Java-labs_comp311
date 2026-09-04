import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        try {
            // Open the file
            File file = new File("students.txt");
            Scanner input = new Scanner(file);

            // Read each line
            while (input.hasNextLine()) {

                String line = input.nextLine();

                // Separate the name and score
                String[] parts = line.split(",");

                String name = parts[0];
                double score = Double.parseDouble(parts[1]);

                // Print the student details
                System.out.println("Name: " + name);
                System.out.println("Score: " + score);
                System.out.println();
            }

            input.close();

        } catch (FileNotFoundException e) {
            // Show an error if the file is missing
            System.out.println("students.txt not found.");
        }
    }
}
