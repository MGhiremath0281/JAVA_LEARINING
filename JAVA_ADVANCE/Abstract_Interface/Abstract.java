//Abstraction is the process of hiding the internal implementation details and showing only the essential features of an object.
// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Regular method (has a body)
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Providing implementation for abstract method
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class to run the code
public class Abstract{
    public static void main(String[] args) {
        Animal dog = new Dog(); // Abstract class reference, Dog object
        dog.makeSound();        // Calls Dog's version of makeSound()
        dog.sleep();            // Calls common method from Animal

        Animal cat = new Cat();
        cat.makeSound();        // Calls Cat's version
        cat.sleep();
    }
}
