package Day20;
import java.util.Scanner;
public class RowWiseSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the dimensions of the matrix:");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int[][] mat = new int[a][b];

        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                mat[i][j] = scan.nextInt();
            }
        }

        for(int i=0;i<a;i++){
            int sum = 0;
            for(int j=0;j<b;j++){
                sum = sum +mat[i][j];
            }
            System.out.println("The sum of elements of row "+(i+1)+" is "+sum);
        }
        scan.close();
    }
}