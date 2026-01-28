import java.util.Scanner;
import java.util.Random;
public class NumberGame{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int maxAttempts=5;
        String playAgain="yes";
        while(playAgain.equalsIgnoreCase("yes")){
            int numberToGuess=ran.nextInt(100)+1;
            int attempts=0;
            int userGuess=0;
            System.out.println("A number between 1 to 100 has been generated.Try to guess it!");
            while(userGuess != numberToGuess && attempts<maxAttempts){
                System.out.println("Enter your guess:");
                userGuess=sc.nextInt();
                attempts++;
                if(userGuess<numberToGuess){
                   System.out.println("Too low! Try again.");
                }else if(userGuess>numberToGuess){
                   System.out.println("Too high! Try again.");
                }else{
                   System.out.println("Congratulations! You guessed it right.");
                }
            }
            if(userGuess != numberToGuess){
                System.out.println("Sorry! You used all attempts.");
                System.out.println("The number was " + numberToGuess);
            }else{
                int score=maxAttempts-attempts+1;
                System.out.println("Your score for this round: " + score);
            }
            System.out.println("Do you want play this again? (yes/no): ");
            playAgain=sc.next();
        }
        sc.close();
        System.out.println("Thank you for playing!");
    }
}