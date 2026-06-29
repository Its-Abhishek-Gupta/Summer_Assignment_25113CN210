package Day11;
import java.util.Scanner;
public class FunctionSumOfTwoNumbers {
    static int Sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        int a = scan.nextInt();

        System.out.print("Enter the number 2: ");
        int b = scan.nextInt();

        System.out.print("The sum of both the numbers is: "+Sum(a,b));
        scan.close();
    }
}