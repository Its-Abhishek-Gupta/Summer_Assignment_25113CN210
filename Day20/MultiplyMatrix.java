package Day20;
import java.util.Scanner;
public class MultiplyMatrix {
    public static void main(String[] Objects){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the dimensions(rows and columns) of matrix 1: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.print("Enter the dimensions(rows and columns) of matrix 2: ");
        int c = scan.nextInt();
        int d = scan.nextInt();

        int[][] mat1 = new int[a][b];
        int[][] mat2 = new int[c][d];

        if(b!=c)
            System.out.println("Matrix multiplication is not possible");
        else{
            System.out.println("Enter the elements of the matrix 1: ");
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    mat1[i][j]=scan.nextInt();
                }
            }

            System.out.println("Enter the elements of the matrix 2: ");
            for(int i=0;i<c;i++){
                for(int j=0;j<d;j++){
                    mat2[i][j] = scan.nextInt();
                }
            }

            int[][] mul = new int[a][d];

            for(int i=0;i<a;i++){
                for(int j=0;j<d;j++){
                    mul[i][j] = 0;
                    for (int k=0;k<c;k++)
                        mul[i][j] = mul[i][j] +(mat1[i][k]*mat2[k][j]);
                }
            }

            System.out.println("The product of the matrices is: ");
            for(int i=0;i<a;i++){
                for(int j=0;j<d;j++){
                    System.out.print(mul[i][j]+" ");
                }
                System.out.println();
            }
        }
        scan.close();
    }
}