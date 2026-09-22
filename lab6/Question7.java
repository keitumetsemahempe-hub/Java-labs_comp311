public class Question7 {

    // Doubles the value of the parameter
    static void tryToDouble(int number) {
        number = number * 2;
    }

    public static void main(String[] args) {

        int number = 10;

        // Call the method
        tryToDouble(number);

        // The original number has not changed
        System.out.println(number);
    }
}
