package Day19;
import java.util.Scanner;
public class AddMatrices {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the dimensions(rows and columns) of matrix 1 : ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int[][] mat1 = new int[a][b];

        System.out.println("Enter the elements of the matrix 1: ");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                mat1[i][j]=scan.nextInt();
            }
        }

        System.out.print("Enter the dimensions(rows and columns) of matrix 2: ");
        int c = scan.nextInt();
        int d = scan.nextInt();

        int[][] mat2 = new int[c][d];

        System.out.println("Enter the elements of the matrix 2: ");
        for(int i=0;i<c;i++){
            for(int j=0;j<d;j++){
                mat2[i][j]=scan.nextInt();
            }
        }

        if (a!=c || b!=d)
            System.out.println("Matrix addition is not possible: ");
        else{
            int[][] add = new int[a][b];
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    add[i][j] = mat1[i][j]+mat2[i][j];
                }
            }
            System.out.println("The added matrix is: ");
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    System.out.print(add[i][j]+" ");
                }
                System.out.println();
            }
        }
        scan.close();
    }
}