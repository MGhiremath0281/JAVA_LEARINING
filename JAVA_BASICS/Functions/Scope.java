public class Scope{
    static int globalVar = 100; // class level (global)

    public static void show() {
        int localVar = 50; // only available in this method
        System.out.println("Local: " + localVar);
        System.out.println("Global: " + globalVar);
    }

    public static void main(String[] args) {
        show();
        // System.out.println(localVar); // Error: out of scope
    }
}
