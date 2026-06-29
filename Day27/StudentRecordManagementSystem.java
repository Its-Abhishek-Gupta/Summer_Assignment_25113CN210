package Day27;
import java.util.Scanner;
public class StudentRecordManagementSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int max = 100;
        int[] roll = new int[max];
        String[] name = new String[max];
        double[] marks = new double[max];

        int count = 0;
        int choice;

        do{
            System.out.println("\n===== STUDENT RECORDS =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter roll number: ");
                    roll[count] = scan.nextInt();

                    scan.nextLine();//Clear buffer

                    System.out.print("Enter Name: ");
                    name[count] = scan.nextLine();

                    System.out.print("Enter marks: ");
                    marks[count] = scan.nextDouble();

                    count++;
                    System.out.println("Student record addded successfully.");
                    break;
                
                case 2:
                    if(count==0){
                        System.out.println("No records found.");
                    }else{
                        System.out.println("\nRoll\tName\tMarks");
                        for (int i=0;i<count;i++){
                            System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter Roll Number to search: ");
                    int searchRoll = scan.nextInt();
                    boolean found = false;

                    for(int i=0;i < count;i++){
                        if(roll[i] == searchRoll){
                            System.out.println("Student Found.");
                            System.out.println("Roll Number: "+roll[i]);
                            System.out.println("Name: "+name[i]);
                            System.out.println("Marks: "+marks[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                        System.out.println("Student not found.");
                    break;
                
                case 4:
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice != 4);
        scan.close();
    }
}