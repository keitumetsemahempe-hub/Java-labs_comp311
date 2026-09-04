import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        try {
            // Open students.txt for reading
            File file = new File("students.txt");
            Scanner input = new Scanner(file);

            // Create grades.txt for writing
            FileWriter writer = new FileWriter("grades.txt");

            // Read each student from the file
            while (input.hasNextLine()) {

                // Read one line
                String line = input.nextLine();

                // Separate the name and score
                String[] student = line.split(",");

                String name = student[0];
                double score = Double.parseDouble(student[1]);

                // Work out the letter grade
                String grade;

                if (score >= 80) {
                    grade = "A";
                } else if (score >= 70) {
                    grade = "B";
                } else if (score >= 60) {
                    grade = "C";
                } else if (score >= 50) {
                    grade = "D";
                } else {
                    grade = "F";
                }

                // Write Name,Score,Grade to grades.txt
                writer.write(name + "," + student[1] + "," + grade + "\n");
            }

            // Close the files
            input.close();
            writer.close();

            System.out.println("Grade report created successfully.");

        } catch (IOException e) {
            // Handle file errors
            System.out.println("Error reading or writing the file.");
        }
    }
}
