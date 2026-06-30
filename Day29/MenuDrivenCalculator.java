package Day29;
import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choice;
        double num1, num2, result;

        do {
            System.out.println("\n===== Menu-Driven Calculator =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter First Number: ");
                    num1 = scan.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = scan.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    System.out.print("Enter First Number: ");
                    num1 = scan.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = scan.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    System.out.print("Enter First Number: ");
                    num1 = scan.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = scan.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    System.out.print("Enter First Number: ");
                    num1 = scan.nextDouble();
                    System.out.print("Enter Second Number: ");
                    num2 = scan.nextDouble();

                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;

                case 5:
                    System.out.print("Enter First Integer: ");
                    int a = scan.nextInt();
                    System.out.print("Enter Second Integer: ");
                    int b = scan.nextInt();

                    if (b != 0) {
                        System.out.println("Result = " + (a % b));
                    } else {
                        System.out.println("Modulus by zero is not allowed.");
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        scan.close();
    }
}