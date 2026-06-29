package Day05;
import java.util.Scanner;
public class Perfect_Number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to check whether it is perfect or not:");
        int n = scan.nextInt();

        int Sum = 0;
        for (int i=1;i<n;i++){
            if (n%i==0)
                    Sum+=i;
        }
        if (Sum==n)
            System.out.println(n+" is a perfect number");
        else
            System.out.println(n+" is not a perfect number");
        scan.close();
    }
}