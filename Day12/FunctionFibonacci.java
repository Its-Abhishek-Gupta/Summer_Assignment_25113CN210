package Day12;
import java.util.Scanner;
public class FunctionFibonacci {
    static void fibo(int n){
        int a = 0;
        int b = 1;
        System.out.println("The fibonacci series is: ");
        System.out.print(a+" "+b+" ");
        for (int i=2;i<n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of terms in the series: ");
        int n = scan.nextInt();

        fibo(n);

        scan.close();
    }
}