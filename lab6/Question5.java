public class Question5 {

    // Method with only a name
    static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Overloaded method with a name and age
    static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        displayInfo("Theo");
        displayInfo("Keitumetse", 20);
    }
}
