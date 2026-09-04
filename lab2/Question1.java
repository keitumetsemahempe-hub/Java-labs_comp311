import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);

        // Ask for the score
        System.out.print("Enter score: ");
        double score = input.nextDouble();

        // Check the grade
        if (score >= 80) {
            System.out.println("Grade: A");
        } else if (score >= 70) {
            System.out.println("Grade: B");
        } else if (score >= 60) {
            System.out.println("Grade: C");
        } else if (score >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        input.close();
    }
}
