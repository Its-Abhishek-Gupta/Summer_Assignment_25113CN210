package Day16;
import java.util.Scanner;
public class MaxFrequencyElement {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        int maxFreq = 0;
        int maxElement = arr[0];

        for(int i=0;i<n;i++){
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[j] == arr[i])
                    count++;
            }
            if (count>maxFreq){
                maxFreq = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Element with maximum frequency is "+maxElement+" having frequency "+maxFreq);
        scan.close();
    }
}