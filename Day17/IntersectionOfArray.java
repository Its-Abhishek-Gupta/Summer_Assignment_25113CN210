package Day17;
import java.util.Scanner;
public class IntersectionOfArray {
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

        int[] intersect = new int[n1+n2];
        int k = 0;

        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j]){
                    intersect[k]=arr1[i];
                    k++;
                }
            }
        }
        System.out.println("The intersection of both the arrays is: ");
        for(int i=0;i<k;i++)
            System.out.print(intersect[i]+" ");
        scan.close();
    }
}