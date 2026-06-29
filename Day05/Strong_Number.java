package Day05;
import java.util.Scanner;
public class Strong_Number {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to check whether it is strong or not:");
        int n = scan.nextInt();

        int n1 = n;
        int Sum = 0;

        while(n1>0){
            int d = n1%10;
            int fact = 1;
            for (int i = 1;i<=d;i++){
                fact = fact*i;
            }
            Sum+=fact;
            n1=n1/10;
        }
        if (n==Sum)
            System.out.println(n+" is a strong number");
        else
            System.out.println(n+" is not a strong number");
        scan.close();
    }
}