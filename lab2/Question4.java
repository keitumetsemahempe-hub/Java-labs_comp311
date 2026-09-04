import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        try {

            // Create a new file called results.txt
            FileWriter writer = new FileWriter("results.txt");

            // Loop 5 times because we need 5 students
            for (int i = 1; i <= 5; i++) {

                // Ask for the student's name
                System.out.print("Enter student " + i + " name: ");
                String name = input.nextLine();

                // Ask for the student's score
                System.out.print("Enter student " + i + " score: ");
                String score = input.nextLine();

                // Write the name and score to the file
                // The comma separates the name and score
                writer.write(name + "," + score + "\n");
            }

            // Close the file
            writer.close();

            // Tell the user that the records were saved
            System.out.println("Student records saved successfully.");

        } catch (IOException e) {

            // Display an error if the file cannot be created
            System.out.println("Error writing to the file.");
        }

        // Close the Scanner
        input.close();
    }
}
