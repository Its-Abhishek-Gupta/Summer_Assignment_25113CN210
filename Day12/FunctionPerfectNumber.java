package Day12;
import java.util.Scanner;
public class FunctionPerfectNumber {
    static void perfect(int n){
        int p = 0;
        for (int i=1;i<n;i++){
            if(n%i==0)
                p=p+i;
        }
        if (n==p)
            System.out.println(n+" is perfect number");
        else
            System.out.println(n+" is not a perfect number");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number to check whether it is perfect or not: ");
        int n = scan.nextInt();

        perfect(n);

        scan.close();
    }
}