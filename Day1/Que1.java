import java.util.Scanner;
public class Que1 {
    public static void main (String[] Object){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number n");
        int n = scanner.nextInt();

        if (n<=0){
            System.out.println("Please enter the number n greater than 0");
        }
        else{
            int sum = n*(n+1)/2;
            System.out.println("Sum of first "+n+" natural numbers are "+sum);
        }
        scanner.close();
    }
}