package Day24;
import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the desired sentece: ");
        String sentence = scan.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        for(int i=0;i<words.length;i++){
            if(words[i].length()>longestWord.length())
                longestWord = words[i];
        }
        System.out.println("Longest word : "+longestWord);
        System.out.println("Length: "+longestWord.length());
        scan.close();
    }
}