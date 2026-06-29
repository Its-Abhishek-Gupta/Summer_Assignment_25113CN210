package Day13;
import java.util.Scanner;
public class InputDisplayArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+i+" position element: ");
            arr[i] = scan.nextInt();
        }

        System.out.println("The array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        scan.close();
    }
}