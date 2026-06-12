package Day12;
import java.util.Scanner;
public class FunctionArmstrong {
    static int arms(int n){
        int n1 = n;
        int d = 0;
        while(n1>0){
            n1=n1/10;
            d++;
        }
        n1 = n;
        int arm = 0;
        while(n1>0){
            int r = n1%10;
            arm += Math.pow(r,d);
            n1 = n1/10;
        }
        if(arm == n)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the nummber to check whether it is armstrong or not: ");
        int n = scan.nextInt();

        int c = arms(n);
        if(c==1)
            System.out.println(n+" is armstrong number");
        else
            System.out.println(n+" is not a armstrong number");
        scan.close();
    }
}