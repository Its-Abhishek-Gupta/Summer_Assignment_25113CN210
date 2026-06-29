package Day11;
import java.util.Scanner;
public class FunctionFactorial {
    static int Fact(int n){
        int f = 1;
        for (int i=1;i<=n;i++)
            f=f*i;
        return f;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number to fund the factorial: ");
        int n = scan.nextInt();

        System.out.println("The factorial of "+n+" is "+Fact(n));
        scan.close();
    }
}