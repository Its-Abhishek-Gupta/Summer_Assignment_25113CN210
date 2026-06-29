package Day04;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number to check whether it is armstrong or not:");
        int n = scan.nextInt();
        int n1 = n;

        int d = 0;
        while(n1>0){
            n1=n1/10;
            d++;
        }
        n1 = n;
        int sum=0;
        while(n1>0){
            int r = n1%10;
            sum += Math.pow(r,d);
            n1=n1/10;
        }
        if (n==sum)
                System.out.println(n+" is armstrong number");
        else    System.out.println(n+" is not a armstrong number");
        scan.close();
    }
}