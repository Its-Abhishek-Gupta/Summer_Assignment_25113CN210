package Day22;
import java.util.Scanner;
public class CharFrequency {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the desired string: ");
        String a = scan.nextLine();

        int l = a.length();

        System.out.println("Enter the char to find the frequency: ");
        char c = scan.next().charAt(0);

        int freq = 0;

        for(int i=0;i<l;i++){
            if(a.charAt(i)==c)
                freq++;
        }
        System.out.println("The frequency of the character "+c+" is "+freq);
        scan.close();
    }
}