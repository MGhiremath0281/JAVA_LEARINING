import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();
        
        // Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();
        
        // Check if the string is a palindrome
        if (str.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
