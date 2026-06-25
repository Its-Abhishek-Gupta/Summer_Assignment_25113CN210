package Day25;
import java.util.Scanner;
public class CommonCharInStrings {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String a = scan.nextLine();

        System.out.println("Enter the second string:");
        String b = scan.nextLine();

        int l1 = a.length();
        int l2 = b.length();

        System.out.println("The commmon characters are: ");
        for(int i=0;i<l1;i++){
            int count = 0;
            for(int j=0;j<l2;j++){
                if(a.charAt(i) == b.charAt(j))
                    count++;
            }
            if(count != 0)
                System.out.print(a.charAt(i)+" ");
        }
        scan.close();
    }
}