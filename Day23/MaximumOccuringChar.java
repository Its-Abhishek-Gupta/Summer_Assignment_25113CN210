package Day23;
import java.util.Scanner;
public class MaximumOccuringChar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the desired string: ");
        String a = scan.nextLine();

        char maxChar = '\0';
        int maxCount = 0;

        for(int i=0;i<a.length();i++){
            int count = 0;

            for(int j=0;j<a.length();j++){
                if(a.charAt(i) == a.charAt(j)){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount = count;
                maxChar = a.charAt(i);
            }
        }
        System.out.println("Maximmum occuring character: "+maxChar);
        System.out.println("Nummber of occurance : "+maxCount);
        scan.close();
    }
}