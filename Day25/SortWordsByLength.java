package Day25;
import java.util.Scanner;
public class SortWordsByLength {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the sentence to sort the words: ");
        String sentence = scan.nextLine();

        String[] words = sentence.split(" ");

        int l = words.length;
        for(int i=0;i<l;i++){
            for(int j=0;j<l-1-i;j++){
                if(words[j].length() > words[j+1].length()){
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }

        System.out.println("The words sorted according to length are: ");
        for(int i=0;i<l;i++)
            System.out.println(words[i]);

        scan.close();
    }
}