import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        // Create Scanner to read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter their full name
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        // Find the position of the space between the first name and surname
        int space = fullName.indexOf(' ');

        // Get the first name (everything before the space)
        String firstName = fullName.substring(0, space);

        // Get the surname (everything after the space)
        String surname = fullName.substring(space + 1);

        // Get the first letter of the first name and make it uppercase
        String firstInitial = firstName.substring(0, 1).toUpperCase();

        // Get the first letter of the surname and make it uppercase
        String surnameInitial = surname.substring(0, 1).toUpperCase();

        // Join the two initials together with full stops
        String initials = firstInitial + "." + surnameInitial + ".";

        // Display the first name
        System.out.println("First name: " + firstName);

        // Display the surname
        System.out.println("Surname: " + surname);

        // Display the initials
        System.out.println("Initials: " + initials);

        // Close the Scanner
        input.close();
    }
}
