package Day11;
import java.util.Scanner;
public class FunctionMax {
    static int Max(int a,int b){
        if (a>b)
            return a;
        else
            return b;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        int a = scan.nextInt();

        System.out.print("Enter the number 2: ");
        int b = scan.nextInt();

        System.out.println("The maximum is: "+Max(a,b));
        scan.close();
    }
}