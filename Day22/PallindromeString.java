package Day22;
import java.util.Scanner;
public class PallindromeString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Entire the desired string: ");
        String a = scan.next();

        a = a.toLowerCase();
        
        String rev = "";

        for(int i=a.length()-1;i>=0;i--){
            rev += a.charAt(i);
        }

        if(a.equals(rev))
            System.out.println("The given string is pallindrome");
        else
            System.out.println("The given string is not pallindrome");
        scan.close();
    }
}