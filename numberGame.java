import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main (String[] args){
        // generate a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;
        // output for testing
        System.out.println(number);

        Scanner in = new Scanner (System.in);
        
        System.out.println("I'm thinking of a number between 1 and 100 \n(including both). Can you guess what it is?");
        System.out.print("Guess a number: ");
        guess = in.nextInt();
        System.out.printf("\nYour guess is: %d", guess);
        System.out.printf("\nThe number I was thinking of is: %d", number);
        System.out.printf("\nYou were off by: %d", (guess - number));




    }
}
