package Day22;
import java.util.Scanner;
public class CountWords {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the desired sentence: ");
        String a = scan.nextLine();

        int count = 0;

        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == ' ')
                count++;
        }
        System.out.println("The number of words in the sentence is: "+(count+1));
        scan.close();
    }
}