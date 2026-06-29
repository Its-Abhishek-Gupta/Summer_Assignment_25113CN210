package Day25;
import java.util.Scanner;
public class SortNamesAlphabetically {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of names:");
        int n = scan.nextInt();

        String[] names  = new String[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the name "+(i+1)+" : ");
            names[i] = scan.next();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(names[i].compareTo(names[j])>0){
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("The names sorted in alphabetical order is: ");
        for(int i=0;i<n;i++){
            System.out.print(names[i]+" ");
        }
        scan.close();
    }
}