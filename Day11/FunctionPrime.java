package Day11;
import java.util.Scanner;
public class FunctionPrime {
    static int Prime(int n){
        int c = 0;
        for(int i=2;i<n;i++){
            if (n%i==0)
                c++;
        }
        if (c==0)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number to check whether it is prime or not: ");
        int n = scan.nextInt();

        int r=Prime(n);
        if (r==1)
            System.out.println(n+" is prime");
        else
            System.out.println(n+" is not prime");
        scan.close();
    }
}