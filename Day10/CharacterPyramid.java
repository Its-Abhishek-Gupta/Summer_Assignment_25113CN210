package Day10;
import java.util.Scanner;
public class CharacterPyramid {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scan.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j));
            }
            for(int j=i-1;j>=1;j--){
                System.out.print((char)(64+j));
            }
            System.out.println();
        }
        scan.close();
    }
}