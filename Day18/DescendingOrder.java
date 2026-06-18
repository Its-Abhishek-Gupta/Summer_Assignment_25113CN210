package Day18;
import java.util.Scanner;
public class DescendingOrder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt();

        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The array in descending order is: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

        scan.close();
    }
}