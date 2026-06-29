package Day15;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        int[] rev = new int[n];

        for (int i=0;i<n;i++){
            rev[i] = arr[n-1-i];
        }

        System.out.println("The reversed array is: ");
        for (int i=0;i<n;i++){
            System.out.print(rev[i]+" ");
        }
        scan.close();
    }
}