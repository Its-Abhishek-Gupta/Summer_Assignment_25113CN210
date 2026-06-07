package Day7;
import java.util.Scanner;
public class Recursive_factorial {

    static long factorial(int n){
        if (n==0 || n==1)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number to find the factorial: ");
        int n = scan.nextInt();

        System.out.println("The factorial of "+n+" is "+factorial(n));

        scan.close();
    }
}