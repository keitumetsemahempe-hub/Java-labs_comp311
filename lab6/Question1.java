public class Question1 {

    // Returns true if the number is even
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

        // Call the method a few times
        System.out.println(isEven(4));
        System.out.println(isEven(7));
        System.out.println(isEven(10));
        System.out.println(isEven(13));
    }
}
