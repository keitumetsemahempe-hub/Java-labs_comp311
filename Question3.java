import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
     

     // create scanner //   
     Scanner scanner = new Scanner(System.in);

     // request user's name //
     System.out.print("Enter your name: ");
     String name = scanner.nextLine();

     // request user's age //
     System.out.print("Enter your age: ");
     int age = scanner.nextInt();

    //print the result//
    System.out.println("Good day " + name +" based on what you provided you are " + age + " years old");

    }
}
