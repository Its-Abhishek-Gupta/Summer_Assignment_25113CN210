import java.util.Scanner;

public class Que10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the range of the numbers to find the prime numbers");
        int lower = scan.nextInt();
        int upper = scan.nextInt();

        for (int i=lower;i<=upper;i++){
            int c=0;
            for(int j=2;j<i;j++){
                if(i%j==0)
                        c++;
            }
            if(c==0)
                    System.out.println(i+" is prime number");
        }
        scan.close();
    }
}