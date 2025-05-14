// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Subclass 1
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting...");
    }
}

// Subclass 2
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting...");
    }
}

// Main class
public class Assignment {
    public static void main(String[] args) {
        // Runtime Polymorphism
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start(); // Calls Car's start()
        v2.start(); // Calls Bike's start()
    }
}
