package Day18;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();

        for (int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<=n-1;j++){
                if (arr[j]<arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("The sorted array is: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

        scan.close();
    }
}