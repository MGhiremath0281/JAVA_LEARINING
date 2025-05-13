import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter num1 and num2:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        System.out.println("Enter the operator (+, -, *, /, %):");
        String operator = sc.next();
        
        switch(operator) {
            case "+":
                System.out.println("Sum = " + (num1 + num2));
                break;
            case "-":
                System.out.println("Difference = " + (num1 - num2));
                break;
            case "*":
                System.out.println("Multiplication = " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Division = " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case "%":
                System.out.println("Remainder = " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}
