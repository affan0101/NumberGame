import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int min_range=1;
        int max_range=100;
        int max_attempt=10;
        int score=0;
        boolean playAgain=true;
        while(playAgain){
            int guessingNumber=r.nextInt(max_range-min_range+1)+min_range;
            System.out.println("Welcome to the Number Guessing Game .......");
            System.out.println("Choose a number between "+min_range+" and "+ max_range);
            int attempt=0;
            while(attempt<max_attempt){
                System.out.println("Enter guess number...");
                int guessNum=sc.nextInt();
                attempt++;
                if (guessNum<guessingNumber){
                    System.out.println("Too low... Try Again..");
                } else if (guessNum>guessingNumber) {
                    System.out.println("Too high... Try Again..");
                }
                else {
                    System.out.println("Coungratulation! You guessed correct number "+guessingNumber+" in "+ attempt+" attempt");
                    score+=max_attempt=attempt+1;
                    break;
                }
            }
            if (attempt==max_attempt){
                System.out.println("You have reached the maximum attempt . The correct number is "+guessingNumber);
            }
            System.out.println(" Do you want to play aggain ? Answer in yes/no");
            String playAgainRequest= sc.next().toLowerCase();
            playAgain= playAgainRequest.equals("yes");
        }
        System.out.println("Thanks for Playing .. ");
        System.out.println("Your total score is : "+score);
    }
}
