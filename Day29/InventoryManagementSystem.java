package Day29;
import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 100;
        int[] productId = new int[max];
        String[] productName = new String[max];
        int[] quantity = new int[max];
        double[] price = new double[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    productId[count] = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter Product Name: ");
                    productName[count] = scan.nextLine();

                    System.out.print("Enter Quantity: ");
                    quantity[count] = scan.nextInt();

                    System.out.print("Enter Price: ");
                    price[count] = scan.nextDouble();

                    count++;
                    System.out.println("Product Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Products Available.");
                    } else {
                        System.out.println("\nProduct Details:");
                        for (int i = 0; i < count; i++) {
                            if (productName[i] != null) {
                                System.out.println("Product ID   : " + productId[i]);
                                System.out.println("Product Name : " + productName[i]);
                                System.out.println("Quantity     : " + quantity[i]);
                                System.out.println("Price        : " + price[i]);
                                System.out.println("------------------------------");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to Search: ");
                    int searchId = scan.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (productId[i] == searchId && productName[i] != null) {
                            System.out.println("Product Found!");
                            System.out.println("Name     : " + productName[i]);
                            System.out.println("Quantity : " + quantity[i]);
                            System.out.println("Price    : " + price[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Product Not Found!");
                    break;

                case 4:
                    System.out.print("Enter Product ID: ");
                    int updateId = scan.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (productId[i] == updateId && productName[i] != null) {
                            System.out.print("Enter New Quantity: ");
                            quantity[i] = scan.nextInt();
                            System.out.println("Quantity Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Product Not Found!");
                    break;

                case 5:
                    System.out.print("Enter Product ID to Delete: ");
                    int deleteId = scan.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (productId[i] == deleteId && productName[i] != null) {
                            productName[i] = null;
                            quantity[i] = 0;
                            price[i] = 0;
                            System.out.println("Product Deleted Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Product Not Found!");
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