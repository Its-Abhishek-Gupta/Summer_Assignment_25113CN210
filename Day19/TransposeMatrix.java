package Day19;
import java.util.Scanner;
public class TransposeMatrix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the dimensions of the matrix : ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int[][] mat = new int[a][b];

        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                mat[i][j] = scan.nextInt();
            }
        }

        int[][] transpose = new int[b][a];

        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                transpose[i][j] = mat[j][i];
            }
        }
        System.out.println("The entered matrix is: ");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("The transposed matrix is: ");
        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}