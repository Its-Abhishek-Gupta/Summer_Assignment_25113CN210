package Day08;
import java.util.Scanner;
public class RepeatedNumber_pattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
        scan.close();
    }
}