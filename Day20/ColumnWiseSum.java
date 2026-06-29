package Day20;
import java.util.Scanner;
public class ColumnWiseSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the dimension of the matrix: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int[][] mat = new int[a][b];


        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                mat[i][j]=scan.nextInt();
            }
        }

        for(int j=0;j<b;j++){
            int sum = 0;
            for (int i=0;i<a;i++){
                sum += mat[i][j];
            }
            System.out.println("The sum of column "+(j+1)+" is "+sum);
        }
        scan.close();
    }
}