package Day12;
import java.util.Scanner;
public class FunctionPallindrome {
    static int Pallindrome(int n){
        int n1 = n;
        int rev = 0;
        while(n1>0){
            int r = n1%10;
            rev = rev*10 + r;
            n1 = n1/10;
        }
        if (rev==n)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number to check whether it is pallindrome or not: ");
        int n = scan.nextInt();

        int c = Pallindrome(n);
        if(c==1)
            System.out.println(n+" is pallindrome");
        else
            System.out.println(n+" is not pallindrome");
        scan.close();
    }
}