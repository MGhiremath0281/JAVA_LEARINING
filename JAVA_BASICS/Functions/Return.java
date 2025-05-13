import java.util.Scanner;

public class Return {
  static int  square(int n){
    return n*n;
  }  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter teh number to find thne square:");
    int n = sc.nextInt();
    int square_res = square(n);
    System.out.println("The square of number is :"+ square_res);
  }
}
