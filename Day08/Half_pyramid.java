package Day08;
import java.util.Scanner;
public class Half_pyramid {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows in the pyramid: ");
        int r = scan.nextInt();

        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        scan.close();
    }
}