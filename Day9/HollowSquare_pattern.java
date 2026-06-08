package Day9;
import java.util.Scanner;
public class HollowSquare_pattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of square: ");
        int n = scan.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i==1 || i==n || j==1 || j==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");//Two spcaces
            }
            System.out.println();
        }
        scan.close();
    }
}