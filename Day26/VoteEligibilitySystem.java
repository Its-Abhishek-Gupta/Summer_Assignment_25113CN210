package Day26;
import java.util.Scanner;
public class VoteEligibilitySystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        if(age >= 18)
            System.out.println("You are eligible to vote.");
        else
            System.out.println("YOU are not eligible to vote.");
        
        scan.close();
    }
}