package Day30;
import java.util.Scanner;

public class MiniLibrarySystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 100;
        int[] bookId = new int[max];
        String[] bookName = new String[max];
        boolean[] issued = new boolean[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Mini Library System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    bookId[count] = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter Book Name: ");
                    bookName[count] = scan.nextLine();

                    issued[count] = false;
                    count++;

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Books Available.");
                    } else {
                        System.out.println("\nBook Details:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Book ID : " + bookId[i]);
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Status : " + (issued[i] ? "Issued" : "Available"));
                            System.out.println("--------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = scan.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == issueId) {
                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book Issued Successfully!");
                            } else {
                                System.out.println("Book is Already Issued.");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = scan.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == returnId) {
                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book Returned Successfully!");
                            } else {
                                System.out.println("Book was not issued.");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found!");
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