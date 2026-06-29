package Day05;
import java.util.Scanner;
public class Largest_prime_factor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number to find the largest prime factor: ");
        int n = scan.nextInt();

        int prime = 0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                int c=0;
                for(int j=2;j<i;j++){
                    if(i%j==0)
                        c++;
                    if (c==0)
                        prime=i;
                }
            }
        }
        System.out.println("Largest prime factor of "+n+" is "+prime);
        scan.close();
    }
}