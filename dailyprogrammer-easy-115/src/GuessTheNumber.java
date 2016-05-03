import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by wallacekwan on 2016-05-02.
 */

// https://www.reddit.com/r/dailyprogrammer/comments/15ul7q/122013_challenge_115_easy_guessthatnumber_game/

public class GuessTheNumber {

    public static void main(String[] args) {

        int num;
        int guess = -1;
        int max = 100;
        int min = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Guess that number game!");

        System.out.println("A number will be chosen between 1 and 100, either enter a guess or 'exit' to quit");

        Random r = new Random();
        num = r.nextInt(max - min) + min;
        System.out.println(num);

        do {

            try {
                guess = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid guess, enter an integer");
                input.nextLine();
            }

            if (guess == num) {
                System.out.println("Correct");
            }
            else if (guess < num) {
                System.out.println("Higher");
            }
            else if (guess > num) {
                System.out.println("Lower");
            }

        } while (guess != num);

        System.exit(0);



    }

}
