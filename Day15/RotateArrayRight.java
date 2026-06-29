package Day15;
import java.util.Scanner;
public class RotateArrayRight {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        int temp = arr[n-1];

        for (int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println("The array shifted to the right is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        scan.close();
    }
}