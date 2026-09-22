public class Question8 {

    // Parent class
    static class Animal {

        void speak() {
            System.out.println("Animal makes a sound");
        }
    }

    // Child class
    static class Cat extends Animal {

        // Overrides the speak() method
        @Override
        void speak() {
            System.out.println("====Good day====");
        }
    }

    public static void main(String[] args) {

        Cat cat = new Cat();

        // Calls the overridden method
        cat.speak();
    }
}
