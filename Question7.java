import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        // ask for temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // convert Celsius to Fahrenheit
        double fahrenheit = celsius * 9.0 / 5 + 32;

        // display result
        System.out.println(celsius + " degrees Celsius is "
                + fahrenheit + " degrees Fahrenheit.");
    }
}
