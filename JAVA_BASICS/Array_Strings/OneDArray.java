import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for size
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input values
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Print values
        System.out.println("Array elements are:");
        for(int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        sc.close();
    }
}
