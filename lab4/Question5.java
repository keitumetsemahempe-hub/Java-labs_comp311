import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        // Create a Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user for a word or phrase
        System.out.print("Enter a word or phrase: ");
        String text = input.nextLine();

        // Convert the text to lowercase
        text = text.toLowerCase();

        // Remove spaces from the text
        text = text.replace(" ", "");

        // Assume the text is a palindrome
        boolean palindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < text.length() / 2; i++) {

            // Compare the character at the front and back
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        // Print the result
        if (palindrome) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        // Close the Scanner
        input.close();
    }
}
