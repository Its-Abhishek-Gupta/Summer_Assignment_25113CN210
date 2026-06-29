package Day03;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in );

        System.out.println("Input the two numbers to find the GCD");

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        int temp;
        while (n2 != 0){
            temp = n2;
            n2 = n1%n2;
            n1 = temp;
        }
        System.out.println("The GCD is = "+n1);
        scan.close();
    }
}