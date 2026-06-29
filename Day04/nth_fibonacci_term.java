package Day04;
import java.util.Scanner;

public class nth_fibonacci_term {
    public static void main (String[] args){

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the number of terms:");
        int n = scan.nextInt();

        int t1 = 0;
        int t2 = 1;

        for (int i=2;i<n;i++){
            int c =t1+t2;
            t1 = t2;
            t2 = c;
        }
        System.out.println("nth term of fibonacci series is = "+t2);
        scan.close();
      }
}