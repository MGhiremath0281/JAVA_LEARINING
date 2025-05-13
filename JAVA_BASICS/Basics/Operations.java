import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        System.out.println("Enter your height in cm:");
        double height = sc.nextDouble();

        // Typecasting
        float float_height = (float) height / 100;
        int age_nextyear = age + 1;

        // Operators
        // Relational
        System.out.println("\nRelational operators:");
        System.out.println("Is age > 18? " + (age > 18));
        System.out.println("Is height > 150? " + (height > 150));

        // Logical
        boolean isAdult = age >= 18;
        boolean isTall = height >= 150;

        System.out.println("\nLogical operations:");
        System.out.println("The person is Adult & Tall: " + (isAdult && isTall));
        System.out.println("The person is Adult or Tall: " + (isAdult || isTall));
        System.out.println("The person is NOT Adult: " + (!isAdult));

        // Summary
        System.out.println("\nSummary:");
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        System.out.println("Next year, you will be " + age_nextyear + ".");
        System.out.println("Your height in meters is: " + float_height + " m");
    }
}
