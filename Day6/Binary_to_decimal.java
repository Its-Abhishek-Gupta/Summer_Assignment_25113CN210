package Day6;
import java.util.Scanner;
public class Binary_to_decimal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the binary number to convert to decimal: ");
        int b = scan.nextInt();

        int d = 0;
        int place = 0;

        while(b>0){
            int r = b%10;
            d += r*Math.pow(2,place);
            place++;
            b=b/10;
        }
        System.out.println("Decimal number is "+d);
        scan.close();
    }
}