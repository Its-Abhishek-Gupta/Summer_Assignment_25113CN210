package Day16;
import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n-1];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n-1;i++){
            arr[i] = scan.nextInt();
        }
        
        int sum = 0;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
        }

        int totalSum = n*(n-1)/2;
        int Missing = totalSum-sum;
        System.out.println("The missing number is "+Missing);
        scan.close();
    }
}