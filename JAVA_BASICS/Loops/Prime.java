import java.util.Scanner;
public class Prime {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to chek the prime:");
        int num = sc.nextInt();
        boolean isprime = true;

        if(num <=0){
            isprime=false;
        }
        else{
        for(int i=2;i<=num/2;i++){
            if(i%2 == 0){
                isprime = true;
                break;
            }
        }
    }
    
    if(isprime){
        System.out.println("Number is prime!");
    }
    else{
        System.out.println("Number is not prime");
    }
}
}