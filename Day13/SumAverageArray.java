package Day13;
import java.util.Scanner;
public class SumAverageArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+i+" position element");
            arr[i]=scan.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        float average = sum/n;

        System.out.println("The sum of the array is "+sum+"\n"+"The average is "+average);
        scan.close();
    }
}