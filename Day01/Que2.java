package Day01;
import java.util.Scanner;
public class Que2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Input the required number to print the table:");
        int n = scan.nextInt();

        int i;
        for(i=1;i<=10;i++){
            int c = n*i;
            System.out.println(n+" * "+i+" = "+c);
        }
        scan.close();
    }
}