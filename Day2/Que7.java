import java.util.Scanner;

public class Que7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to find the product of the digits:");
        int n = scan.nextInt();

        int product = 1;
        int n1=n;
        int r;
        while(n1>0){
            r=n1%10;
            product*=r;
            n1=n1/10;
        }
        System.out.println("The product of digits of number "+n+" is "+product);
        scan.close();
    }
}