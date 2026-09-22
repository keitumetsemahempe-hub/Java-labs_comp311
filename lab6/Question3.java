public class Question3 {

    // Prints the banner directly
    static void printBanner() {
        System.out.println("===================");
    }

    // Returns the banner as a String
    static String getBanner() {
        return "============";
    }

    public static void main(String[] args) {

        // Calls the void method
        printBanner();

        // Calls the method that returns a String
        String banner = getBanner();
        System.out.println(banner);
    }
}
