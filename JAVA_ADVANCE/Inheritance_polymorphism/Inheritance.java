class Animal {
    void bark() {
        System.out.println("This Animal makes sound!");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("This dog barks!");
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Dog p = new Dog();
        p.bark();  // Inherited method from Animal
        p.sound(); // Defined in Dog
    }
}
