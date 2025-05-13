import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        // Split the string by spaces
        String[] words = str.split("\\s+");
        
        // Count the words
        System.out.println("Word count: " + words.length);
    }
}
