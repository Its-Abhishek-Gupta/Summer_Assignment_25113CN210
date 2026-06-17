package Day16;
import java.util.Scanner;
public class PairWithGivenSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]= scan.nextInt();

        System.out.print("Enter the targeted sum: ");
        int Target = scan.nextInt();

        boolean found = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==Target){
                    System.out.println("The pair is "+arr[i]+" "+arr[j]);
                    found = true;
                }
            }
        }
        if (!found)
            System.out.println("No pair found");
        scan.close();
    }
}