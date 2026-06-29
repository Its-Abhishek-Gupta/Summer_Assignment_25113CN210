package Day03;
import java.util.Scanner;

public class LCM {
    public static void main (String[] args){
        
        Scanner scan = new Scanner (System.in);

        System.out.println("Input the two numbers to find LCM:");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int n1 = a;
        int n2 = b;
        int temp;
        while(n2!=0){
            temp = n2;
            n2 = n1%n2;
            n1 = temp;
        }
        int GCD = n1;

        int LCM = (a*b)/GCD;
        System.out.println("The LCM is = "+LCM);

        scan.close();
    }
}