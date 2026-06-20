package Day20;
import java.util.Scanner;
public class SymmetricMatrix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the dimension(rows and columns) of the matrix: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int[][] mat = new int[a][b];
        int[][] trans = new int[b][a];

        if(a!=b)
            System.out.println("The matrix is not symmetric");
        else{
            System.out.println("Enter the elements of the matrix: ");
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    mat[i][j] = scan.nextInt();
                }
            }

            System.out.println("The entered matrix is : ");
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }

            for(int i=0;i<b;i++){
                for(int j=0;j<a;j++){
                    trans[i][j] = mat[j][i];
                }
            }

            System.out.println("The transpose of the matrix is: ");
            for(int i=0;i<b;i++){
                for(int j=0;j<a;j++){
                    System.out.print(trans[i][j]+" ");
                }
                System.out.println();
            }

            int c = 0;
            for (int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    if (mat[i][j] != trans[i][j])
                        c++;
                }
            }

            if (c==0)
                System.out.println("The matrix is symmetric");
            else
                System.out.println("The matrix is not symmetric");
        }
        scan.close();
    }
}