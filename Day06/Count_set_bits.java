package Day06;
import java.util.Scanner;
public class Count_set_bits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scan.nextInt();

        int count = 0;
        while(n>0){
            if (n%2==1)
                count++;
            n=n/2;
        }
        System.out.println("The count of set bits is "+count);
        scan.close();
    }
}