package Day04;
import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the number of terms of fibonacci series:");
        int n = scan.nextInt();

        if (n<=0)
                System.out.println("Please enter number of terms greater than 0");
        else{
            int t1 = 0;
            int t2 = 1;
            System.out.print(t1+" "+t2);
            for(int i=2;i<n;i++){
                int c = t1 + t2;
                t1 = t2;
                t2 = c;
                System.out.print(" "+c);
            }
        }
        scan.close();
    }
}