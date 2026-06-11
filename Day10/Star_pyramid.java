package Day10;
import java.util.Scanner;
public class Star_pyramid {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows:");
        int n = scan.nextInt();

        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){//PRINT SPACES
                System.out.print(" ");
            }
            for(int j=1;j<=((2*i)-1);j++){//PRINT STARS
                System.out.print("*");
            } 
            System.out.println();
        }
        scan.close();
    }
}