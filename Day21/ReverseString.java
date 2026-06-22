package Day21;
import java.util.Scanner ; 
public class ReverseString {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the desired string to get reversed: ");
        String a = scan.next();

        int l = a.length();

        String reversed = "";

        for(int i=l-1;i>=0;i--){
            reversed += a.charAt(i);
        }

        System.out.println("The reversed string is: "+reversed);
        scan.close();
    }
}