package Day14;
import java.util.Scanner;
public class FrequencyArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        System.out.print("Enter the element to count the frequency: ");
        int a = scan.nextInt();

        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==a)
                count++;
        }

        if(count==0)
            System.out.println(a+" is not present in the array");
        else
            System.out.println("The frequency of the element "+a+" is "+count);
        scan.close();
    }
}