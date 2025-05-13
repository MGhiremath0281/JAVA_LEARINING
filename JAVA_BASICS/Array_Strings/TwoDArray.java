import java.util.Scanner;

public class TwoDArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows = sc.nextInt();
        System.out.println("Enter the Number of cols:");
        int cols = sc.nextInt();
         
        int [][] matrix = new int[rows][cols];
        System.out.println("Enter the"+(rows*cols)+"Elements");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("The Matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
           System.out.print(matrix[i][j]+" ");

            }
        
        System.out.println();
        }
        sc.close();
    }
}