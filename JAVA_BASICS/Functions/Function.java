/*In Java, functions are called methods and are defined inside a class.
 * Syntax : 
 * returnType methodName(parameters) {
    // method body
    return value; // if returnType is not void
}
*/
//Example for function 
public class Function{
    static void greet(String name){
        System.out.println("Hello "+name);
    }

public static void main(String args[]){
    greet("Muktananda");
}    
}