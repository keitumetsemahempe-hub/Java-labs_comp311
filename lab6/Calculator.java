public class Calculator {

    // Keeps track of how many times multiply() is called
    private int callCount = 0;

    // Static method
    static int add(int a, int b) {
        return a + b;
    }

    // Instance method
    int multiply(int a, int b) {
        callCount++;
        return a * b;
    }

    public static void main(String[] args) {

        // Call the static method using the class name
        System.out.println(Calculator.add(5, 3));

        // Create a Calculator object
        Calculator calc = new Calculator();

        // Call the instance method using the object
        System.out.println(calc.multiply(4, 2));
        System.out.println(calc.multiply(3, 5));

        // Show how many times multiply() was called
        System.out.println("Calls: " + calc.callCount);
    }
}
