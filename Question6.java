import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        // ask for three scores
        System.out.print("Enter three scores: ");
        double score1 = scanner.nextDouble();
        double score2 = scanner.nextDouble();
        double score3 = scanner.nextDouble();

        // calculate average
        double average = (score1 + score2 + score3) / 3;

        // display result
        System.out.println("Average: " + average);
    }
}
