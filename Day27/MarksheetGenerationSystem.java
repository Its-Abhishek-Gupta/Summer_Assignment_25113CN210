package Day27;

import java.util.Scanner;

public class MarksheetGenerationSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 100;

        int[] roll = new int[max];
        String[] name = new String[max];
        int[] english = new int[max];
        int[] maths = new int[max];
        int[] science = new int[max];
        int[] total = new int[max];
        double[] percentage = new double[max];
        String[] grade = new String[max];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== Marksheet Generation System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Marksheets");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll Number: ");
                    roll[count] = scan.nextInt();

                    scan.nextLine();

                    System.out.print("Enter Student Name: ");
                    name[count] = scan.nextLine();

                    System.out.print("Enter English Marks: ");
                    english[count] = scan.nextInt();

                    System.out.print("Enter Maths Marks: ");
                    maths[count] = scan.nextInt();

                    System.out.print("Enter Science Marks: ");
                    science[count] = scan.nextInt();

                    total[count] = english[count] + maths[count] + science[count];
                    percentage[count] = total[count] / 3.0;

                    if (percentage[count] >= 90)
                        grade[count] = "A+";
                    else if (percentage[count] >= 80)
                        grade[count] = "A";
                    else if (percentage[count] >= 70)
                        grade[count] = "B";
                    else if (percentage[count] >= 60)
                        grade[count] = "C";
                    else if (percentage[count] >= 50)
                        grade[count] = "D";
                    else
                        grade[count] = "F";

                    System.out.println("Student record added successfully!");
                    count++;
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No records found.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("\n===== Marksheet =====");
                            System.out.println("Roll Number : " + roll[i]);
                            System.out.println("Name        : " + name[i]);
                            System.out.println("English     : " + english[i]);
                            System.out.println("Maths       : " + maths[i]);
                            System.out.println("Science     : " + science[i]);
                            System.out.println("Total       : " + total[i]);
                            System.out.println("Percentage  : " + percentage[i]);
                            System.out.println("Grade       : " + grade[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = scan.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (roll[i] == searchRoll) {
                            System.out.println("\n===== Marksheet =====");
                            System.out.println("Roll Number : " + roll[i]);
                            System.out.println("Name        : " + name[i]);
                            System.out.println("English     : " + english[i]);
                            System.out.println("Maths       : " + maths[i]);
                            System.out.println("Science     : " + science[i]);
                            System.out.println("Total       : " + total[i]);
                            System.out.println("Percentage  : " + percentage[i]);
                            System.out.println("Grade       : " + grade[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
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