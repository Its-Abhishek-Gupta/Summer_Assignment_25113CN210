package Day7;
import java.util.Scanner;
public class Recursive_ReverseNumber {
    static long reverse(int n,int rev){
        if (n==0)
            return rev;
        return reverse(n/10,rev*10+(n%10));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number to reverse it : ");
        int n = scan.nextInt();

        int rev = 0;
        System.out.print("The reversed number is: "+reverse(n,rev));
        scan.close();
    }
}