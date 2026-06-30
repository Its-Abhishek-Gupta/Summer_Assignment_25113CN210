// RESTAURANT MANAGEMENT PROJECT
package Day30;
import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] itemId = new int[100];
        String[] itemName = new String[100];
        double[] price = new double[100];

        int count = 0;
        double totalBill = 0;
        int choice;

        do {
            System.out.println("\n===== Restaurant Management System =====");
            System.out.println("1. Add Food Item");
            System.out.println("2. Display Menu");
            System.out.println("3. Place Order");
            System.out.println("4. Show Total Bill");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Item ID: ");
                    itemId[count] = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter Item Name: ");
                    itemName[count] = scan.nextLine();

                    System.out.print("Enter Price: ");
                    price[count] = scan.nextDouble();

                    count++;
                    System.out.println("Item Added Successfully!");
                    break;

                case 2:
                    System.out.println("\nMenu");
                    for (int i = 0; i < count; i++) {
                        System.out.println(itemId[i] + "  " + itemName[i] + "  ₹" + price[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter Item ID: ");
                    int id = scan.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (itemId[i] == id) {
                            totalBill += price[i];
                            System.out.println(itemName[i] + " Ordered Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Item Not Found!");
                    break;

                case 4:
                    System.out.println("Total Bill = ₹" + totalBill);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        scan.close();
    }
}