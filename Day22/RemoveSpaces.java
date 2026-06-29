package Day22;
import java.util.Scanner;
public class RemoveSpaces {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the desired string:");
        String a = scan.nextLine();

        int l = a.length();

        String result = "";

        for(int i=0;i<l;i++){
            if(a.charAt(i)!=' ')
                result+=a.charAt(i);
        }
        System.out.println("The resulted string is "+result);
        scan.close();
    }
}