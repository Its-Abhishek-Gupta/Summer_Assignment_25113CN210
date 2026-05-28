import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("The number of digits is: 1");
        } else {
            int temp = Math.abs(num);
            int count = 0;
            
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
            
            System.out.println("The number of digits in " + num + " is: " + count);
        }
        
        scanner.close();
    }
}