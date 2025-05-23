public class FibonacciRecursive {
    // Recursive function to return nth Fibonacci number
    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // print first 10 Fibonacci numbers
        System.out.println("Fibonacci Series (recursive):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
