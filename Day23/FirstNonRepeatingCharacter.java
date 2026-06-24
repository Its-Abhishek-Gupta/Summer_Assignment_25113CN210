package Day23;
import java.util.Scanner;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the desired string: ");
        String a = scan.nextLine();

        int l = a.length();

        char result = '\0';
        
        for(int i=0;i<l;i++){
            int count = 0;

            for(int j=0;j<l;j++){
                if (a.charAt(i) == a.charAt(j)) {
                    count ++;
                }
            }
            if (count==1){
                result = a.charAt(i);
                break;
            }
        }
        if(result!='\0')
            System.out.println("First non-repeating character : "+result);
        else
            System.out.println("There is no non repeating character");
        scan.close();
    }
}