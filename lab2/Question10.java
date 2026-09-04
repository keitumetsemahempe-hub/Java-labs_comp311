import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        // Create Scanner to get the number from the user
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number to search for: ");
        int searchNumber = input.nextInt();

        // Start by assuming the number is not found
        boolean found = false;

        try {
            // Open numbers.txt
            File file = new File("numbers.txt");
            Scanner fileInput = new Scanner(file);

            // Search through every number in the file
            while (fileInput.hasNextInt()) {

                int number = fileInput.nextInt();

                // Check if the number matches
                if (number == searchNumber) {
                    found = true;
                    break;
                }
            }

            // Close the file
            fileInput.close();

            // Print true or false
            System.out.println(found);

        } catch (FileNotFoundException e) {

            // Display an error if numbers.txt cannot be found
            System.out.println("numbers.txt was not found.");
        }

        // Close the keyboard input
        input.close();
    }
}

