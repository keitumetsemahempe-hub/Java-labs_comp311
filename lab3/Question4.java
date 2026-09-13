import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Variable to store the user's choice
        int choice;

        // The do-while loop runs at least once
        do {

            // Display the menu
            System.out.println("1. Continue");
            System.out.println("2. Exit");

            // Ask the user to choose
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

        // Keep showing the menu until the user enters 2
        } while (choice != 2);

        // This prints when the user chooses 2
        System.out.println("Goodbye!");

        // Close Scanner
        input.close();
    }
}
