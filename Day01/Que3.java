package Day01;
import java.util.Scanner;
public class Que3 {
    public static void main (String[] args){
         Scanner scan = new Scanner(System.in);

         System.out.println("Enter the number to find the factorial:");
         int n = scan.nextInt();

         if (n<0){
            System.out.println("Factorial not possible:");
         }
         if (n==0){
            System.out.println("Factorial 0 = 1");
         }
         else{
            long fact=1;
            while (n>0){
                fact *=n;
                n=n-1;
            }
            System.out.println("Factorial = "+fact);
         }
         scan.close();
    }
}