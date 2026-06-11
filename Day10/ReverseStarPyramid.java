package Day10;
import java.util.Scanner;
public class ReverseStarPyramid {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the numbdr of rows: ");
        int n = scan.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}