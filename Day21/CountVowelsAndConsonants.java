package Day21;
import java.util.*;
public class CountVowelsAndConsonants {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the desired string: ");
        String a = scan.next();

        int l = a.length();

        int Vcount = 0;
        int Ccount = 0;

        for(int i=0;i<l;i++){
            char ch = a.charAt(i);

            if ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                    Vcount++;
                else
                    Ccount++;
            }
        }
        System.out.println("The number of vowels is: "+Vcount);
        System.out.println("The number of consonants is: "+Ccount);
        scan.close();
    }
}