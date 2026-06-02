import java.util.Scanner;
public class Que5 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number n:");
        int n = scan.nextInt();

        int n1=n;
        int sum=0;
        int r;
        while (n1>0){
            r=n1%10;
            sum += r;
            n1=n1/10;
        }
        System.out.println("Sum of the digits of the number is = "+sum);
        scan.close();
    }
}