package Day06;
import java.util.Scanner;
public class power_n {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scan.nextInt();

        System.out.print("Enter the power: ");
        int p = scan.nextInt();

        int result = 1;
        while(p>0){
            result*=n;
            p--;
        }
        System.out.println("The result is "+result);
        scan.close();
    }
}