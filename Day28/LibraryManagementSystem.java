package Day28;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 100;
        int[] bookId = new int[max];
        String[] bookName = new String[max];
        String[] author = new String[max];
        boolean[] issued = new boolean[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
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

                    System.out.print("Enter Author Name: ");
                    author[count] = scan.nextLine();

                    issued[count] = false;
                    count++;

                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nBook Details:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Book ID : " + bookId[i]);
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Author : " + author[i]);
                            System.out.println("Status : " + (issued[i] ? "Issued" : "Available"));
                            System.out.println("----------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = scan.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == searchId) {
                            System.out.println("Book Found!");
                            System.out.println("Book Name : " + bookName[i]);
                            System.out.println("Author : " + author[i]);
                            System.out.println("Status : " + (issued[i] ? "Issued" : "Available"));
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = scan.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == issueId) {
                            found = true;
                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book Issued Successfully!");
                            } else {
                                System.out.println("Book is Already Issued.");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = scan.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookId[i] == returnId) {
                            found = true;
                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book Returned Successfully!");
                            } else {
                                System.out.println("Book was not issued.");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found!");
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