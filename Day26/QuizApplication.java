package Day26;
import java.util.Scanner;
public class QuizApplication {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int score = 0;
        int answer;

        //Question 1
        System.out.println("Q1. What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. New Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        System.out.print("Enter your answer: ");
        answer = scan.nextInt();
        if(answer == 2)
            score++;

        //Question 2
        System.out.println("\n Q2. Which is the first programming language?");
        System.out.println("1. Java");
        System.out.println("2. C");
        System.out.println("3. C++");
        System.out.println("4. Python");
        System.out.print("Enter your answer: ");
        answer = scan.nextInt();
        if(answer == 2)
            score++;

        //Question 3
        System.out.println("\n Q3. How many days are there in a week?");
        System.out.println("1. 1");
        System.out.println("2. 5");
        System.out.println("3. 7");
        System.out.println("4. 8");
        System.out.print("Enter your answer: ");
        answer = scan.nextInt();
        if(answer == 3)
            score++;

        // Question 4
        System.out.println("\n Q4. Who invented python programming language?");
        System.out.println("1. Mat Harry");
        System.out.println("2. Hary Potter");
        System.out.println("3. Gudo Van Rossum");
        System.out.println("4. Ada Lovelace");
        System.out.print("Enter your answer: ");
        answer = scan.nextInt();
        if(answer == 3)
            score++;

        //Question 5
        System.out.println("Who is know as Iron man in India?");
        System.out.println("1. Sardar Vallabh Bhai Patel");
        System.out.println("2. Mahatma Gandhi");
        System.out.println("3. Narendra Damodar Das Modi");
        System.out.println("4. Pt. Jawaharlal Nehru");
        System.out.print("Enter your answer: ");
        answer = scan.nextInt();
        if(answer == 1)
            score++;

        // Display result
        System.out.println("\nQuiz completed!");
        System.out.println("Your Score: "+score+"/5");

        scan.close();
    }
}