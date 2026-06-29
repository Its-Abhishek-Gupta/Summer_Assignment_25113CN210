package Day15;
import java.util.Scanner;
public class MoveZeroToEnd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        int index = 0;

        for (int i=0;i<n;i++){
            if (arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }

        while (index<n){
            arr[index]  = 0;
            index++;
        }

        System.out.println("The new array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        scan.close();
    }
}