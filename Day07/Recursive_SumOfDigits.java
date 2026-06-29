package Day07;
import java.util.Scanner;
public class Recursive_SumOfDigits {
    static long sum(int n){
        if (n==0)
            return 0 ;
        return (n%10)+sum(n/10);
    }
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number to find the sum of digits: ");
        int n = scan.nextInt();

        System.out.println("The sum of digits is: "+sum(n));

        scan.close();

    }   
}