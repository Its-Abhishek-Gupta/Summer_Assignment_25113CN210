import java.util.Scanner;
public class Que4 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number n:");
        int n = scan.nextInt();

        int i = 0;
        while(n>0){
            n=n/10;
            i++;
        }
        System.out.println("The number of digits are = "+i);
        scan.close();
    }
}