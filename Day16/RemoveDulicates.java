package Day16;
import java.util.Scanner;
public class RemoveDulicates {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt();
        
        System.out.println("The array after removing the duplicate elements is: ");
        for(int i=0;i<n;i++){
            boolean isDuplicate = false;

            for(int j=0;j<i;j++){
                if (arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                System.out.print(arr[i]+" ");
            }
        }
        scan.close();
    }
}