import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        // Get input from the user
        Scanner input = new Scanner(System.in);

        // Ask for the length
        System.out.print("Enter the length: ");
        double length = input.nextDouble();

        // Ask for the width
        System.out.print("Enter the width: ");
        double width = input.nextDouble();

        // Calculate the area
        double area = length * width;

        // Calculate the perimeter
        double perimeter = 2 * (length + width);

        // Print the results
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        // Close the input
        input.close();
    }
}
