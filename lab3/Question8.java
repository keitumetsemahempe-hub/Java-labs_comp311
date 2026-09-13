import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user for a word or sentence
        System.out.print("Enter a word or sentence: ");
        String text = input.nextLine();

        // Start the vowel count at 0
        int vowels = 0;

        // Go through each character in the text
        for (int i = 0; i < text.length(); i++) {

            // Get the current character
            char letter = text.charAt(i);

            // Check if the character is a vowel
            if (letter == 'a' || letter == 'e' || letter == 'i'
                    || letter == 'o' || letter == 'u'
                    || letter == 'A' || letter == 'E' || letter == 'I'
                    || letter == 'O' || letter == 'U') {

                // Add 1 to the vowel count
                vowels++;
            }
        }

        // Print the number of vowels
        System.out.println("Number of vowels = " + vowels);

        // Close Scanner
        input.close();
    }
}
