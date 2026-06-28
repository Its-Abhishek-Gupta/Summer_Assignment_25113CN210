package Day26;
import java.util.Scanner;
public class AtmSimulation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int balance = 10000;
        int choice , amount;

        while(true){
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Current Balance: Rs "+ balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = scan.nextInt();
                    balance = balance + amount;
                    System.out.println("Amount Deposited Successfully.");
                    break;

                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    amount = scan.nextInt();

                    if(amount <= balance){
                        balance = balance - amount;
                        System.out.println("Please collect your cash.");
                    }
                    else
                        System.out.println("Insufficeint balace.");
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Please try again .");

            }
        }
    }
}