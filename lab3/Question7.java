import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop from 1 to 12
        for (int i = 1; i <= 12; i++) {

            // Multiply the number by i and print the result
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close Scanner
        input.close();
    }
}

