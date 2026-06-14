package Day14;
import java.util.Scanner;
public class DuplicateElements {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int c =  0;
        for (int i=0;i<n;i++){
            boolean isDuplicate = false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    System.out.println("The element "+arr[j]+" is duplicate");
                    isDuplicate = true;
                    break;
                }
            }
            if(isDuplicate)
                c++;
        }
        System.out.println("The number of duplicate elements in the array is "+c);
        scan.close();
    }
}