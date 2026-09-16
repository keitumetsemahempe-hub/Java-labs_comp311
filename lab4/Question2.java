import java.io.FileWriter;
import java.io.IOException;

public class Question2 {

    public static void main(String[] args) throws IOException {

        // Create a double array
        double[] numbers = {17.4,18.2,13.7,45.7,10.9};

        // Create a new file called numbers.txt
        FileWriter output = new FileWriter("numbers.txt");

        // Write every value in the array to the file
        for (int i = 0; i < numbers.length; i++) {
            output.write(numbers[i] + "\n");
        }

        // Close the file
        output.close();
    }
}
