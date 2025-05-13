class Car {
    String color;

    Car(String carColor) {
        color = carColor;
    }

    void displayColor() {
        System.out.println("Car color is: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Blue");
        myCar.displayColor(); // Output: Car color is: Blue
    }
}
