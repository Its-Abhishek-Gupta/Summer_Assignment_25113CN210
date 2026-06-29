package Day04;
import java.util.Scanner;
public class Armstrong_Number_Range {
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the range of numbers: lower limit and upper limit");
         int l = scan.nextInt();
         int u = scan.nextInt();

         for(int i=l;i<=u;i++){
            int n1 = i;
            int d = 0;
            while(n1>0){
                n1=n1/10;
                d++;
            }
            n1 = i;
            int sum = 0;
            while(n1>0){
                int r = n1%10;
                sum += Math.pow(r, d);
                n1 = n1/10;
            }
            if (i==sum)
                    System.out.println(i+" is armstrong number");
         }
         scan.close();
    }    
}