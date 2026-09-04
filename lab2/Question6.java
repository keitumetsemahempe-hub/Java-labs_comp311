import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number from 1 to 7: ");
        int day = input.nextInt();

        // Use switch to determine the day
        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid number. Please enter a number from 1 to 7.");
        }

        // Close the Scanner
        input.close();
    }
}
