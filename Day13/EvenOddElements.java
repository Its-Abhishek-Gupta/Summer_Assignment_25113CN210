package Day13;
import java.util.Scanner;
public class EvenOddElements {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        int Even=0;
        int Odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)
                Even++;
            else
                Odd++;
        }
        System.out.println("The number of even elements is "+Even+"\n"+"The numbewr of odd elements is "+Odd);
        scan.close();
    }
}