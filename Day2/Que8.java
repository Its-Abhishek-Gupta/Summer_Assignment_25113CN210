import java.util.Scanner;
public class Que8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number to  check pallindrome:");
        int n = scan.nextInt();

        int reverse=0;
        int r;
        int n1=n;

        while(n1>0){
            r=n1%10;
            reverse=reverse*10+r;
            n1=n1/10;
        }
        if(n==reverse){
            System.out.println(n+" is pallindrome");
        }
        else{
            System.out.println(n+" is not pallindrome");
        }
        scan.close();
    }
}