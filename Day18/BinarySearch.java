package Day18;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();

        System.out.print("Enter the element to be searched: ");
        int se = scan.nextInt();

        int l=0 ; int u = n-1; int m = (l+u)/2;

        while(l<=u && arr[m]!=se){
            if(se<arr[m])
                u=m-1;
            else
                l=m+1;
            m=(l+u)/2;
        }
        if (se == arr[m])
            System.out.println("The element is present at the position "+(m+1));
        else
            System.out.println("The element is not present int the array: ");
        scan.close();
    }
}