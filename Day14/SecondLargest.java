package Day14;
import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        int max = arr[0];
        int secondMax = arr[0];

        for(int i=0;i<n;i++){
            if (arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max)
                secondMax = arr[i];
        }
        System.out.println("The second largest element in the array is "+secondMax);
        scan.close();
    }
}