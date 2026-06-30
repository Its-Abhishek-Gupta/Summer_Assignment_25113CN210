package Day28;
import java.util.Scanner;

public class ContactManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 100;
        String[] name = new String[max];
        String[] phone = new String[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Contact Name: ");
                    name[count] = scan.nextLine();

                    System.out.print("Enter Phone Number: ");
                    phone[count] = scan.nextLine();

                    count++;
                    System.out.println("Contact Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Contacts Available.");
                    } else {
                        System.out.println("\nContact List:");
                        for (int i = 0; i < count; i++) {
                            if (name[i] != null) {
                                System.out.println("Name : " + name[i]);
                                System.out.println("Phone: " + phone[i]);
                                System.out.println("------------------------");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Contact Name to Search: ");
                    String search = scan.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (name[i] != null && name[i].equalsIgnoreCase(search)) {
                            System.out.println("Contact Found!");
                            System.out.println("Name : " + name[i]);
                            System.out.println("Phone: " + phone[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Contact Name to Delete: ");
                    String delete = scan.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (name[i] != null && name[i].equalsIgnoreCase(delete)) {
                            name[i] = null;
                            phone[i] = null;
                            found = true;
                            System.out.println("Contact Deleted Successfully!");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact Not Found!");
                    }
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