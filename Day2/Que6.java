import java.util.Scanner;

public class Que6 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input the number to find the reverse : ");
        int n = scan.nextInt();

        int reverse = 0;
        int r;
        int n1 = n;
        while (n1>0){
            r=n1%10;
            reverse = reverse*10+r;
            n1=n1/10;
        }
        System.out.println("The reverse of the number "+n+" is "+reverse);
        scan.close();
    }    
}