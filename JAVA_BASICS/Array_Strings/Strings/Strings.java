/*Strings in Java
In Java, String is a built-in class that is used to represent a sequence of characters (text).
Strings are immutable, meaning once you create a string, you cannot change its value.
If you modify a string, a new string object is created. */
public class Strings{
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str);
        //Concatenation: You can combine (concatenate) two strings using the + operator.
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2;
        System.out.println(result);  // Output: Hello World
        
        //String Length:You can find the length of a string using .length().
        System.out.println(str.length());
 
        //Substring:You can extract a part of the string using .substring().
        String sub = str.substring(7, 12);  // Extracts from index 7 to index 12 (exclusive)
        System.out.println(sub);  // Output: World

        /*String Comparison:You can compare two strings using .
        equals() for content comparison and .compareTo() for lexicographical comparison.*/
        String str_1 = "Hello";
        String str_2 = "hello";
        System.out.println(str1.equals(str_2));  // Output: false (case-sensitive)
        System.out.println(str1.compareTo(str_2));  // Output: Negative (because 'H' < 'h')
   //String Conversion:You can convert a string to uppercase or lowercase using .toUpperCase() and .toLowerCase().
        System.out.println(str.toUpperCase());  // Output: HELLO
        System.out.println(str.toLowerCase());  // Output: hello

    }
}
