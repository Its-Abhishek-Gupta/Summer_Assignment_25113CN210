package Day21;
import java.util.Scanner;
public class StringLength {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the desired string : ");
        String a = scan.next();

        char[] arr = a.toCharArray();

        int l = 0;
        for(char ch : arr){
            l++;
        }
        System.out.println("The length of the string is "+l);
        scan.close();
    }
}