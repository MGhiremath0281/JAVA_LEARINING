import java.util.Scanner;

public class input {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter you Name:");
String name = sc.nextLine();

System.out.println("Enter your age:");
int age = sc.nextInt();

System.out.println("Hey your name:" +name+ "Age is:" +age);

}
}
