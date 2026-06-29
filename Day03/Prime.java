package Day03;
import java.util.Scanner;
public class Prime {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to check whether it is prime or not");
        int n = scan.nextInt();

        int c=0;
        for (int i=2;i<n;i++){
            if (n%i==0){
                c++;
            }
        }
        if (c==0){
            System.out.println(n+" is prime number");
        }
        else{
            System.out.println(n+" is not prime number");
        }
        scan.close();
    }   
}