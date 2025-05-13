import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int sum = 0;

        while (number > 0) {
            sum += number % 10;  // Add the last digit
            number = number / 10; // Remove the last digit
        }
        System.out.println("Sum of digits: " + sum);
    }
}
