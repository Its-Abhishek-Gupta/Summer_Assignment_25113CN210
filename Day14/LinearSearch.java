package Day14;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int a = scan.nextInt();

        int pos=-1;
        for(int i=0;i<n;i++){
            if (arr[i]==a){
                pos = i;
                break;
            }
        }
        if (pos == -1)
            System.out.println("The element "+a+" is not present in the array.");
        else
            System.out.println("The element "+a+" is present at the position "+(pos+1));
        scan.close();
    }
}