package Day21;
import java.util.Scanner;
public class LowercaseToUppercase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the desired string: ");
        String a = scan.next();

        String upper = a.toUpperCase();

        System.out.println("The string converted to upper case is : "+upper);
        scan.close();
    }
}