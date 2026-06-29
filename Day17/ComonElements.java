package Day17;
import java.util.Scanner;
public class ComonElements {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array 1: ");
        int n1 = scan.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter the elements of the array 1: ");
        for(int i=0;i<n1;i++)
            arr1[i]=scan.nextInt();

        System.out.print("Enter the size of the array 2: ");
        int n2 = scan.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter the elements of the array 2: ");
        for(int i=0;i<n2;i++)
            arr2[i]=scan.nextInt();

        System.out.println("The common elements is: ");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j])
                    System.out.print(arr1[i]+" ");
            }
        }
        scan.close();
    }
}