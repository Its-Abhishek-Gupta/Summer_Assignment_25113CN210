package Day30;
import java.util.Scanner;

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 100;
        int[] rollNo = new int[max];
        String[] name = new String[max];
        int[] marks = new int[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll Number: ");
                    rollNo[count] = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter Student Name: ");
                    name[count] = scan.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = scan.nextInt();

                    count++;
                    System.out.println("Student Record Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Student Records Found.");
                    } else {
                        System.out.println("\nStudent Records:");
                        for (int i = 0; i < count; i++) {
                            if (name[i] != null) {
                                System.out.println("Roll No : " + rollNo[i]);
                                System.out.println("Name    : " + name[i]);
                                System.out.println("Marks   : " + marks[i]);
                                System.out.println("----------------------------");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = scan.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == searchRoll && name[i] != null) {
                            System.out.println("Student Found!");
                            System.out.println("Name  : " + name[i]);
                            System.out.println("Marks : " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found!");
                    break;

                case 4:
                    System.out.print("Enter Roll Number: ");
                    int updateRoll = scan.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == updateRoll && name[i] != null) {
                            System.out.print("Enter New Marks: ");
                            marks[i] = scan.nextInt();
                            System.out.println("Marks Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found!");
                    break;

                case 5:
                    System.out.print("Enter Roll Number to Delete: ");
                    int deleteRoll = scan.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == deleteRoll && name[i] != null) {
                            name[i] = null;
                            marks[i] = 0;
                            System.out.println("Student Record Deleted Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Student Not Found!");
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