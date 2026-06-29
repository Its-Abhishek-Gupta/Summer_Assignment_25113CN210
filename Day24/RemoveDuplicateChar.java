package Day24;
import java.util.Scanner;
public class RemoveDuplicateChar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the desired string: ");
        String a = scan.nextLine();

        String result = "";

        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }
        System.out.println("String after removing duplicate character is: "+"\n"+result);
        scan.close();
    }
}