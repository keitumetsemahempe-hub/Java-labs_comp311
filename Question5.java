import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        // ask for first number
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        // ask for second number
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // calculations
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;
        double quotient = firstNumber / secondNumber;
        double remainder = firstNumber % secondNumber;

        // show results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
