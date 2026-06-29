package Day24;
import java.util.Scanner;
public class CompressString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the desired string: ");
        String a = scan.nextLine();

        String compressed = "";
        int count = 1;

        for(int i=0;i<a.length();i++){
            while(i<a.length()-1 && a.charAt(i) == a.charAt(i+1)){
                count++;
                i++;
            }
            compressed = compressed + a.charAt(i) + count;
            count = 1;
        }
        System.out.println("Compressed String: "+compressed);
        scan.close();
    }
}