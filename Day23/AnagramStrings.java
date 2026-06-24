package Day23;
import java.util.Scanner;
import java.util.Arrays;
public class AnagramStrings {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string 1: ");
        String str1 = scan.nextLine();

        System.out.println("Enter the string 2: ");
        String str2 = scan.nextLine();

        int l1 = str1.length();
        int l2 = str2.length();

        if(l1!=l2){
            System.out.println("Strings are not anagram");
        }else{
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2))
                System.out.println("Strings are anagram");
            else
                System.out.println("Strings are not anagram");
        }
        scan.close();
    }
}