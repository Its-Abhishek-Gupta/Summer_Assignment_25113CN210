package Day28;
import java.util.Scanner;

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 100;
        int[] accountNo = new int[max];
        String[] name = new String[max];
        double[] balance = new double[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Bank Account System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    accountNo[count] = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    name[count] = scan.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    balance[count] = scan.nextDouble();

                    count++;
                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int acc = scan.nextInt();

                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (accountNo[i] == acc) {
                            System.out.print("Enter Deposit Amount: ");
                            double deposit = scan.nextDouble();
                            balance[i] += deposit;
                            System.out.println("Amount Deposited Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account Not Found!");
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    acc = scan.nextInt();

                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (accountNo[i] == acc) {
                            System.out.print("Enter Withdrawal Amount: ");
                            double withdraw = scan.nextDouble();

                            if (withdraw <= balance[i]) {
                                balance[i] -= withdraw;
                                System.out.println("Withdrawal Successful!");
                            } else {
                                System.out.println("Insufficient Balance!");
                            }

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account Not Found!");
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    acc = scan.nextInt();

                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (accountNo[i] == acc) {
                            System.out.println("Account Holder: " + name[i]);
                            System.out.println("Current Balance: " + balance[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account Not Found!");
                    break;

                case 5:
                    if (count == 0) {
                        System.out.println("No Accounts Available.");
                    } else {
                        System.out.println("\nAccount Details:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Account No: " + accountNo[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Balance: " + balance[i]);
                            System.out.println("--------------------------");
                        }
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