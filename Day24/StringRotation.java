package Day24;
import java.util.Scanner;
public class StringRotation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String a = scan.nextLine();

        System.out.println("Enter the second string: ");
        String b = scan.nextLine();

        if(a.length()!=b.length())
            System.out.println("Strings are not rotations of each other");
        else{
            String temp = a + b;

            if(temp.contains(b))
                System.out.println("Strings are rotations of each other");
            else
                System.out.println("Strings are not rotations of each other");
        }
        scan.close();
    }
}