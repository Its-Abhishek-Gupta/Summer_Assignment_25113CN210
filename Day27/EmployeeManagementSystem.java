package Day27;
import java.util.Scanner;
public class EmployeeManagementSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int max = 100;
        int[] empId = new int[max];
        String[] Name = new String[max];
        int[] Salary = new int[max];

        int count = 0;
        int choice;

        do{
            System.out.println("\n===== EMPLOYEE RECORDS =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display all employees");
            System.out.println("3. Search employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter employee Id: ");
                    empId[count] = scan.nextInt();

                    scan.nextLine();//Clear Buffer

                    System.out.print("Enter employee name: ");
                    Name[count] = scan.nextLine();

                    System.out.println("Enter salary of the employee: ");
                    Salary[count] = scan.nextInt();

                    System.out.println("Emlpoyee added successfully.");
                    count++;
                    break;

                case 2:
                    if(count == 0)
                        System.out.println("No record found");
                    else{
                        System.out.println("\nEMPID\tNAME\tSALARY");
                        for(int i=0;i<count;i++){
                            System.out.println(empId[i]+"\t"+Name[i]+"\t"+Salary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the employee Id to search: ");
                    int search = scan.nextInt();
                    boolean found = false;

                    for(int i=0;i<count;i++){
                        if(empId[i] == search){
                            System.out.println("Employee found.");
                            System.out.println("Employee ID : "+empId[i]+"\n Name : "+Name[i]+"\n Salary : "+Salary[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                        System.out.println("No employee found");
                    break;

                case 4:
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }while (choice!=4);
        scan.close();
    }
}