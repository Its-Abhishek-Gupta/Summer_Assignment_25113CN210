package Day8;
import java.util.Scanner;
public class Character_triangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+j)+" ");
            }
            System.out.print("\n");
        }
        scan.close();
    }
}