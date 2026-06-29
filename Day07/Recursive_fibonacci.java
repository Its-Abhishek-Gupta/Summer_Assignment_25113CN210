package Day07;
import java.util.Scanner;
public class Recursive_fibonacci {
    static long fibonacci(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of terms in fibonacci series: ");
        int n = scan.nextInt();

        System.out.println("The fibonacci series is: ");
        for (int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
        scan.close();
    }
}