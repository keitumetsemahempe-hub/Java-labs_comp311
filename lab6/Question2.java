public class Question2 {

    // Calculates and returns the area of a circle
    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        // Call the method with two different radii
        System.out.println(circleArea(3));
        System.out.println(circleArea(2));
    }
}
