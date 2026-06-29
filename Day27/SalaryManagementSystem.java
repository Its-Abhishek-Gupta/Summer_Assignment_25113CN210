package Day27;

import java.util.Scanner;

public class SalaryManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 100;
        int[] empId = new int[max];
        String[] empName = new String[max];
        double[] basicSalary = new double[max];
        double[] netSalary = new double[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Salary Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId[count] = scan.nextInt();

                    scan.nextLine(); // Clear buffer

                    System.out.print("Enter Employee Name: ");
                    empName[count] = scan.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    basicSalary[count] = scan.nextDouble();

                    // Salary Calculation
                    double hra = basicSalary[count] * 0.20;
                    double da = basicSalary[count] * 0.10;
                    double deduction = basicSalary[count] * 0.05;

                    netSalary[count] = basicSalary[count] + hra + da - deduction;

                    System.out.println("Employee record added successfully!");
                    count++;
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\nID\tName\tBasic\tNet Salary");
                        for (int i = 0; i < count; i++) {
                            System.out.println(empId[i] + "\t" + empName[i] + "\t\t" +
                                    basicSalary[i] + "\t" + netSalary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = scan.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == searchId) {
                            System.out.println("\nEmployee Found");
                            System.out.println("ID: " + empId[i]);
                            System.out.println("Name: " + empName[i]);
                            System.out.println("Basic Salary: " + basicSalary[i]);
                            System.out.println("Net Salary: " + netSalary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        scan.close();
    }
}