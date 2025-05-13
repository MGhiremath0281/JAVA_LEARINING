/*StringBuilder in Java
Unlike String, StringBuilder is mutable. It allows you to modify the content of the string without
creating a new object every time, which makes it more efficient for operations like string concatenation 
or modification inside loops.

Why use StringBuilder?
If you need to perform many modifications to a string (e.g., concatenating strings repeatedly), 
StringBuilder is preferred over String because it reduces overhead. */

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object with initial content
        StringBuilder sb = new StringBuilder("Hello");
        
        // Append: You can append (add) text to the existing string.
        sb.append(", World!");  // Adds text to the existing StringBuilder object
        System.out.println(sb);  // Output: Hello, World!

        // Insert: You can insert text at a specific position in the string.
        sb.insert(5, ", World");
        System.out.println(sb);  // Output: Hello, World

        // Replace: You can replace a part of the string with new content.
        sb.replace(0, 5, "Hi");
        System.out.println(sb);  // Output: Hi, World

        // Delete: You can remove part of the string.
        sb.delete(5, 13);  // Deletes from index 5 to 13 (exclusive)
        System.out.println(sb);  // Output: Hi

        // Reverse: You can reverse the string.
        sb.reverse();
        System.out.println(sb);  // Output: iH

        // Capacity: StringBuilder has an initial capacity (the space allocated for its content).
        // You can check or modify the capacity.
        System.out.println("Capacity: " + sb.capacity());  // Output: 16 (default capacity)
        sb.ensureCapacity(100);  // Expands the capacity if needed
        System.out.println("New Capacity: " + sb.capacity());  // Output: 100
    }
}
