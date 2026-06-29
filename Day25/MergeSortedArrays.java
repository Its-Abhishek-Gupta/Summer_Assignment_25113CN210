package Day25;
import java.util.Scanner;
public class MergeSortedArrays {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n1 = scan.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter the elements of the first array: ");
        for(int i=0;i<n1;i++)
            arr1[i] = scan.nextInt();

        System.out.print("Enter the size of the second array: ");
        int n2 = scan.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of the second array: ");
        for(int i=0;i<n2;i++)
            arr2[i] = scan.nextInt();

        for(int i=0;i<n1;i++){
            for(int j=0;j<n1-1-i;j++){
                if(arr1[j]>arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }

        System.out.println("The first sorted array is: ");
        for(int i=0;i<n1;i++)
            System.out.print(arr1[i]+" ");
        System.out.println();

        for(int i=0;i<n2;i++){
            for(int j=0;j<n2-1-i;j++){
                if(arr2[j]>arr2[j+1]){
                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }

        System.out.println("The second sorted array is: ");
        for(int i=0;i<n2;i++)
            System.out.print(arr2[i]+" ");
        System.out.println();

        int[] merge = new int[n1+n2];
        
        for(int i=0;i<n1;i++)
            merge[i] = arr1[i];

        for(int i=n1;i<n1+n2;i++)
            merge[i] = arr2[i-n1];

        System.out.println("The merged array is: ");
        for(int i=0;i<n1+n2;i++)
            System.out.print(merge[i]+" ");

        scan.close();
    }
}