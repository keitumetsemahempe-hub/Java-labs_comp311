public class Question4 {

    // Adds two integers
    static int combine(int a, int b) {
        return a + b;
    }

    // Joins two Strings
    static String combine(String a, String b) {
        return a + b;
    }

    // Adds two decimal numbers
    static double combine(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(combine(22, 13));
        System.out.println(combine("Sure ", "Bro"));
        System.out.println(combine(2.5, 2.5));
    }
}
