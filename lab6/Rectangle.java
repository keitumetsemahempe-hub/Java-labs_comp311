import java.util.Scanner;

public class Rectangle {

    // Calculates and returns the area
    static double area(double length, double width) {
        return length * width;
    }

    // Calculates and returns the perimeter
    static double perimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get length and width from the user
        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        // Display the results
        System.out.println("Area: " + area(length, width));
        System.out.println("Perimeter: " + perimeter(length, width));

        input.close();
    }
}
