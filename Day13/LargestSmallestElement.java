package Day13;
import java.util.Scanner;
public class LargestSmallestElement {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            System.out.print("Enter the element at "+i+" position");
            arr[i] = scan.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int i=0;i<n;i++){
            if (arr[i]>max)
                max=arr[i];
            if (arr[i]<min)
                min=arr[i];
        }
        System.out.println("The largest element is "+max+"\n"+"The smallest element is "+min);
        scan.close();
    }
}