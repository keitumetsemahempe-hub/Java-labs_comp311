public class Question9 {

    // Parent class
    static class Animal {

        // Overloaded methods
        void speak() {
            System.out.println("A great day");
        }

        void speak(String sound) {
            System.out.println("Animal says " + sound);
        }
    }

    // Child class
    static class Cat extends Animal {

        // Overriding the speak() method
        @Override
        void speak() {
            System.out.println("Blessed indeed");
        }
    }

    public static void main(String[] args) {

        Animal animal = new Animal();

        // Using overloaded methods
        animal.speak();
        animal.speak("hello");

        // Using the overridden method
        Cat cat = new Cat();
        cat.speak();
    }
}
