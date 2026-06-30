package Day30;
import java.util.Scanner;

public class MiniEmployeeSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 100;
        int[] empId = new int[max];
        String[] empName = new String[max];
        double[] salary = new double[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Mini Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId[count] = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName[count] = scan.nextLine();

                    System.out.print("Enter Salary: ");
                    salary[count] = scan.nextDouble();

                    count++;
                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Employee Records Found.");
                    } else {
                        System.out.println("\nEmployee Details:");
                        for (int i = 0; i < count; i++) {
                            if (empName[i] != null) {
                                System.out.println("Employee ID : " + empId[i]);
                                System.out.println("Name        : " + empName[i]);
                                System.out.println("Salary      : " + salary[i]);
                                System.out.println("------------------------------");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = scan.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == searchId && empName[i] != null) {
                            System.out.println("Employee Found!");
                            System.out.println("Name   : " + empName[i]);
                            System.out.println("Salary : " + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int updateId = scan.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == updateId && empName[i] != null) {
                            System.out.print("Enter New Salary: ");
                            salary[i] = scan.nextDouble();
                            System.out.println("Salary Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee ID to Delete: ");
                    int deleteId = scan.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == deleteId && empName[i] != null) {
                            empName[i] = null;
                            salary[i] = 0;
                            System.out.println("Employee Deleted Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found!");
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