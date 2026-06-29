package Day06;
import java.util.Scanner;
public class Decimal_to_binary {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the decimal number to convert in binary: ");
        int d = scan.nextInt();

        int b = 0;
        int place = 1;
        int n1 = d;
        while(n1>0){
            int r = n1%2;
            b = b+r*place;
            place = place*10;
            n1=n1/2;
        }
        System.out.println("The binary number is "+b);
        scan.close();
    }
}