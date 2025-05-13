import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];

        System.out.println("Enter the Elements into  teh array:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Normal Array is:");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Invertted inarray is:");
        for(int i= 5-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
