package Day17;
import java.util.Scanner;
public class MergeArrays {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array 1: ");
        int n1 = scan.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter the elements of the array 1: ");
        for(int i=0;i<n1;i++){
            arr1[i]=scan.nextInt();
        }

        System.out.print("Enter the size of the array 2: ");
        int n2 = scan.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of  the array 2: ");
        for(int i=0;i<n2;i++){
            arr2[i]=scan.nextInt();
        }

        int[] merge = new int[n1+n2];

        for(int i=0;i<n1;i++)
            merge[i] = arr1[i];
        for(int i=n1;i<n1+n2;i++)
            merge[i]=arr2[i-n1];

        System.out.println("The array 1 is: ");
        for(int i=0;i<n1;i++)
            System.out.print(arr1[i]+" ");
        System.out.println("\n"+"The array 2 is: ");
        for(int i=0;i<n2;i++)
            System.out.print(arr2[i]+" ");
        System.out.println("\n"+"The merged array is: ");
        for(int i=0;i<(n1+n2);i++)
            System.out.print(merge[i]+" ");
        scan.close();
    }
}