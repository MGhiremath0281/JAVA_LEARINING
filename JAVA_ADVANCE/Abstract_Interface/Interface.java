// Interface - only method declaration, no body
interface Animal {
    void makeSound();  // Abstract method
    void eat();        // Another abstract method
}

// Dog class implements the interface
class Dog implements Animal {
    // Must override all methods of the interface
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats bones");
    }
}

// Main class to run the code
public class Interface {
    public static void main(String[] args) {
        // You can't create an object of interface
        // But you can use interface reference
        Animal myDog = new Dog();  // Interface reference, Dog object
        myDog.makeSound();         // Output: Dog barks
        myDog.eat();               // Output: Dog eats bones
    }
}
