package Day15;
import java.util.Scanner;
public class RotateArrayLeft {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        int temp = arr[0];

        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }

        arr[n-1] = temp;

        System.out.println("The array rotated to the left is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        scan.close();
    }
}