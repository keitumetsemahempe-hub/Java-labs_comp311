import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {

        // This lets us type information using the keyboard
        Scanner input = new Scanner(System.in);

        try {
            // Create the results.txt file
            PrintWriter writer = new PrintWriter("results.txt");

            // Repeat 3 times
            for (int i = 1; i <= 3; i++) {

                // Ask for the student's name
                System.out.print("Enter name: ");
                String name = input.nextLine();

                // Ask for the student's score
                System.out.print("Enter score: ");
                int score = input.nextInt();

                // Move to the next line
                input.nextLine();

                // Save the name and score
                writer.println(name + "," + score);
            }

            // Close the file
            writer.close();

            System.out.println("Done!");

        } catch (FileNotFoundException e) {

            System.out.println("Could not create the file.");
        }

        // Close keyboard input
        input.close();
    }
}

